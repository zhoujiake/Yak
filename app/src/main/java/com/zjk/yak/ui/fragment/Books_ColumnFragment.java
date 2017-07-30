package com.zjk.yak.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;


public class Books_ColumnFragment extends Fragment {
    private static Books_ColumnFragment instance=null;
    public static Books_ColumnFragment newInstance() {
        if(instance==null){
            instance= new Books_ColumnFragment();
        }
        return instance;
    }
    public Books_ColumnFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fg_books_co, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("专栏");
        Log.e("HEHE", "专栏");

        return view;
    }


}
