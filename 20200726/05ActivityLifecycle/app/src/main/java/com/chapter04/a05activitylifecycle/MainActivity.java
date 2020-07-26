package com.chapter04.a05activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("MainActivity LifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.i("MainActivity LifeCycle", "onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        Log.i("MainActivity LifeCycle", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("MainActivity LifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("MainActivity LifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("MainActivity LifeCycle", "onDestroy");
        super.onDestroy();
    }
}