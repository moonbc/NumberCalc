package com.moonbc.numbercalc;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {
	int value =0;
	TextView mTimeCount;
	
	Button mNumber1Button;
	Button mNumber2Button;
	Button mNumber3Button;
	Button mNumber4Button;
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_game);
		
		mTimeCount = (TextView)findViewById(R.id.time_counter_text);
		mHandler.sendEmptyMessage(0);
		
		
		mNumber1Button = (Button)findViewById(R.id.number1_button);
		
		
		mNumber1Button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//mNumber1Button.setBackgroundColor(Color.BLUE);

				mNumber1Button.setEnabled(false);
				Toast.makeText(getApplicationContext(), "button1", Toast.LENGTH_LONG).show();
			}
		});		
			
	
	}
	Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			value++;
			
			
			mTimeCount.setText(String.valueOf(value));
			mHandler.sendEmptyMessageDelayed(0, 1000);
		}
	};
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "back key", Toast.LENGTH_SHORT).show();
		super.onBackPressed();
	}
}
