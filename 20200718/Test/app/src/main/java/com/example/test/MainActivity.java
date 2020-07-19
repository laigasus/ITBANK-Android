package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id, pw;
    Button reg;
    CheckBox agree1;
    CheckBox agree2;

    RadioGroup human;
    RadioButton man;
    RadioButton woman;
    Switch autoCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=(EditText)findViewById(R.id.ID);
        pw=(EditText)findViewById(R.id.PW);
        agree1 = (CheckBox)findViewById(R.id.agree1);
        agree2 = (CheckBox)findViewById(R.id.agree2);
        autoCheck=(Switch)findViewById(R.id.autoCheck);
        man=(RadioButton)findViewById(R.id.man);
        woman=(RadioButton)findViewById(R.id.woman);

        reg=(Button)findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loginId = id.getText().toString();
                String loginPw = pw.getText().toString();

                if(loginId.isEmpty()||loginPw.isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "ID 와 PW를 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                }
                else if(!agree1.isChecked()) {
                    Toast.makeText(getApplicationContext(),
                            "개인 정보 동의1 필요",
                            Toast.LENGTH_SHORT).show();
                }
                else if(!agree2.isChecked()) {
                    Toast.makeText(getApplicationContext(),
                            "개인 정보 동의2 필요",
                            Toast.LENGTH_SHORT).show();
                }
                else if( !( man.isChecked() || woman.isChecked() ) )  {
                    Toast.makeText(getApplicationContext(),
                            "성별 입력",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "ID: "+loginId+", PW: "+loginPw+"입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}