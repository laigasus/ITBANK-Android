package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentManager fm;
    FragmentTransaction ft;
    Frag1 frag1;
    Frag2 frag2;
    Frag3 frag3;
    Frag4 frag4;
    Frag5 frag5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.item1:
                                setFrag(0);
                                break;
                            case R.id.item2:
                                setFrag(1);
                                break;
                            case R.id.item3:
                                setFrag(2);
                                break;

                            case R.id.item4:
                                setFrag(3);
                                break;

                            case R.id.item5:
                                setFrag(4);
                                break;
                        }
                        return true;
                    }
                });

        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        frag4 = new Frag4();
        frag5 = new Frag5();
        setFrag(0);
    }

    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.mainframe, frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.mainframe, frag2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.mainframe, frag3);
                ft.commit();
                break;

            case 3:
                ft.replace(R.id.mainframe, frag4);
                ft.commit();
                break;

            case 4:
                ft.replace(R.id.mainframe, frag5);
                ft.commit();
                break;
        }
    }
}