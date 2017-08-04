package com.zjk.yak.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/**
 * Created by 13070 on 2017/8/3.
 */

public class SourcePanel extends GridView {

    public SourcePanel(Context context) {

        super(context);

    }


    public SourcePanel(Context context, AttributeSet attrs) {

        super(context, attrs);

    }


    public SourcePanel(Context context, AttributeSet attrs, int  defStyle) {

        super(context, attrs, defStyle);

    }

    @Override
       protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpaec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
               super.onMeasure(widthMeasureSpec, expandSpaec);
    }


}

