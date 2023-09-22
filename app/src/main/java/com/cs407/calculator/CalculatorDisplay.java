package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorDisplay extends AppCompatActivity {

    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_display);
        ans = (TextView) findViewById(R.id.textView);
        Intent intent= getIntent();
        String str= intent.getStringExtra("message");
        ans.setText(str);
    }
}