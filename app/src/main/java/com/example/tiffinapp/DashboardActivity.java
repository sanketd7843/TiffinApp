package com.example.tiffinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    CardView ThirtyDayPackageCard, FifteenDayPackageCard, TwoDayPackageCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_actiivity);

        ThirtyDayPackageCard = findViewById(R.id.ThirtyDayPack);
        FifteenDayPackageCard = findViewById(R.id.FifteenDayPack);
        TwoDayPackageCard = findViewById(R.id.TwoDayPack);

        ThirtyDayPackageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
        FifteenDayPackageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, RewardActivity.class);
                startActivity(i);
            }
        });
        TwoDayPackageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
    }
}