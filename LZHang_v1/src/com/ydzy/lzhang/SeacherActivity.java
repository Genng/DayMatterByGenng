package com.ydzy.lzhang;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SeacherActivity extends Activity {

	private TextView title_tx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_seacher);
		title_tx=(TextView)findViewById(R.id.head_tx);
		title_tx.setText(R.string.tab_item_tx_2);
	}
}
