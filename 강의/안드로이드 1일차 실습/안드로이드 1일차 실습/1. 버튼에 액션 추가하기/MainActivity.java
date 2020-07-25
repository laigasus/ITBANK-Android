package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.btn1:
                        Toast.makeText(getApplicationContext(),
                        "버튼1 선택", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.btn2:
                        Toast.makeText(getApplicationContext(),
                        "버튼2 선택", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.btn3:
                        Toast.makeText(getApplicationContext(),
                        "버튼3 선택", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);

    }
}