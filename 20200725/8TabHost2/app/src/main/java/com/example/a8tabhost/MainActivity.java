package com.example.a8tabhost;


import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpec1 = tabHost.newTabSpec("탭1").setIndicator("탭1");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);

        TabSpec tabSpec2 = tabHost.newTabSpec("탭2")
                .setIndicator("탭2");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);

        TabSpec tabSpec3 = tabHost.newTabSpec("탭3").setIndicator("탭3");
        tabSpec3.setContent(R.id.tab3);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);
    }
}
