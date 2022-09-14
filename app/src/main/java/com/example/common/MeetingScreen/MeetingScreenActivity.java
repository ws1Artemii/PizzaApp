package com.example.common.MeetingScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.common.LaunchScreen.LaunchScreenActivity;
import com.example.common.R;
import com.example.common.SignInScreen.SignInScreenActivity;
import com.example.common.SignUpScreen.SignUpScreenActivity;
import com.example.common.classes.SliderAdapter;

public class MeetingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_screen);

        SliderAdapter adapter = new SliderAdapter(this);
        adapter.addSlide(R.layout.slide1);
        adapter.addSlide(R.layout.slide2);
        adapter.addSlide(R.layout.slide3);

        ViewPager2 vp = findViewById(R.id.viewpager);
        vp.setAdapter(adapter);

        ImageView p1 = findViewById(R.id.p1);
        ImageView p2 = findViewById(R.id.p2);
        ImageView p3 = findViewById(R.id.p3);

        AppCompatButton sb = findViewById(R.id.startb);

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("prefs", MODE_PRIVATE);

                if(sp.getBoolean("firstlaunch", true)) {
                    SharedPreferences.Editor e = sp.edit();
                    e.putBoolean("firstlaunch", false);
                    e.apply();
                    Intent i = new Intent(MeetingScreenActivity.this, SignUpScreenActivity.class);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(MeetingScreenActivity.this, SignInScreenActivity.class);
                    startActivity(i);
                }
            }
        });

        vp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                switch (position) {
                    case 0:
                        p1.setImageDrawable(getDrawable(R.drawable.circlebig));
                        p2.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        p3.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        break;
                    case 1:
                        p2.setImageDrawable(getDrawable(R.drawable.circlebig));
                        p1.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        p3.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        sb.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        p3.setImageDrawable(getDrawable(R.drawable.circlebig));
                        p2.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        p1.setImageDrawable(getDrawable(R.drawable.circlesmall));
                        sb.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }
}