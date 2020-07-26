package com.chapter04.moviereview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화 평점");


        final int voteCount[] = new int[3];
        for (int i = 0; i < 3; i++)
            voteCount[i] = 0;

        ImageView image[] = new ImageView[3];

        Integer imageId[] = { R.id.iv1, R.id.iv2, R.id.iv3};

        final String imgName[] = { "살아있다", "반도", "강철비2"};

        for (int i = 0; i < imageId.length; i++) {
            final int index;
            index = i;
            image[index] = (ImageView) findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if(voteCount[index]==5) {
                        Toast.makeText(getApplicationContext(),
                                "투표는 5개까지만 가능",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        voteCount[index]++;
                        Toast.makeText(getApplicationContext(),
                                imgName[index] + ": 총 " + voteCount[index] + " 표",
                                Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }

        Button btnFinish = (Button) findViewById(R.id.btnResult);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity.class);
                intent.putExtra("VoteCount", voteCount);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

    }
}