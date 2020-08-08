package com.sjb.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.sjb.chat.db.DBConnAsync;
import java.util.concurrent.ExecutionException;

public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.loginActivity_edittext_email);
        password = (EditText)findViewById(R.id.loginActivity_edittext_password);

        login = (Button)findViewById(R.id.loginActivity_button_login);
        signup = (Button)findViewById(R.id.loginActivity_button_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginEvent();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });
    }
    void loginEvent(){
        DBConnAsync dbConnAsync = new DBConnAsync();
        String result = null;
        try {
            String myemail = email.getText().toString();
            result = dbConnAsync.execute("login",
                    "email="+email.getText().toString()+ "&password="
                            + password.getText().toString()).get();
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

            if(!result.isEmpty()) {
                if(result.equals("로그인 성공")) {
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                    MyemailSingleton.getInstance().setMyemail(myemail);

                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

                }
            }

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}