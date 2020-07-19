package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);

        final View.OnClickListener listener=new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch(view.getId())
                {
                    case R.id.button1:
                        Toast.makeText(getApplicationContext(),
                                "버튼 1 선택", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button2:
                        Toast.makeText(getApplicationContext(),
                                "버튼 2 선택", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button3:
                        Toast.makeText(getApplicationContext(),
                                "버튼 3 선택", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setOnClickListener(listener);
                btn2.setOnClickListener(listener);
                btn3.setOnClickListener(listener);
            }
        });
    }
}