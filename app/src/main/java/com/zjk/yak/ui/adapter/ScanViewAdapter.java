package com.zjk.yak.ui.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.zjk.yak.R;

import java.util.List;

public class ScanViewAdapter extends PageAdapter
{
	Context context;
	List<String> items;
	AssetManager am;

	public ScanViewAdapter(Context context, List<String> items)
	{
		this.context = context;
		this.items = items;
		am = context.getAssets();
	}

	public void addContent(View view, int position)
	{
		TextView content = (TextView) view.findViewById(R.id.content);
		TextView tv = (TextView) view.findViewById(R.id.index);
		if ((position - 1) < 0 || (position - 1) >= getCount())
			return;
		content.setText("ད་ལོའི་མ་ཡུམ་དུས་ཆེན་ནམ་ཞིག་རེད་ཨེ་ཤེས་ཐལ།” རིག་པོས་གྲོགས་པོ་ཞིག་ལ་ཁ་པར་བཏང་ནས་སྐད་ཆ་དེ་དྲིས།    ཕ་རོལ་བོས་ཀྱང་མགོ་ལ་ཕྲུག་ཕྲུག་ཅིག་བྱས་ཏེ་འདང་ཞིག་རྒྱག་ཁུལ་བྱས་མོད་ཀླད་པའི་ནང་དུ་སྟོང་བ་ལས་ཅི་ཡང་མེད་པས།   “ཨོ་ཤེས་མ་སོང་ཡ།” ཞེས་བཤད་བྱུང་།     སྤྱིར་རིག་པོས་མ་ཡུམ་དུས་ཆེན་ཞེས་པ་ཞིག་ཡོད་པ་ཕོ་ལོ་སུམ་ཅུར་བུད་རག་བར་ཤེས་མ་མྱོང་ལ།     དེ་ཡང་རྒྱ་མི་སོགས་ལས་ཁུངས་ཀྱི་མི་འགས་ཉིན་དེར་གཞུང་ལས་ཁང་དུ་རང་གི་ཨ་མ་ལ་བརྡ་འཕྲིན་དང་ཁ་པར་བཏང་སྟེ།    རྟེན་འབྲེལ་ཞུ་བཞིན་ཡོད་པ་ཙམ་གྱིས་ཤེས་པ་རེད།   དེ་ནས་བཟུང་ཁོས་ཀྱང་ལོ་རེར་ཆད་ལ་ལོ་རེར་མ་ཆད་པར་མ་ཡུམ་དུས་ཆེན་དུ་ཨ་མར་ཁ་པར་བཏང་སྟེ།    ཁ་ཙམ་གྱིས་རྟེན་འབྲེལ་རེ་ཞུས་པ་ཡིན་མོད།    རྟེན་འབྲེལ་དེ་ཞུ་དགོས་པའི་ལོ་རྒྱུས་སམ་གནས་ལུགས་ཤིག་སེམས་ན་མེད་པར་གྱུར་ན།    རྟེན་འབྲེལ་ནི་རྟེན་འབྲེལ་ཙམ་སྟེ།    ཁ་པར་ལས་ཇི་ལྟར་རྟེན་འབྲེལ་ཞུ་དགོས་མི་ཤེས་པ་དང་།    ཞུས་ཀྱང་ཤིན་ཏུ་བཅོས་མའམ་ཅི་ཟེར་འདི་ཟེར་མེད་པར་གཏོང་འགྲོ་བ་མ་ཟད།    དེ་ནི་སྙིང་བོ་ཆེར་མེད་པའི་ལས་ཤིག་ཏུ་གྱུར་འགྲོ།  དེ་བས་རི་ལུང་ཀྱོག་པོ་ནས་མི་ཚེ་བསྐྱལ་བའི་ཨ་མ་ལ་མཚོན་ནའང་མ་ཡུམ་དུས་ཆེན་ཟེར་བ་ཞིག་ད་ལྟའི་བར་དུ་གོ་མ་མྱོང་བས།   སེམས་འགུལ་ཆེན་པོ་ཐེབས་རྒྱུ་མེད་པར་ཕན་ཚུན་ག་བཤད་འདི་བཤད་མེད་པ་ཞིག་ཡིན་སོང་། གྲོགས་པོས་ཀྱང་ད་ལོའི་མ་ཡུམ་དུས་ཆེན་ནམ་ཞིག་ཡིན་པ་མ་ཤེས་པས་རིག་པོས་དེ་འཕྲལ་སྐད་འཕྲིན་གྱི་ལམ་ནས་མི་འགའ་ལ་དྲིས།     ལ་ལས་ལན་ཅི་ཡང་བཏབ་མ་བྱུང་ལ།  “གངས་བུ་” ཟེར་བའི་དྲ་གྲོགས་དེས་“སྤྱི་ཟླ་ལྔ་བའི་ཚེས་བརྒྱད་ཉིན་རེད།”ཅེས་ལན་ཐོན་བྱུང་།   “བཀའ་དྲིན་ཆེ།” ཞེས་དང་གུས་འདུད་མཚོན་པའི་གཟུགས་རིས་ཤིག་ཕྱིར་བསྐུར།    “ཏུའུ་ཏུའུ།” སྐབས་དེར་སྐད་འཕྲིན་དུ་ཡང་བསྐྱར་འཕྲིན་བརྡ་ཞིག་ཐོན།  ");
		tv.setText(items.get(position - 1));
	}

	public int getCount()
	{
		return items.size();
	}

	public View getView()
	{
		View view = LayoutInflater.from(context).inflate(R.layout.page_item_layout,
				null);
		return view;
	}
}
