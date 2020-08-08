package com.chapter07.a03recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chapter07.a03recycleview.model.MainModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MainModel> mainModelArrayList;

    private MainAdapter myAdapter;
    private RecyclerView myRecyclerView;
    private LinearLayoutManager myLinearLayoutManager;
    private Button buttonInsert;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_mail_list);
        buttonInsert = (Button) findViewById(R.id.button_main_insert);
        mainModelArrayList = new ArrayList<>();

        myLinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        myRecyclerView.setLayoutManager(myLinearLayoutManager);

        myAdapter = new MainAdapter(mainModelArrayList);
        myRecyclerView.setAdapter(myAdapter);
        i=3;
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainModel data=new MainModel();
                data.setId("아이디"+i);
                data.setStatusMessage("상태메시지"+i);
                mainModelArrayList.add(data);
                i++;
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}