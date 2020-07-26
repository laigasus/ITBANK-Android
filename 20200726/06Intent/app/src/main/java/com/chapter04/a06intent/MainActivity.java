package com.chapter04.a06intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button newbtn;
    EditText edittext;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {   //onActivityResult 중요
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(MainActivity.this, "Result: " + data.getStringExtra("result"), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newbtn = (Button) findViewById(R.id.newbtn);
        edittext = (EditText) findViewById(R.id.edittext);
        newbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DataActivity.class);
                intent.putExtra("data", edittext.getText().toString());

                //startActivity(intent);
                startActivityForResult(intent, 1);  //데이터를 돌려받고싶을 경우 사용
            }
        });


    }
}