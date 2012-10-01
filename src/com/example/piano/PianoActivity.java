package com.example.piano;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PianoActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_piano);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_piano, menu);
		return true;
	}
}
