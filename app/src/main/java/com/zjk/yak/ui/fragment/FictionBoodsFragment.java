package com.zjk.yak.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zjk.yak.ui.adapter.FictionPagerAdapter;
import com.zjk.yak.R;
import com.zjk.yak.common.ConstantClass;

/**
 * Created by 13070 on 2017/7/9.
 * 小说
 */

public class FictionBoodsFragment extends Fragment{

    public FictionBoodsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods, container, false);

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.fiction_viewpager);
        FictionPagerAdapter viewPagerAdapter = new FictionPagerAdapter(ConstantClass.FRAGMENT_MANAGER);
        viewPagerAdapter.addFragment(FictionBoods_RecommendFragment.newInstance(),view.getResources().getString(R.string.fiction_recommend));//添加Fragment
        viewPagerAdapter.addFragment(FictionBoods_FreeBooksFragment.newInstance(),view.getResources().getString(R.string.fiction_freebooks));
        viewPagerAdapter.addFragment(FictionBoods_RankingFragment.newInstance(), view.getResources().getString(R.string.fiction_column));
        viewPagerAdapter.addFragment(FictionBoods_ClassificationFragment.newInstance(),view.getResources().getString(R.string.fiction_classication));
        mViewPager.setAdapter(viewPagerAdapter);//设置适配器

        TabLayout mTabLayout = (TabLayout) view.findViewById(R.id.fiction_tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.fiction_recommend)));//给TabLayout添加Tab
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.fiction_freebooks)));
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.fiction_column)));
        mTabLayout.addTab(mTabLayout.newTab().setText(view.getResources().getString(R.string.fiction_classication)));
        mTabLayout.setupWithViewPager(mViewPager);//给TabLayout设置关联ViewPager，如果设置了ViewPager，那么ViewPagerAdapter中的getPageTitle()方法返回的就是Tab上的标题
        Log.e("HEHE", "1日狗");
        return view;
    }
}
