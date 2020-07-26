package com.chapter04.a02dialogbox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    View dialogView;
    EditText dlgEdtName, dlgEdtEmail;
    TextView nameTv, emailTv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        nameTv = (TextView) findViewById(R.id.textname);
        emailTv = (TextView) findViewById(R.id.textemail);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(
                        getApplicationContext(),
                        R.layout.dialog1,
                        null);

                AlertDialog.Builder dlg =
                        new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다.");

                dlg.setIcon(R.mipmap.ic_launcher_round);

                dlg.setView(dialogView);

                dlg.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dlgEdtName = (EditText) dialogView.findViewById(R.id.editname);
                                dlgEdtEmail = (EditText) dialogView.findViewById(R.id.editemail);

                                nameTv.setText(dlgEdtName.getText().toString());
                                emailTv.setText(dlgEdtEmail.getText().toString());

                            }
                        });
                dlg.show();
            }
        });

    }
}
