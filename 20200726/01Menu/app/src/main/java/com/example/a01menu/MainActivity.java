package com.example.a01menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button menubtn1, menubtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menubtn1 = (Button)findViewById(R.id.menubtn1);
        menubtn2 = (Button)findViewById(R.id.menubtn2);

        registerForContextMenu(menubtn1);
        registerForContextMenu(menubtn2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item1:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템1 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            case R.id.item2:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템2 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            case R.id.item3:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템3 선택",
                        Toast.LENGTH_SHORT
                ).show();
            case R.id.item8:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템8 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();

        if (v==menubtn1) {
            menuInflater.inflate(R.menu.context_menu1, menu);
        } else if (v==menubtn2) {
            menuInflater.inflate(R.menu.context_menu2, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item4:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템4 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            case R.id.item5:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템5 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            case R.id.item6:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템6 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            case R.id.item7:
                Toast.makeText(
                        getApplicationContext(),
                        "아이템7 선택",
                        Toast.LENGTH_SHORT
                ).show();
                return true;
        }

        return super.onContextItemSelected(item);
    }
}