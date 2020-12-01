package com.example.tiffinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    Button SignUpButton;
    TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        SignUpButton = findViewById(R.id.SignUpButtonSignupPage);
        backButton = findViewById(R.id.SignUpBackButton);

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otpScreen = new Intent(SignupActivity.this, OtpActivity.class);
                startActivity(otpScreen);
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });


    }
}