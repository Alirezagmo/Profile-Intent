package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                splashActivity.this.startActivity(new Intent(splashActivity.this, MainActivity.class));
                finish();

            }
        };

        new Handler().postDelayed(runnable1, 3000);


    }
    }

