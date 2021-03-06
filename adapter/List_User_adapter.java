package com.example.adapter;

import java.util.List;

import com.example.easy_shop.R;
import com.example.model.Register_Model.Data;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class List_User_adapter extends BaseAdapter {
	private Context context;

	private Context mContext;
	private List<Data> dataList;

	public List_User_adapter(Context context, List<Data> dataList) {
		mContext = context;
		this.dataList = dataList;
	}

	@Override
	public int getCount() {
		return dataList.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder = null;
		if (convertView != null) {
			holder = (Holder) convertView.getTag();
		} else {
			convertView = View.inflate(mContext, R.layout.list_manage_adapter, null);
			holder = new Holder();
			holder.shop_name = (TextView) convertView.findViewById(R.id.shop_name);

			convertView.setTag(holder);

		}

		Data prod = dataList.get(position);
		holder.shop_name.setText(prod.getUser_name());

		return convertView;
	}

	class Holder {
		TextView shop_name;

	}

}
