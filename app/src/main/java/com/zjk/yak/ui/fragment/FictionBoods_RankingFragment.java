package com.zjk.yak.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;


public class FictionBoods_RankingFragment extends Fragment {
    private static FictionBoods_RankingFragment instance=null;
    public static FictionBoods_RankingFragment newInstance() {
        if(instance==null){
            instance= new FictionBoods_RankingFragment();
        }
        return instance;
    }
    public FictionBoods_RankingFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods_ra, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("3");
        return view;
    }


}
