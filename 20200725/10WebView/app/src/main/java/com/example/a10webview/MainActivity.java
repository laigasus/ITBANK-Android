package com.example.a10webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUrl= (EditText)findViewById(R.id.edtUrl);
        btnGo= (Button) findViewById(R.id.btnGo);
        btnBack= (Button) findViewById(R.id.btnBack);
        web= (WebView) findViewById(R.id.web);

        web.setWebViewClient(new MyWebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        String Blocked;

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl(edtUrl.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });

    }
    class MyWebViewClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);

            if(edtUrl.getText().toString().contains("test"))
            {
                Toast.makeText(getApplicationContext(), "유해한 사이트 입니다", Toast.LENGTH_SHORT).show();
                edtUrl.setText("https://www.naver.com");
                web.loadUrl(edtUrl.getText().toString());
            }

        }
    }

}

