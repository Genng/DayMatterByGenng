package com.ydzy.lzhang;


import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * 我的界面
 * @author Genng
 *
 */
public class MainActivity extends TabActivity implements OnClickListener{

	private TabHost tabhost;
    private Intent intent1, intent2, intent3, intent4;
    private int hot;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_index);
		tabhost = getTabHost();
        View tab_view_1=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_2=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_3=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_4=View.inflate(this, R.layout.tabwidget, null);
        ((TextView)tab_view_1.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_1));
        ((ImageView)tab_view_1.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_1);
        intent1 = new Intent(MainActivity.this, IndexActivity.class);
        tabhost.addTab(tabhost.newTabSpec("one")
                .setIndicator(tab_view_1)
                .setContent(intent1));
        
        ((TextView)tab_view_2.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_2));
        ((ImageView)tab_view_2.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_2);
        intent2 = new Intent(MainActivity.this, SeacherActivity.class);
        tabhost.addTab(tabhost.newTabSpec("two")
        		.setIndicator(tab_view_2)
                .setContent(intent2));
        
        ((TextView)tab_view_3.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_3));
        ((ImageView)tab_view_3.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_3);
        intent3 = new Intent(MainActivity.this, MeActivity.class);
        tabhost.addTab(tabhost.newTabSpec("three")
        		.setIndicator(tab_view_3)
                .setContent(intent3));
        
        ((TextView)tab_view_4.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_4));
        ((ImageView)tab_view_4.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_4);
        intent4 = new Intent(MainActivity.this, MoreActivity.class);
        tabhost.addTab(tabhost.newTabSpec("four")
        		.setIndicator(tab_view_4)
                .setContent(intent4));
        
        
	}

	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		System.out.println("---->resta");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
//		 hot=getIntent().getIntExtra("hot", 0);
//		 if(App.hot!=0){
//	        	tabhost.setCurrentTab(2);
//	        	App.hot=0;
//	       }
		System.out.println("---->resume");
	}
	
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
