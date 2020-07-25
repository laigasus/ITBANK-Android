package com.example.a3view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    Button btn;
    RadioGroup radioGroup;
    Switch switchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.check1);
        btn = (Button) findViewById(R.id.btn1);
        radioGroup = (RadioGroup) findViewById(R.id.rgroup1);
        switchbtn = (Switch) findViewById(R.id.switchbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()) {
                    Toast.makeText(getApplicationContext(),
                            "체크 되어있습니다.",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "체크 되어있지 않습니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if (i == 1) {
                            Toast.makeText(getApplicationContext(),
                                    "남자",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "여자",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        switchbtn.setOnCheckedChangeListener(
                new Switch.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(
                            CompoundButton compoundButton, boolean b) {
                        if (b) {
                            Toast.makeText(getApplicationContext(),
                                    "켜짐",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "꺼짐",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }
}