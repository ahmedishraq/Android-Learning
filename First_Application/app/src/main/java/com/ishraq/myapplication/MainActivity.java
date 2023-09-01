package com.ishraq.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button register;
    TextView credentials;
    String person;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Title of the Application
        getSupportActionBar().setTitle("Tax Management System");

        username = findViewById(R.id.usernamePT);
        password = findViewById(R.id.passwordP);
        register = findViewById(R.id.registerB);
        credentials = findViewById(R.id.credentialsTV);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                person = username.getText().toString();
                credentials.setText("Username: "+person);
            }
        });

    }
}