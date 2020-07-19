package com.example.layout_activityex01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        setContentView(mainLayout, params);


        input=new EditText(this);
        input.setHint("여기에 입력하세요");
        mainLayout.addView(input);


        Button btn=new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        mainLayout.addView(btn);


        TextView output=new TextView(this);
        output.setText("결과");
        mainLayout.addView(output);


        textview=new TextView(this);
        textview.setText("");
        textview.setTextSize(20);
        textview.setTextColor(Color.GREEN);
        mainLayout.addView(textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String inputValue = input.getText().toString();
                textview.setText(inputValue);
            }
        });
    }
}