package com.zjk.yak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;


public class Books_RecommendFragment extends Fragment {

    private static Books_RecommendFragment instance=null;
    public static Books_RecommendFragment newInstance() {
        if(instance==null){
            instance= new Books_RecommendFragment();
        }
        return instance;
    }
    public Books_RecommendFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_books_re, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("推荐");
        Log.e("HEHE", "推荐");

        return view;
    }


}
