package com.badlogic.invaders.android;

import android.content.Intent;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.invaders.Invaders;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, BLEDeviceScanActivity.class);
		startActivity(intent);

		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Invaders(), config);
	}
}
