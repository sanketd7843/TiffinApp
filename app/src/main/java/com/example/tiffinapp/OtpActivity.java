package com.example.tiffinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtpActivity extends AppCompatActivity {


    Button VerifyOtpButton, SignupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        VerifyOtpButton = findViewById(R.id.VerifyOtpButton);
        SignupButton = findViewById(R.id.SignUpButtonOtpPage);

        VerifyOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verifyOtp = new Intent(OtpActivity.this, DashboardActivity.class);
                startActivity(verifyOtp);
            }
        });

        SignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verifyOtp = new Intent(OtpActivity.this, SignupActivity.class);
                startActivity(verifyOtp);
            }
        });
    }
}