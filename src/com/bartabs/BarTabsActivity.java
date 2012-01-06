package com.bartabs;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.bartabs.bill.BillActivity;
import com.bartabs.person.PeopleActivity;
import com.bartabs.product.ProductActivity;

public class BarTabsActivity extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, PeopleActivity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("people").setIndicator("People", res.getDrawable(R.drawable.ic_tab_people)).setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, ProductActivity.class);
	    spec = tabHost.newTabSpec("item").setIndicator("Item", res.getDrawable(R.drawable.ic_tab_people)).setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, BillActivity.class);
	    spec = tabHost.newTabSpec("bill").setIndicator("Bill", res.getDrawable(R.drawable.ic_tab_people)).setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}
	
}
