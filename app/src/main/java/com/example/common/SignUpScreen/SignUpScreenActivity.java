
package com.example.common.SignUpScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.common.HomeScreen.HomeScreenActivity;
import com.example.common.R;
import com.example.common.SignInScreen.SignInScreenActivity;

import retrofit2.Retrofit;

public class SignUpScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        findViewById(R.id.auth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUpScreenActivity.this, SignInScreenActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUpScreenActivity.this, HomeScreenActivity.class);
                startActivity(i);
            }
        });
    }
}