package com.chapter04.a03activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showbtn;
    TextView toastTv;
    View toastView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showbtn = (Button) findViewById(R.id.showbtn);

        showbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());

                toastView = (View) View.inflate(
                        getApplicationContext(),
                        R.layout.toast1, null);

                toastTv=(TextView)toastView.findViewById(R.id.toastText1);
                toastTv.setText("커스텀한 토스트");

                toast.setView(toastView);
                toast.show();

                Toast tMsg = Toast.makeText(getApplicationContext(), "토스트 연습", Toast.LENGTH_LONG);

                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();

                int xOffset = (int) (Math.random() * display.getWidth());
                int yOffset = (int) (Math.random() * display.getHeight());

                tMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                tMsg.show();
            }
        });
    }
}