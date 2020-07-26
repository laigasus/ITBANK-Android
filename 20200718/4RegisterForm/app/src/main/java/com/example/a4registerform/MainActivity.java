package com.example.a4registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextId, editTextPw;
    CheckBox checkBox1, checkBox2;
    Button registerbtn;
    RadioButton radioButton1, radioButton2;
    Switch switchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextId = (EditText) findViewById(R.id.edit1);
        editTextPw = (EditText) findViewById(R.id.edit2);
        checkBox1 = (CheckBox) findViewById(R.id.check1);
        checkBox2 = (CheckBox) findViewById(R.id.check2);
        radioButton1 = (RadioButton) findViewById(R.id.male);
        radioButton2 = (RadioButton) findViewById(R.id.female);
        switchbtn = (Switch) findViewById(R.id.switchbtn);
        registerbtn = (Button) findViewById(R.id.registerbtn);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String registerId = editTextId.getText().toString();
                String registerPw = editTextPw.getText().toString();

                if (registerId.isEmpty() || registerPw.isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "ID와 PW를 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    if (checkBox1.isChecked() && checkBox2.isChecked() && (radioButton1.isChecked() || radioButton2.isChecked())) {
                        if (switchbtn.isChecked()) {
                            Toast.makeText(getApplicationContext(),
                                    registerId + "," + registerPw + "로 자동로그인 되며 회원가입이 완료 되었습니다.",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    registerId + "," + registerPw + "로 자동로그인 되지 않으며 회원가입이 완료 되었습니다.",
                                    Toast.LENGTH_SHORT).show();
                        }

                    } else {
                        Toast.makeText(getApplicationContext(),
                                "개인 정보 동의1 과 개인 정보 동의2과 성별을 체크해주세요.",
                                Toast.LENGTH_SHORT).show();
                    }
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