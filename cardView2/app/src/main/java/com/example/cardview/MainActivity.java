package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1-Data
    private  ArrayList<gameModel> gameList;

    //2- AdapterView
    private RecyclerView recyclerView;


    //3-Adapter
    private MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameList=new ArrayList<>();
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        gameList.add(new gameModel(R.drawable.atomicheart,"Atomic Heart",2019));
        gameList.add(new gameModel(R.drawable.deadbydaylight,"Dead by day light",2020));
        gameList.add(new gameModel(R.drawable.fortnite,"Fortnite",2017));
        gameList.add(new gameModel(R.drawable.metroid,"Metroid",2019));
        gameList.add(new gameModel(R.drawable.motox3m,"Moto x3m",2015));
        gameList.add(new gameModel(R.drawable.pocket,"Pocket",2023));
        gameList.add(new gameModel(R.drawable.sweetshop,"Sweet Shop",2013));
        gameList.add(new gameModel(R.drawable.thumb,"Thumb",2022));


        adapter=new MyAdapter(this,gameList);
        RecyclerView.LayoutManager layoutManager=new
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}