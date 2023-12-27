package com.example.betabu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.builders.AbstractMapBuilderEntrySet;

public class MainActivity extends AppCompatActivity {
  //1-AdapterView
    private RecyclerView recyclerView;
    //2-Data Source;
    List<Sport> sportsList;

    //3 Adapter

    AbuAdapter abuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportsList = new ArrayList<>();

        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        /*Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);
        Sport soccer = new Sport("Soccer",R.drawable.paulvtwodefender);*/

        sportsList.add(soccer);

        abuAdapter =  new AbuAdapter(sportsList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(abuAdapter);

    }
}