package com.zjk.yak.ui.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zjk.yak.R;
import com.zjk.yak.common.ConstantClass;
import com.zjk.yak.ui.action.MainActivity;
import com.zjk.yak.ui.action.PageActivity;

/**
 * Created by 13070 on 2017/7/9.
 * 书架
 */

public class BookshelfFragment extends Fragment {

    public BookshelfFragment(){

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_bookshelf, container, false);
        ImageView book = (ImageView)view.findViewById(R.id.test_page_view);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ConstantClass.MAIN_COMMON_CONTEXT,PageActivity.class);
                ConstantClass.MAIN_COMMON_CONTEXT.startActivity(intent);
            }
        });
        return view;
    }
}
