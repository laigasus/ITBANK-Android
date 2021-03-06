package com.example.a2appcompatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextId, editTextPw;
    Button btnLogin, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextId = (EditText)findViewById(R.id.edit1);
        editTextPw = (EditText)findViewById(R.id.edit2);
        btnLogin = (Button)findViewById(R.id.loginbtn);
        btnRegister = (Button)findViewById(R.id.registerbtn);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loginId = editTextId.getText().toString();
                String loginPw = editTextPw.getText().toString();

                switch(view.getId()) {
                    case R.id.loginbtn:
                        Toast.makeText(getApplicationContext(),
                                loginId+"와 "+ loginPw+"로 로그인",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.registerbtn:
                        Toast.makeText(getApplicationContext(),
                                loginId+"와 "+ loginPw+"로 회원가입",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        btnLogin.setOnClickListener(listener);
        btnRegister.setOnClickListener(listener);

    }
}