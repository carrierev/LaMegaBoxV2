package data.com.lamegaboxv2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import data.com.lamegaboxv2.navigation.CustomDrawerAdapter;
import data.com.lamegaboxv2.navigation.DrawerItem;


public class MainActivity extends Activity {


    public static DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    public static ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    CustomDrawerAdapter adapter;
    private List<DrawerItem> dataList;
    private String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                GravityCompat.START);
        // Add Drawer Item to dataList
        dataList.add(new DrawerItem("Test", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Test2", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Test3", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Test4",
                R.drawable.ic_launcher));
        adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item, dataList);

        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void SelectItem(int position, boolean firstPick) {
        Fragment fragment = null;
        Bundle args = new Bundle();
        switch (position) {
            case 0:
                fragment = new Fragment();
                break;
            case 1:
                fragment = new Fragment();
                break;
            case 2:
                fragment = new Fragment();
                break;
            case 3:
                fragment = new Fragment();
                break;
            default:
                break;
        }
        fragment.setArguments(args);
        FragmentManager frgManager = getFragmentManager();
        if( firstPick == true)
        {
            frgManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            mDrawerList.setItemChecked(position, true);
            setTitle(dataList.get(position).getItemName());
        }
        else if (!frgManager.findFragmentById(R.id.content_frame).getClass().equals(fragment.getClass()))
        {
            frgManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            mDrawerList.setItemChecked(position, true);
            setTitle(dataList.get(position).getItemName());
        }
        mDrawerLayout.closeDrawer(mDrawerList);
    }


    private class DrawerItemClickListener implements
            ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {

            setNavDrawerItemNormal();
            View v = mDrawerList.getChildAt(position);
            TextView txtview = ((TextView) v.findViewById(R.id.drawer_itemName));
            txtview.setTextColor(getResources().getColor(R.color.darkGray));
            SelectItem(position, false);
        }
    }

    /**
     * Repasse toutes les textviews du menu en noir
     */
    public void setNavDrawerItemNormal()
    {
        for (int i=0; i < mDrawerList.getChildCount(); i++)
        {
            View v = mDrawerList.getChildAt(i);
            TextView txtview = ((TextView) v.findViewById(R.id.drawer_itemName));
            txtview.setTextColor(R.color.darkChoco);
        }
    }

}
