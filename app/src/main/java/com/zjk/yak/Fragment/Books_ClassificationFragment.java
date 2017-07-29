package com.zjk.yak.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;

public class Books_ClassificationFragment extends Fragment {
    private View view;
    private SwipeRefreshLayout swipeRefreshLayout;
    private static Books_ClassificationFragment instance=null;
    public static Books_ClassificationFragment newInstance() {
        if(instance==null){
            instance= new Books_ClassificationFragment();
        }
        return instance;
    }
    public Books_ClassificationFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_books_cl, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("分类");
        Log.e("HEHE", "分类");

        return view;
    }
}
