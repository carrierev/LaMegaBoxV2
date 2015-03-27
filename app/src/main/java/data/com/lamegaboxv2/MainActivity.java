package data.com.lamegaboxv2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import data.com.lamegaboxv2.boxes.AskabFragment;
import data.com.lamegaboxv2.boxes.BalignonFragment;
import data.com.lamegaboxv2.boxes.JeanMarieFragment;
import data.com.lamegaboxv2.boxes.LoutreFragment;
import data.com.lamegaboxv2.boxes.MisterMvFragment;
import data.com.lamegaboxv2.boxes.MkFragment;
import data.com.lamegaboxv2.boxes.MoundirFragment;
import data.com.lamegaboxv2.boxes.MovieFragment;
import data.com.lamegaboxv2.boxes.PoubelleFragment;
import data.com.lamegaboxv2.boxes.RoomTabFragment;
import data.com.lamegaboxv2.boxes.TlauFragment;
import data.com.lamegaboxv2.boxes.WilhelmFragment;
import data.com.lamegaboxv2.boxes.YugiFragment;
import data.com.lamegaboxv2.boxes.ZelkysFragment;
import data.com.lamegaboxv2.navigation.CustomDrawerAdapter;
import data.com.lamegaboxv2.navigation.DrawerItem;


public class MainActivity extends ActionBarActivity {


    public static DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    CustomDrawerAdapter adapter;
    public List<DrawerItem> dataList = new ArrayList<>();
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
               GravityCompat.START);
        // Add Drawer Item to dataList
        dataList.add(new DrawerItem("Wilhelm Box", R.drawable.ic_wilhelm));
        dataList.add(new DrawerItem("Balignon Box", R.drawable.ic_balignon));
        dataList.add(new DrawerItem("Moundir Box", R.drawable.ic_moundir));
        dataList.add(new DrawerItem("Poubelle Box", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("1TLAU Box", R.drawable.ic_1tlau));
        dataList.add(new DrawerItem("Askab Box", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Jean Marie Box", R.drawable.ic_jeanmarie));
        dataList.add(new DrawerItem("Movie Box", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Loutre Box", R.drawable.ic_launcher));
        dataList.add(new DrawerItem("Zelkys Box", R.drawable.ic_zelkys));
        dataList.add(new DrawerItem("eLive Box", R.drawable.ic_elive));
        dataList.add(new DrawerItem("Yugi Box", R.drawable.ic_yugi));
        dataList.add(new DrawerItem("MisterMV Box", R.drawable.ic_mv));
        dataList.add(new DrawerItem("The Room Box", R.drawable.ic_tommy_wiseau));
        adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item, dataList);

        mDrawerList.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        mToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mToggle);

        if (savedInstanceState == null)
        {
            SelectItem(0);
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    public void SelectItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new WilhelmFragment();
                break;
            case 1:
                fragment = new BalignonFragment();
                break;
            case 2:
                fragment = new MoundirFragment();
                break;
            case 3:
                fragment = new PoubelleFragment();
                break;
            case 4:
                fragment = new TlauFragment();
                break;
            case 5:
                fragment = new AskabFragment();
                break;
            case 6:
                fragment = new JeanMarieFragment();
                break;
            case 7:
                fragment = new MovieFragment();
                break;
            case 8:
                fragment = new LoutreFragment();
                break;
            case 9:
                fragment = new ZelkysFragment();
                break;
            case 10:
                fragment = new MkFragment();
                break;
            case 11:
                fragment = new YugiFragment();
                break;
            case 12:
                fragment = new MisterMvFragment();
                break;
            case 13:
                fragment = new RoomTabFragment();
                break;
            default:
                break;
        }
        FragmentManager frgManager = getSupportFragmentManager();
        frgManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
        adapter.setmSelectedItem(position);
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    private class DrawerItemClickListener implements
            ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            SelectItem(position);
        }
    }

}
