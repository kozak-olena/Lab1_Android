package com.example.lab1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAnotherActivity(View view) {
        Intent intent = new Intent(this, Activity2.class);
        String message = "Kozak";
        intent.putExtra("Surname", message);
        startActivity(intent);
    }
}