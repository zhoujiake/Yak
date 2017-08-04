package com.zjk.yak.ui.fragment;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.zjk.yak.ui.adapter.MyAdapter;
import com.zjk.yak.ui.widget.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.zjk.yak.R;
import com.zjk.yak.common.ConstantClass;
import com.zjk.yak.ui.action.PageActivity;

import java.util.ArrayList;

/**
 * Created by 13070 on 2017/7/9.
 * 书架
 */

public class BookshelfFragment extends Fragment {


    private GridView grid_photo;
    private BaseAdapter mAdapter = null;
    private ArrayList<Icon> mData = null;

    public BookshelfFragment(){

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_bookshelf, container, false);
        ImageView book = (ImageView) view.findViewById(R.id.book_1);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ConstantClass.MAIN_COMMON_CONTEXT, PageActivity.class);
                ConstantClass.MAIN_COMMON_CONTEXT.startActivity(intent);
            }
        });

        grid_photo = (GridView) view.findViewById(R.id.grid_photo);

        mData = new ArrayList<Icon>();
        mData.add(new Icon(R.drawable.iv_icon_1, "图标1"));
        mData.add(new Icon(R.drawable.iv_icon_2, "图标2"));
        mData.add(new Icon(R.drawable.iv_icon_3, "图标3"));
        mData.add(new Icon(R.drawable.iv_icon_4, "图标4"));
        mData.add(new Icon(R.drawable.iv_icon_5, "图标5"));
        mData.add(new Icon(R.drawable.iv_icon_6, "图标6"));
        mData.add(new Icon(R.drawable.iv_icon_7, "图标7"));
        mData.add(new Icon(R.drawable.iv_icon_1, "图标1"));
        mData.add(new Icon(R.drawable.iv_icon_2, "图标2"));
        mData.add(new Icon(R.drawable.iv_icon_3, "图标3"));
        mData.add(new Icon(R.drawable.iv_icon_4, "图标4"));
        mData.add(new Icon(R.drawable.iv_icon_5, "图标5"));
        mData.add(new Icon(R.drawable.iv_icon_6, "图标6"));
        mData.add(new Icon(R.drawable.iv_icon_7, "图标7"));
        mData.add(new Icon(R.drawable.iv_icon_1, "图标1"));
        mData.add(new Icon(R.drawable.iv_icon_2, "图标2"));
        mData.add(new Icon(R.drawable.iv_icon_3, "图标3"));
        mData.add(new Icon(R.drawable.iv_icon_4, "图标4"));
        mData.add(new Icon(R.drawable.iv_icon_5, "图标5"));
        mData.add(new Icon(R.drawable.iv_icon_6, "图标6"));
        mData.add(new Icon(R.drawable.iv_icon_7, "图标7"));

        mAdapter = new MyAdapter<Icon>(mData, R.layout.item_grid_icon) {
            @Override
            public void bindView(MyAdapter.ViewHolder holder, Icon obj) {
                holder.setImageResource(R.id.img_icon, obj.getiId());
                holder.setText(R.id.txt_icon, obj.getiName());
            }
        };
        grid_photo.setAdapter(mAdapter);
        grid_photo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ConstantClass.MAIN_COMMON_CONTEXT, "你点击了~" + position + "~项", Toast.LENGTH_SHORT).show();
            }
        });
        grid_photo.setFocusable(false);

        return view;
    }
}
