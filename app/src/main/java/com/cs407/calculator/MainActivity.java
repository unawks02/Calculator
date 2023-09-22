package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        EditText num1 = (EditText) findViewById(R.id.enter1);
        EditText num2 = (EditText) findViewById(R.id.enter2);
        String first = num1.getText().toString();
        String second = num2.getText().toString();

        //check if ints
        try {
            int one = Integer.parseInt(first);
            int two = Integer.parseInt(second);

            int answer = (one + two);
            goToActivity(String.valueOf(answer));
        }
        catch (NumberFormatException ex){
            Toast.makeText(MainActivity.this, "Input must be int", Toast.LENGTH_LONG).show();
        }
    }

    public void clickSub(View view){
        EditText num1 = (EditText) findViewById(R.id.enter1);
        EditText num2 = (EditText) findViewById(R.id.enter2);
        String first = num1.getText().toString();
        String second = num2.getText().toString();

        //check if ints
        try {
            int one = Integer.parseInt(first);
            int two = Integer.parseInt(second);

            int answer = (one - two);
            goToActivity(String.valueOf(answer));
        }
        catch (NumberFormatException ex){
            Toast.makeText(MainActivity.this, "Input must be int", Toast.LENGTH_LONG).show();
        }
    }

    public void clickMul(View view){
        EditText num1 = (EditText) findViewById(R.id.enter1);
        EditText num2 = (EditText) findViewById(R.id.enter2);
        String first = num1.getText().toString();
        String second = num2.getText().toString();

        //check if ints
        try {
            int one = Integer.parseInt(first);
            int two = Integer.parseInt(second);

            int answer = (one * two);
            goToActivity(String.valueOf(answer));
        }
        catch (NumberFormatException ex){
            Toast.makeText(MainActivity.this, "Input must be int", Toast.LENGTH_LONG).show();
        }
    }

    public void clickDiv(View view){
        EditText num1 = (EditText) findViewById(R.id.enter1);
        EditText num2 = (EditText) findViewById(R.id.enter2);
        String first = num1.getText().toString();
        String second = num2.getText().toString();

        //check if ints
        try {
            int one = Integer.parseInt(first);
            int two = Integer.parseInt(second);

            double answer = ((double)one / two);
            goToActivity(String.valueOf(answer));
        }
        catch (NumberFormatException ex){
            Toast.makeText(MainActivity.this, "Input must be int", Toast.LENGTH_LONG).show();
        }
        catch (ArithmeticException e){
            Toast.makeText(MainActivity.this, "Can't divide by 0", Toast.LENGTH_LONG).show();
        }
    }
    public void goToActivity(String s){
        Intent intent = new Intent(this, CalculatorDisplay.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}