package com.zjk.yak.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;

/**
 * Created by 13070 on 2017/7/9.
 */

public class FictionBoodsFragment extends Fragment{

    public FictionBoodsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("第三个Fragment");
        Log.e("HEHE", "3日狗");
        return view;
    }
}
