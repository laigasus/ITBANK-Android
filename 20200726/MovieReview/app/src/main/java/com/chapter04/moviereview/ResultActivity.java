package com.chapter04.moviereview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    int max;
    RatingBar rbar[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");

        TextView tv[] = new TextView[imageName.length];
        rbar = new RatingBar[imageName.length];

        Integer tvID[] = { R.id.tv1, R.id.tv2, R.id.tv3};
        Integer rbarID[] = { R.id.rbar1, R.id.rbar2, R.id.rbar3};

        for (int i = 0; i < voteResult.length; i++) {
            tv[i] = (TextView) findViewById(tvID[i]);
            rbar[i] = (RatingBar) findViewById(rbarID[i]);
        }

        for (int i = 0; i < voteResult.length; i++) {
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }
        max=0;



        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(rbar[0].getRating()>rbar[1].getRating() || rbar[0].getRating()>rbar[2].getRating()) {
                    max=0;
                } else if(rbar[1].getRating()>rbar[0].getRating() || rbar[1].getRating()>rbar[2].getRating()) {
                    max=1;
                } else if(rbar[2].getRating()>rbar[0].getRating() || rbar[2].getRating()>rbar[1].getRating()) {
                    max=2;
                }

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", ""+max);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}
