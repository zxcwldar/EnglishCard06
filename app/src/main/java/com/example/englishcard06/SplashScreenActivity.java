package com.example.englishcard06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.englishcard06.activity.MainActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         new Timer().schedule(new TimerTask() {
             @Override
             public void run() {
                 startActivity( new Intent(getApplicationContext() , MainActivity.class));
             }
         },5000);
    }
}