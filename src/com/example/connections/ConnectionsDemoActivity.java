package com.example.connections;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

public class ConnectionsDemoActivity extends Activity {
	ConnectivityManager connectivity;
	NetworkInfo wifiInfo, mobileInfo;

	TextView textStatus;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Getting the UI
		textStatus = (TextView) findViewById(R.id.textStatus);

		// Setting up the connectivity
		connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		wifiInfo = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		mobileInfo = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

		// Displaying the network info.
		textStatus.append("\n" + wifiInfo.toString());
		textStatus.append("\n \n" + mobileInfo.toString());
	}
}