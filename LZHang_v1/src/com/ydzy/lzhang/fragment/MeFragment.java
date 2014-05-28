package com.ydzy.lzhang.fragment;

import com.ydzy.lzhang.R;
import com.ydzy.lzhang.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class MeFragment extends Fragment {

	private TextView title_tx;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_me, container, false);
		title_tx=(TextView) view.findViewById(R.id.head_tx);
		title_tx.setText(R.string.tab_item_tx_3);
		return view;
	}

}
