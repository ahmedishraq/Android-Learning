package com.ishraq.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button do_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        do_button = findViewById(R.id.domagic);
//
//        do_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                do_button.setBackgroundColor(Color.BLACK);
//            }
//        });
    }
}