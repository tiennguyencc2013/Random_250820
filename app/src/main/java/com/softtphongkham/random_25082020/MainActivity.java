package com.softtphongkham.random_25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // float number = 1.5f;
        //int result = Math.round(number);
        //Log.d(tag: "BBB", String.valueOf(result));
        double result = Math.random();
        Log.d("BBB", String.valueOf(result));
    }
}