package com.chapter05.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtNumber;

    Button btnSubmit;

    myDBHelper myHelper;

    SQLiteDatabase sqlDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        edtNumber = (EditText) findViewById(R.id.edtNumber);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        myHelper = new myDBHelper(
                getApplicationContext(),
                "testDB",
                null,
                1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getWritableDatabase();

            }
        });


    }

    public class myDBHelper extends SQLiteOpenHelper {

        public myDBHelper(Context context,
                          String name,
                          SQLiteDatabase.CursorFactory factory,
                          int version) {
            super(context, name, null, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE groupTBL( " +
                    "gName CHAR(20) PRIMARY KEY, " +
                    "gNumber INTEGER);"
            );
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS groupTBL");
            onCreate(db);
        }
    }

    class CustomTask extends AsyncTask<String, Void, String>{
        String sendMsg, receiveMsg;
        @Override
        protected String doInBackground(String... strings){
            try {
                URL url=new URL("http://192.168.0.13:8888/test/test.jsp");
                HttpURLConnection conn=(HttpURLConnection)url.openConnection();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return receiveMsg;
        }
    }

}