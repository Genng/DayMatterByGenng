package com.ydzy.lzhang;


import android.R.anim;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;

public class TestActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        
        View tab_view_1=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_2=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_3=View.inflate(this, R.layout.tabwidget, null);
        View tab_view_4=View.inflate(this, R.layout.tabwidget, null);
        
        ((TextView)tab_view_1.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_1));
        ((ImageView)tab_view_1.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_1);
        
        ((TextView)tab_view_2.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_2));
        ((ImageView)tab_view_2.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_2);
        
        ((TextView)tab_view_3.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_3));
        ((ImageView)tab_view_3.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_3);
        
        ((TextView)tab_view_4.findViewById(R.id.tab_tx)).setText(getResources().getString(R.string.tab_item_tx_4));
        ((ImageView)tab_view_4.findViewById(R.id.tab_img)).setImageResource(R.drawable.tab_bt_selector_4);
        tabHost.setup();
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(tab_view_1).setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(tab_view_2).setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(tab_view_3).setContent(R.id.tab3));
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator(tab_view_4).setContent(R.id.tab4));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
}
