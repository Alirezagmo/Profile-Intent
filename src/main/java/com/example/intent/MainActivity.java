package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static  final String Key_EDT_NAME = "Key_EDT_NAME";
    public static  final String Key_EDT_FAMILY = "Key_EDT_FAMILY";
    public static  final String Key_EDT_AGE = "Key_EDT_AGE";
    public static  final String Key_EDT_PROFILE = "Key_EDT_PROFILE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProfileData profileData = new ProfileData();

        profileData.setName("alireza");
        profileData.setFamily("Abdi");
        profileData.setAddress("Arak");
        profileData.setCity("12");
        profileData.setAge("23");
        profileData.setCountry("Iran");



    }
}