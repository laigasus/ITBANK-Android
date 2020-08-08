package com.chapter07.a2fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button switchbtn;
    int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchbtn = (Button) findViewById(R.id.switchbtn);

        Point pt = new Point();
        getWindowManager().getDefaultDisplay().getSize(pt);
        ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay().getSize(pt);
        int width = pt.x;
        int height = pt.y;

        if (height < width) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            Fragment fr1, fr2;
            fr1 = new SampleFragment1();
            fr2 = new SampleFragment2();

            fragmentTransaction.replace(R.id.linear_land1, fr1);
            fragmentTransaction.replace(R.id.linear_land2, fr2);
            fragmentTransaction.commit();
        } else {
            check = 0;
            switchbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    Fragment fr;
                    if (check == 0) {
                        fr = new SampleFragment1();
                        check++;
                    } else {
                        fr = new SampleFragment2();
                        check--;
                    }
                    fragmentTransaction.replace(R.id.linear, fr);
                    fragmentTransaction.commit();
                }
            });
        }

    }
}