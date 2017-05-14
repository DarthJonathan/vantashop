package com.example.johnnate.vantashop;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

//      After 4 second run the main screen
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Main = new Intent(SplashScreen.this, BaseActivity.class);
                startActivity(Main);
                finish();
            }
        }, 1000);
    }
}
