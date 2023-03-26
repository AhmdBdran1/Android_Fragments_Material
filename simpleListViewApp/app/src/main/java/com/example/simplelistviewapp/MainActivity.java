package com.example.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private static CustomAdapter adapter;

    private ArrayList<CountryModelClass> dataModels ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //---> AdapterView
        listView=(ListView) findViewById(R.id.listView);

        //---> data source
        dataModels=new ArrayList<>();
        dataModels.add(new CountryModelClass("Canada","0",R.drawable.canada));
        dataModels.add(new CountryModelClass("Brazil","5", R.drawable.brazil));
        dataModels.add(new CountryModelClass("morocco","0", R.drawable.morocco));
        dataModels.add(new CountryModelClass("Israel","0",R.drawable.israel));
        dataModels.add(new CountryModelClass("Italy","4",R.drawable.italy));
        dataModels.add(new CountryModelClass("Spain","1",R.drawable.spain));
        dataModels.add(new CountryModelClass("japan","0",R.drawable.japan));
        dataModels.add(new CountryModelClass("Turkey","0",R.drawable.turkey));
        dataModels.add(new CountryModelClass("Italy","4",R.drawable.italy));
        dataModels.add(new CountryModelClass("Spain","1",R.drawable.spain));
        dataModels.add(new CountryModelClass("japan","0",R.drawable.japan));
        dataModels.add(new CountryModelClass("Turkey","0",R.drawable.turkey));



        //---> Adapter
        adapter=new CustomAdapter(dataModels,this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Country "+adapter.getItem(i).getCountry_name()+"\nWorld Cups wins: "+ adapter.getItem(i).getCup_win_count(),Toast.LENGTH_SHORT).show();
            }
        });






    }
}