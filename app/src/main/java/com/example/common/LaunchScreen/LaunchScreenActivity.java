package com.example.common.LaunchScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.common.MeetingScreen.MeetingScreenActivity;
import com.example.common.R;

public class LaunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        SharedPreferences sp = getSharedPreferences("prefs", MODE_PRIVATE);

        Intent i = new Intent(LaunchScreenActivity.this, MeetingScreenActivity.class);
        startActivity(i);
    }
}