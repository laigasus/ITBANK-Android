package com.chapter04.a04activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnnewact;
    RadioButton second;
    RadioButton third;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnewact = (Button) findViewById(R.id.btnnewact);
        second = (RadioButton) findViewById(R.id.second);
        third = (RadioButton) findViewById(R.id.third);



        btnnewact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (second.isChecked()) {
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                } else if (third.isChecked()) {
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "액티비티를 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}