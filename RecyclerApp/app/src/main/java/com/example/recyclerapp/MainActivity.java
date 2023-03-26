package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    //1- AdapterView: RecyclerView
    private RecyclerView recyclerView;

    //2- data source
    private VaccineModel[] myListData;

    //3- Adapter
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);


        adapter=new MyAdapter(myListData);


        myListData = new VaccineModel[]{
                new VaccineModel("corona Vairus", R.drawable.a),
                new VaccineModel("salmonila", R.drawable.b),
                new VaccineModel("covide-19 Vairus", R.drawable.c),
                new VaccineModel("alzhaymer Vairus", R.drawable.d),
                new VaccineModel("t-12 Vairus", R.drawable.e),
                new VaccineModel("49-s Vairus", R.drawable.f),
                new VaccineModel("89-tv Vairus", R.drawable.g),
                new VaccineModel("ak Vairus", R.drawable.h)
        };

        adapter=new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setAdapter(adapter);
        //Handling the Click Events
        adapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(MainActivity.this,"Vaccine name: "+myListData[pos].getTitle(),Toast.LENGTH_SHORT).show();
    }
}