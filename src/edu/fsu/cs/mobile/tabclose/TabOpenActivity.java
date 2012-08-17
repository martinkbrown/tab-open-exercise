package edu.fsu.cs.mobile.tabclose;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabOpenActivity extends TabActivity {
    
	TabHost tabHost;
	TabSpec spec;
	Intent tabIntent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tabHost = this.getTabHost();
        
        tabIntent = new Intent(this, NewTab.class);
        spec = tabHost.newTabSpec("test2").setIndicator("Tab 1", null).setContent(tabIntent);
        tabHost.addTab(spec);
    }
}