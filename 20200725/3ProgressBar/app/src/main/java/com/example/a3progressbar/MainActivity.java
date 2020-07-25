package com.example.a3progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button volmax, volmute, ratemax, ratemin;
    SeekBar seekbar;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volmax = (Button) findViewById(R.id.volmax);
        volmute = (Button) findViewById(R.id.volmute);
        ratemax = (Button) findViewById(R.id.ratemax);
        ratemin = (Button) findViewById(R.id.ratemin);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        ratingbar = (RatingBar) findViewById(R.id.ratingbar);

        volmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "현재" + seekbar.getProgress() +
                        "에서 MAX로 변경", Toast.LENGTH_SHORT).show();
                seekbar.setProgress(100);
            }

        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(getApplicationContext(),
                    "현재"+seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        volmute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "현재" + seekbar.getProgress() +
                        "에서 MUTE로 변경", Toast.LENGTH_SHORT).show();
                seekbar.setProgress(0);
            }
        });

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), "현재"+ratingbar.getNumStars(), Toast.LENGTH_SHORT).show();
            }
        });

        ratemax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "현재" + seekbar.getProgress() +
                        "에서 5로 변경", Toast.LENGTH_SHORT).show();
                ratingbar.setRating(5);
            }
        });

        ratemin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "현재" + seekbar.getProgress() +
                        "에서 0로 변경", Toast.LENGTH_SHORT).show();
                ratingbar.setRating(0);
            }
        });
    }
}