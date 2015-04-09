package data.com.lamegaboxv2.boxes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TabWidget;

import java.lang.reflect.Field;


public abstract class FastFragmentTabHost extends Fragment {

	private boolean tabsCanScroll = false; 
	private FragmentTabHost mTabHost;
	private int tabContent;

	public FastFragmentTabHost(int tabContent) {
		this.tabContent = tabContent;
	}
	
	public FastFragmentTabHost(int tabContent, boolean tabsCanScroll) {
		this(tabContent);
		this.tabsCanScroll = tabsCanScroll;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mTabHost = new FragmentTabHost(getActivity());

		mTabHost.setup(getActivity(), getChildFragmentManager(), tabContent);
		this.onAddTabs(mTabHost);
		if (tabsCanScroll) {
			TabWidget tw = (TabWidget) mTabHost.findViewById(android.R.id.tabs);
			LinearLayout ll = (LinearLayout) tw.getParent();
			HorizontalScrollView hs = new HorizontalScrollView(getActivity());
			hs.setLayoutParams(new FrameLayout.LayoutParams(
					FrameLayout.LayoutParams.MATCH_PARENT,
					FrameLayout.LayoutParams.WRAP_CONTENT));
			ll.addView(hs, 0);
			ll.removeView(tw);
			hs.addView(tw);
			hs.setHorizontalScrollBarEnabled(false);
		}
		return mTabHost;
	}
	
	public abstract void onAddTabs(FragmentTabHost tabHost);
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mTabHost = null;
	}

	public FragmentTabHost getTabHost() {
		return mTabHost;
	}

	@Override
	public void onDetach() {
		super.onDetach();
        Field childFragmentManager;
        try {
	        childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");

	    } catch (NoSuchFieldException e) {
	        throw new RuntimeException(e);
	    }
        try {
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);
        }
        catch (IllegalAccessException e) {
	        throw new RuntimeException(e);
	    }

	}
}