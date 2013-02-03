package com.jericho.hellogap;

import org.apache.cordova.DroidGap; 

import android.os.Bundle;

public class HelloGapActivity extends DroidGap {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}
	
}