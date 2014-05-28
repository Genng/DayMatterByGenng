package com.ydzy.lzhang;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MoreActivity extends Activity implements OnClickListener{

	private TextView title_tx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_more);
		title_tx=(TextView)findViewById(R.id.head_tx);
		title_tx.setText(R.string.tab_item_tx_4);
		
	}
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		
	}
}
