package com.dao.min2number;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText edtNumberA, edtNumberB;
	private Button btnCompare;
	private TextView txtResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Mapped
		onMapped();
		
		//Catch even when click button
		onClickButton();
	}

	private void onClickButton() {
		btnCompare.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				//Convert EditText to String and continue to Float number
				Float numberA = Float.valueOf(edtNumberA.getText().toString());
				Float numberB = Float.valueOf(edtNumberB.getText().toString());
				
				Float min = 0f;
				
				//Compare 2 number to find min and display it to screen
				if(numberA<numberB){
					min = numberA;
					txtResult.setText(String.valueOf(min));
				}else if(numberA>=numberB){
					min = numberB;
					txtResult.setText(String.valueOf(min));
				}else{//incorrect input
					Toast.makeText(
							MainActivity.this, 
							"Incorrect input, please input again!", 
							Toast.LENGTH_SHORT
					).show();
				}
			}
		});		
	}

	private void onMapped() {
		edtNumberA = (EditText) findViewById(R.id.edtNumberA);
		edtNumberB = (EditText) findViewById(R.id.edtNumberB);
		btnCompare = (Button) findViewById(R.id.btnCompare);
		txtResult = (TextView) findViewById(R.id.txtResult);		
	}
	
}
