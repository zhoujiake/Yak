package com.zjk.yak.ui.adapter;

import android.view.View;

public abstract class PageAdapter
{


	public abstract View getView();

	public abstract int getCount();

	public abstract void addContent(View view, int position);
}
