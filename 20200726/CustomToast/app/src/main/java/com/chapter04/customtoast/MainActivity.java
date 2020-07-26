package com.chapter04.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText contact;
    EditText email;
    Button submit;

    TextView toastTv;
    View toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        contact = (EditText) findViewById(R.id.contact);
        email = (EditText) findViewById(R.id.email);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue=name.getText().toString();
                String contactValue=contact.getText().toString();
                String emailValue=email.getText().toString();


                if(nameValue.isEmpty())
                {
                    //Toast.makeText(getApplicationContext(), "이름 입력", Toast.LENGTH_SHORT).show();
                    useCustomToast("이름 입력");

                }
                else if(contactValue.isEmpty())
                {
                    //Toast.makeText(getApplicationContext(), "연락처 입력", Toast.LENGTH_SHORT).show();
                    useCustomToast("연락처 입력");
                }
                else if(emailValue.isEmpty())
                {
                    //Toast.makeText(getApplicationContext(), "이메일 입력", Toast.LENGTH_SHORT).show();
                    useCustomToast("이메일 입력");
                }
                else
                {
                    //Toast.makeText(getApplicationContext(), "완료", Toast.LENGTH_SHORT).show();
                    useCustomToast("완료");
                }
            }

            public void useCustomToast(String str)
            {
                Toast toast = new Toast(getApplicationContext());

                toastView = (View) View.inflate(
                        getApplicationContext(),
                        R.layout.customtoast, null);

                toastTv=(TextView)toastView.findViewById(R.id.toastText1);
                toastTv.setText(str);

                toast.setView(toastView);
                toast.show();
            }
        });




}
}