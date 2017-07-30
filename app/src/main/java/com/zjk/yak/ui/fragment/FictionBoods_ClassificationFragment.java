package com.zjk.yak.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zjk.yak.R;

public class FictionBoods_ClassificationFragment extends Fragment {
    private View view;
    private SwipeRefreshLayout swipeRefreshLayout;
    private static FictionBoods_ClassificationFragment instance=null;
    public static FictionBoods_ClassificationFragment newInstance() {
        if(instance==null){
            instance= new FictionBoods_ClassificationFragment();
        }
        return instance;
    }
    public FictionBoods_ClassificationFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_fictionboods_cl, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("4");
        return view;
    }
}
