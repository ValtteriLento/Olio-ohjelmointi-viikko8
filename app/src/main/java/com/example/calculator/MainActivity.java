package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNumber1;
    private EditText editNumber2;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        resultView = findViewById(R.id.resultView);
    }

    public void numberSum(View view) {
        int number1 = Integer.parseInt(editNumber1.getText().toString());
        int number2 = Integer.parseInt(editNumber2.getText().toString());
        int result = number1 + number2;
        resultView.setText(Integer.toString(result));
    }

    public void numberSubversion(View view) {
        int number1 = Integer.parseInt(editNumber1.getText().toString());
        int number2 = Integer.parseInt(editNumber2.getText().toString());
        int result = number1 - number2;
        resultView.setText(Integer.toString(result));
    }

    public void numberMultiplication(View view) {
        int number1 = Integer.parseInt(editNumber1.getText().toString());
        int number2 = Integer.parseInt(editNumber2.getText().toString());
        int result = number1 * number2;
        resultView.setText(Integer.toString(result));
    }

    public void numberDivision(View view) {
        int number1 = Integer.parseInt(editNumber1.getText().toString());
        int number2 = Integer.parseInt(editNumber2.getText().toString());
        int result = number1 / number2;
        resultView.setText(Integer.toString(result));
    }
}