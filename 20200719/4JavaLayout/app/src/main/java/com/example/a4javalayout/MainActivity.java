package com.example.a4javalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        mainLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(mainLayout, params);

        editText = new EditText(this);
        editText.setHint("여기에 입력하세요");

        mainLayout.addView(editText);

        button = new Button(this);
        button.setText("버튼입니다");
        button.setBackgroundColor(Color.YELLOW);
        mainLayout.addView(button);

        textView = new TextView(this);
        textView.setText("텍스트뷰입니다.");
        textView.setTextSize(20);
        textView.setTextColor(Color.RED);
        mainLayout.addView(textView);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                textView.setText(editText.getText().toString());
            }
        });


    }

}