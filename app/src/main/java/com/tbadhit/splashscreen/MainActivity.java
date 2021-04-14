package com.tbadhit.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// 1. buka dokumentasi https://airbnb.io/lottie/#/android
// 2. copy dependenciesnya ke "build.gradle (Module)"  ->
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}