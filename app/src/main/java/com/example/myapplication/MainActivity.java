package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.build_layout);
      TextView textView=(TextView) findViewById(R.id.phone);
      textView.setBackgroundColor(Color.GREEN);
        System.out.println("Heyyyyy");
    }
}
