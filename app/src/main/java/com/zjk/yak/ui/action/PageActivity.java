package com.zjk.yak.ui.action;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.zjk.yak.R;
import com.zjk.yak.ui.adapter.ScanViewAdapter;
import com.zjk.yak.ui.widget.PageView;

import java.util.ArrayList;
import java.util.List;

public class PageActivity extends Activity
{
	PageView scanview;
	ScanViewAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_layout);
		scanview = (PageView) findViewById(R.id.scanview);
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < 8; i++)
			items.add("a" + (i + 1) + " s");
		adapter = new ScanViewAdapter(this, items);
		scanview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
