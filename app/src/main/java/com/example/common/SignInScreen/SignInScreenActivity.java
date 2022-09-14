
package com.example.common.SignInScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.common.HomeScreen.HomeScreenActivity;
import com.example.common.R;
import com.example.common.SignUpScreen.SignUpScreenActivity;

public class SignInScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);

        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignInScreenActivity.this, SignUpScreenActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.auth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignInScreenActivity.this, HomeScreenActivity.class);
                startActivity(i);
            }
        });
    }
}