package com.bartabs.product;

import java.util.Collection;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends Activity {

	private Collection<Product> mItem;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        TextView textview = new TextView(this);
        textview.setText("This is the ProductActivity tab");
        
        setContentView(textview);
	}
}
