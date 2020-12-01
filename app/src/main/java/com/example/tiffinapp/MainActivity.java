package com.example.tiffinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button SignupButton, SendOtpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignupButton = findViewById(R.id.SignUpButton);
        SendOtpButton = findViewById(R.id.SendOtpButton);

        SignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(signUp);
            }
        });

        SendOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendOtp = new Intent(MainActivity.this, OtpActivity.class);
                startActivity(sendOtp);
            }
        });
    }
}