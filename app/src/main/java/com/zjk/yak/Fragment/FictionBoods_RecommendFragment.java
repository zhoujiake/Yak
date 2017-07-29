package com.zjk.yak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.zjk.yak.R;


public class FictionBoods_RecommendFragment extends Fragment {

    private static FictionBoods_RecommendFragment instance=null;
    public static FictionBoods_RecommendFragment newInstance() {
        if(instance==null){
            instance= new FictionBoods_RecommendFragment();
        }
        return instance;
    }
    public FictionBoods_RecommendFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods_re, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("1");
        return view;
    }


}
