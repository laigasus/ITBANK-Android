package com.chapter04.slideshow;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button slideshowmenubtn;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideshowmenubtn = (Button) findViewById(R.id.slideshowmenubtn);
        registerForContextMenu(slideshowmenubtn);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        viewFlipper.setFlipInterval(1000);


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
            case R.id.nextbtn:
                viewFlipper.showNext();
                return true;

            case R.id.prevbtn:
                viewFlipper.showPrevious();
                return true;

            case R.id.alive:
                viewFlipper.setDisplayedChild(2);
                return true;
            case R.id.steelrain:
                viewFlipper.setDisplayedChild(1);
                return true;
            case R.id.bando:
                viewFlipper.setDisplayedChild(0);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();

        if (v==slideshowmenubtn) {
            menuInflater.inflate(R.menu.slideshow_menu, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.startslide:
                viewFlipper.startFlipping();
                return true;
            case R.id.stopslide:
                viewFlipper.stopFlipping();
                return true;
        }

        return super.onContextItemSelected(item);
    }
}