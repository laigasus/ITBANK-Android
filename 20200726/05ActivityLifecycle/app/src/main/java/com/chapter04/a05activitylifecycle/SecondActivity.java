package com.chapter04.a05activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    @Override
    protected void onStart() {
        Log.i("SecondActivity LifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.i("SecondActivity LifeCycle", "onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        Log.i("SecondActivity LifeCycle", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("SecondActivity LifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("SecondActivity LifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("SecondActivity LifeCycle", "onDestroy");
        super.onDestroy();
    }
}