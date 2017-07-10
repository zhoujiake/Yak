package com.zjk.yak.action.Adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.zjk.yak.action.BooksFragment;
import com.zjk.yak.action.BookshelfFragment;
import com.zjk.yak.action.ConstantClass;
import com.zjk.yak.action.FictionBoodsFragment;

/**
 * Created by 13070 on 2017/7/9.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    private final int PAGER_COUNT = 3;
    private BookshelfFragment bookshelfFragment = null;
    private BooksFragment booksFragment = null;
    private FictionBoodsFragment fictionBoodsFragment = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        bookshelfFragment = new BookshelfFragment();
        booksFragment = new BooksFragment();
        fictionBoodsFragment = new FictionBoodsFragment();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case ConstantClass.PAGE_ONE:
                fragment = bookshelfFragment;
                break;
            case ConstantClass.PAGE_TWO:
                fragment = booksFragment;
                break;
            case ConstantClass.PAGE_THREE:
                fragment = fictionBoodsFragment;
                break;
        }
        return fragment;
    }
}
