package com.zjk.yak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zjk.yak.R;


public class Books_FreeBooksFragment extends Fragment {

    private static Books_FreeBooksFragment instance=null;
    public static Books_FreeBooksFragment newInstance() {
        if(instance==null){
            instance= new Books_FreeBooksFragment();
        }
        return instance;
    }
    public Books_FreeBooksFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fg_books_fr, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("免费");
        Log.e("HEHE", "免费");

        return view;
    }


}
