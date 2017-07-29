package com.zjk.yak.Action;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.zjk.yak.Adapter.MainPagerAdapter;
import com.zjk.yak.R;
import com.zjk.yak.Utils.ConstantClass;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener
        ,ViewPager.OnPageChangeListener{

    //UI Objects
    private TextView txt_bookshelf;
    private TextView txt_books;
    private TextView txt_fictionboods;
    //viewPager
    private ViewPager vpager;
    //Adapter of ViewPager
    private MainPagerAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //隐藏toolbar的title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //浮动按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        //初始化公共类
        ConstantClass.FRAGMENT_MANAGER = getSupportFragmentManager();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //初始化
        mAdapter = new MainPagerAdapter(ConstantClass.FRAGMENT_MANAGER);
        bindViews();
    }

    /**
     * 绑定视图控件
     */
    private void bindViews() {
        txt_bookshelf = (TextView) findViewById(R.id.bookshelf);
        txt_bookshelf.setOnClickListener(this);
        txt_books = (TextView) findViewById(R.id.books);
        txt_books.setOnClickListener(this);
        txt_fictionboods = (TextView) findViewById(R.id.fictionboods);
        txt_fictionboods.setOnClickListener(this);
        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setOnPageChangeListener(this);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    /**
     * 视图点击监听
     * @param v
     */
    @Override
    public void onClick(View v) {

      switch (v.getId()){
          case R.id.bookshelf:
              vpager.setCurrentItem(ConstantClass.PAGE_ONE);
              Log.e("test_fragment","1");
          break;
          case R.id.books:
              vpager.setCurrentItem(ConstantClass.PAGE_TWO);
              Log.e("test_fragment","2");
              break;
          case R.id.fictionboods:
              vpager.setCurrentItem(ConstantClass.PAGE_THREE);
              Log.e("test_fragment","3");
              break;
      }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case ConstantClass.PAGE_ONE:
                    Log.e("test_fragment","1");
                    txt_bookshelf.setTextColor(this.getResources().getColor(R.color.guid_color));
                    txt_books.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    txt_fictionboods.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    break;
                case ConstantClass.PAGE_TWO:
                    txt_bookshelf.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    txt_books.setTextColor(this.getResources().getColor(R.color.guid_color));
                    txt_fictionboods.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    Log.e("test_fragment","2");
                    break;
                case ConstantClass.PAGE_THREE:
                    txt_bookshelf.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    txt_books.setTextColor(this.getResources().getColor(R.color.guid_color_default));
                    txt_fictionboods.setTextColor(this.getResources().getColor(R.color.guid_color));
                    Log.e("test_fragment","3");
                    break;
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
