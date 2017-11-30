package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String weatherForDay = intent.getStringExtra("weatherForDay");
        TextView weatherForDayTextView = (TextView) findViewById(R.id.tv_weather);
        weatherForDayTextView.setText(weatherForDay);
        // DONE - TODO (2) Display the weather forecast that was passed from MainActivity
    }
}