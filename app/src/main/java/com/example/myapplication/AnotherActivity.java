package com.example.myapplication;

import android.os.Bundle;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aother);
        String buttonNumber = getIntent().getStringExtra("BUTTON_NUMBER");
       // System.out.println("12345");
        TextView textView = findViewById(R.id.textView);
        textView.setText("当前位置 " + buttonNumber);
    }
}
