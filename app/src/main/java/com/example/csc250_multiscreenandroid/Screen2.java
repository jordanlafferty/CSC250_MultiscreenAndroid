package com.example.csc250_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
    TextView nameTV = this.findViewById(R.id.nameTV);
    Intent myIntent = this.getIntent();
    //String name = myIntent.getStringextra("name");

}