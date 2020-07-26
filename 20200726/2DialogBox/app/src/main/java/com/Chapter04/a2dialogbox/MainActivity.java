package com.Chapter04.a2dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    View dialogView;
    EditText editname;
    EditText editemail;
    TextView nameValue;
    TextView emailValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        editname = (EditText) findViewById(R.id.editname);
        editemail = (EditText) findViewById(R.id.editemail);
        nameValue = (TextView) findViewById(R.id.namevalue);
        emailValue = (TextView) findViewById(R.id.emailvalue);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다");
                dlg.setMessage("메시지 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher_round);

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "확인을 누르셨군요", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] movieArray = new String[]{"살아있다", "반도", "강철비2"};

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다");
                //dlg.setMessage("메시지 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher_round);


                dlg.setItems(movieArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface diaologInterface, int i) {
                        Toast.makeText(getApplicationContext(), movieArray[i], Toast.LENGTH_SHORT).show();
                    }
                });

                dlg.show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] movieArray = new String[]{"살아있다", "반도", "강철비2"};

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다");
                //dlg.setMessage("메시지 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher_round);

                dlg.setSingleChoiceItems(movieArray, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), movieArray[i], Toast.LENGTH_SHORT).show();
                    }
                });

                dlg.show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] movieArray = new String[]{"살아있다", "반도", "강철비2"};
                final boolean[] checkArray = new boolean[]{false, true, false};
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다");
                //dlg.setMessage("메시지 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher_round);

                dlg.setMultiChoiceItems(movieArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                    }
                });

                dlg.show();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(getApplicationContext(), R.layout.dialog1, null);


                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("dialog1.xml");
                //dlg.setMessage("메시지 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher_round);

                dlg.setView(dialogView);

                dlg.setPositiveButton("전송",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                nameValue.setText(editname.getText().toString());
                                emailValue.setText(editemail.getText().toString());

                            }
                        });

                dlg.show();
            }
        });


    }
}