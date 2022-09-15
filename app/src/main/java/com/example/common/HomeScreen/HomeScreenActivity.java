package com.example.common.HomeScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.example.common.R;
import com.google.android.material.navigation.NavigationView;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        DrawerLayout dl = findViewById(R.id.drawer_layout);

        findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl.open();
            }
        });
    }
}