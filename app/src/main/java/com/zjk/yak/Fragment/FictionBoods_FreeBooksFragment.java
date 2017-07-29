package com.zjk.yak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;


public class FictionBoods_FreeBooksFragment extends Fragment {

    private static FictionBoods_FreeBooksFragment instance=null;
    public static FictionBoods_FreeBooksFragment newInstance() {
        if(instance==null){
            instance= new FictionBoods_FreeBooksFragment();
        }
        return instance;
    }
    public FictionBoods_FreeBooksFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods_fr, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("2");
        return view;
    }


}
