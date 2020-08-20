package com.mashgames.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Aug18 extends AppCompatActivity {
    private TextView resultTv;
    private EditText num1et;
    private EditText num2et;
    private Button plusButton, minusButton;
    private double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aug18);

        resultTv = findViewById(R.id.result);
        num1et = findViewById(R.id.num1);
        num2et = findViewById(R.id.num2);
        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!num1et.getText().toString().isEmpty())
                    num1 = Integer.parseInt(num1et.getText().toString());
                if (!num2et.getText().toString().isEmpty())
                    num2 = Integer.parseInt(num2et.getText().toString());
                if (num2 == 0) {
                    Toast.makeText(Aug18.this, "Number 2 cant be 0", Toast.LENGTH_LONG).show();
                    resultTv.setText("Result :- " + "Infinity because number 2 cant be 0");
                    return;
                } else {
                    result = Math.pow(num1, num2);
                    resultTv.setText("Result :- " + result);
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!num1et.getText().toString().isEmpty())
                    num1 = Integer.parseInt(num1et.getText().toString());
                if (!num2et.getText().toString().isEmpty())
                    num2 = Integer.parseInt(num2et.getText().toString());
                result = num1 - num2;
                resultTv.setText("Result :- " + result);
            }
        });

    }

}