package com.erwanix.screen;


import com.erwanix.gsb.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AndroidAdvanceSqliteActivity extends Activity implements
		OnClickListener {

	private Button btn_add, btn_view;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn_add = (Button) findViewById(R.id.btn_add);
		btn_view = (Button) findViewById(R.id.btn_view);
		btn_add.setOnClickListener(this);
		btn_view.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_add:
			Intent addintent = new Intent(AndroidAdvanceSqliteActivity.this,
					AddRecord.class);
			startActivity(addintent);
			break;

		case R.id.btn_view:
			Intent viewintent = new Intent(AndroidAdvanceSqliteActivity.this,
					ViewRecord.class);
			startActivity(viewintent);
			break;
		default:
			break;
		}

	}
}

