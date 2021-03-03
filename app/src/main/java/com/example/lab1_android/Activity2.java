package com.example.lab1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle arguments = getIntent().getExtras();
        String parameters = arguments.get("Surname").toString();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Passed parameter: " + parameters);
    }
}