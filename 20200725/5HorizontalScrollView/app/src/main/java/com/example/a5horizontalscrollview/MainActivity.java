package com.example.a5horizontalscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    Button toleft, toright;
    HorizontalScrollView horizontalscrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toleft = (Button) findViewById(R.id.toleft);
        toright = (Button) findViewById(R.id.toright);
        horizontalscrollView = (HorizontalScrollView) findViewById(R.id.horizontalscrollView1);

        toleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horizontalscrollView.fullScroll(ScrollView.FOCUS_LEFT);
            }
        });

        toright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horizontalscrollView.fullScroll(ScrollView.FOCUS_RIGHT);
            }
        });


    }
}