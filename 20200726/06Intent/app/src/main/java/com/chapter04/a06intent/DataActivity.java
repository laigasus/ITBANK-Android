package com.chapter04.a06intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tv;
    Button closebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tv = (TextView) findViewById(R.id.gettextview);
        closebtn=(Button)findViewById(R.id.closebtn);

        Intent intentNew = getIntent();
        String getData = intentNew.getStringExtra("data");

        tv.setText(getData);

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent=new Intent();
                resultIntent.putExtra("result", "asdkhksadh");
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}