package com.tbadhit.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.tbadhit.splashscreen.databinding.ActivitySplashScreenBinding;

// 8. Masuk ke file "activity_splash_screen.xml" di (res/layout/activity_splash_screen.xml) ->
// 12. Bikin binding, caranya masuk ke "build.gradle (Module)" tambahkan kode yang di komen (BINDING) ->
public class SplashScreenActivity extends AppCompatActivity {

    // 15. tambahkan kode di bawah
    private ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 16. Lalu tambahkan ini
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());

        // 17. kode di bawah ini di ganti jadi "setContentView(binding.getRoot());"
        // setContentView(R.layout.activity_splash_screen);
        setContentView(binding.getRoot());

        // 18.
        getSupportActionBar().hide(); // buat ilangin APPBAR nya
        binding.lottieAnimation.setAnimation("AndroidWave.json");

        // 19. kode yang bakal jalanin animasi :
        binding.lottieAnimation.playAnimation();

        // 20. kalo kodenya merah tambahin dlu delayMilisnya (3000)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
        // 21. Setelah membuat code di atas, sekarang masuk ke "AndroidManifest.xml" ->

    }
}