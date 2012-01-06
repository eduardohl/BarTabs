package com.bartabs.bill;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BillActivity extends Activity{

	private Bill mBill;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        TextView textview = new TextView(this);
        textview.setText("This is the BillActivity tab");
        
        setContentView(textview);
	}
	
}
