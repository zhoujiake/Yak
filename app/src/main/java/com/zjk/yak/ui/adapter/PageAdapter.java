package com.zjk.yak.ui.adapter;

import android.view.View;

public abstract class PageAdapter
{

	/**
	 * @return ҳ��view
	 */
	public abstract View getView();

	public abstract int getCount();

	/**
	 * ��������ӵ�view��
	 *
	 * @param view
	 *   �������ݵ�view
	 * @param position
	 *   ��positionҳ
	 */
	public abstract void addContent(View view, int position);
}
