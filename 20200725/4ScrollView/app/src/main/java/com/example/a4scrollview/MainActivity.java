package com.example.a4scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    Button totop, tobottom;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totop = (Button) findViewById(R.id.totop);
        tobottom = (Button) findViewById(R.id.tobottom);
        scrollView = (ScrollView) findViewById(R.id.scrollView1);

        totop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        });

        tobottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });


    }
}