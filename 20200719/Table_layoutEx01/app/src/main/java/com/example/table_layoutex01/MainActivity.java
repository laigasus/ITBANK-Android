package com.example.table_layoutex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn0 = (Button)findViewById(R.id.btn0);
    Button btn1 = (Button)findViewById(R.id.btn1);
    Button btn2 = (Button)findViewById(R.id.btn2);
    Button btn3 = (Button)findViewById(R.id.btn3);
    Button btn4 = (Button)findViewById(R.id.btn4);
    Button btn5 = (Button)findViewById(R.id.btn5);
    Button btn6 = (Button)findViewById(R.id.btn6);
    Button btn7 = (Button)findViewById(R.id.btn7);
    Button btn8 = (Button)findViewById(R.id.btn8);
    Button btn9 = (Button)findViewById(R.id.btn9);
    String strr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override

        public void onClick(View v) {

            btn0.setOnClickListener(listener);
            btn1.setOnClickListener(listener);
            btn2.setOnClickListener(listener);
            btn3.setOnClickListener(listener);
            btn4.setOnClickListener(listener);
            btn5.setOnClickListener(listener);
            btn6.setOnClickListener(listener);
            btn7.setOnClickListener(listener);
            btn8.setOnClickListener(listener);
            btn9.setOnClickListener(listener);

            switch(v.getId()) {
                case R.id.btn0:
                            String inputValue = btn0.getText().toString();
                            strr.setText(inputValue);
                    break;
            }


        }
    };


}