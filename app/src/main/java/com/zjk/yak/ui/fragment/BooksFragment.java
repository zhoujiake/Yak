package com.zjk.yak.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zjk.yak.ui.adapter.BooksPagerAdapter;
import com.zjk.yak.R;
import com.zjk.yak.Utils.ConstantClass;

/**
 * Created by 13070 on 2017/7/9.
 * 书本
 */

public class BooksFragment extends Fragment {

    public BooksFragment(){

    }
    //初始化变量


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_books, container, false);
        bindViews();

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.books_viewpager);
        BooksPagerAdapter viewPagerAdapter = new BooksPagerAdapter(ConstantClass.FRAGMENT_MANAGER);
        viewPagerAdapter.addFragment(Books_RecommendFragment.newInstance(),view.getResources().getString(R.string.books_recommend));//添加Fragment
        viewPagerAdapter.addFragment(Books_FreeBooksFragment.newInstance(),view.getResources().getString(R.string.books_freebooks));
        viewPagerAdapter.addFragment(Books_ColumnFragment.newInstance(), view.getResources().getString(R.string.books_column));
        viewPagerAdapter.addFragment(Books_ClassificationFragment.newInstance(),view.getResources().getString(R.string.books_classication));
        mViewPager.setAdapter(viewPagerAdapter);//设置适配器

        TabLayout mTabLayout = (TabLayout) view.findViewById(R.id.books_tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.books_recommend)));//给TabLayout添加Tab
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.books_freebooks)));
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.books_column)));
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.books_classication)));
        mTabLayout.setupWithViewPager(mViewPager);//给TabLayout设置关联ViewPager，如果设置了ViewPager，那么ViewPagerAdapter中的getPageTitle()方法返回的就是Tab上的标题
        Log.e("HEHE", "1日狗");
        return view;
    }

    /**
     * 初始化视图
     */
    private void bindViews(){


    }
}
