package com.example.asus_pc.myapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValueA;
    private  EditText editTextValueB;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate executed", Toast.LENGTH_SHORT).show();
        editTextValueA = findViewById(R.id.editText_valueA);
        editTextValueB = findViewById(R.id.editText_valueB);
        textViewResult = findViewById(R.id.textViewResult);
    }
/*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy executed", Toast.LENGTH_SHORT).show();
    }*/

    public void calculate(View view) {
        String strValueA = editTextValueA.getText().toString();
        String strValueB = editTextValueB.getText().toString();
        if (TextUtils.isEmpty(strValueA) || TextUtils.isEmpty(strValueB)) {
            Toast.makeText(this, "Ener Both Value", Toast.LENGTH_SHORT).show();
        } else {
            int valueA = Integer.parseInt(editTextValueA.getText().toString());
            int valueB = Integer.parseInt(editTextValueB.getText().toString());
            int result = 0;
            switch (view.getId()) {
                case R.id.button_add:
                    Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show();
                    result = valueA + valueB;
                    break;
                case R.id.button_sub:
                    Toast.makeText(this, "Sub Clicked", Toast.LENGTH_SHORT).show();
                    result = valueA - valueB;
                    break;
                case R.id.button_mul:
                    Toast.makeText(this, "Mul Clicked", Toast.LENGTH_SHORT).show();
                    result = valueA * valueB;
                    break;
                case R.id.button_div:
                    Toast.makeText(this, "Div Clicked", Toast.LENGTH_SHORT).show();
                    result = valueA / valueB;
                    break;
            }
            textViewResult.setText("Result : "+String.valueOf(result));
        }
    }
}
