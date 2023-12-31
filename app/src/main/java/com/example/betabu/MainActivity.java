package com.example.betabu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AbuCardClickListener {
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
        Sport bball = new Sport("Basketball",R.drawable.dirkfadeaway);
        Sport mma = new Sport("MMA",R.drawable.connoratweighin);
        Sport nfl = new Sport("NFL",R.drawable.footballpigskin);
        Sport boxing = new Sport("Boxing",R.drawable.boxingtrainer);
        Sport baseball = new Sport("Baseball",R.drawable.ortizhomerun);
        Sport powerS = new Sport("Power Slap",R.drawable.powerslap);
        Sport tennis = new Sport("Tennis",R.drawable.tennisgenericstockphotowomen);

        sportsList.add(soccer);
        sportsList.add(bball);
        sportsList.add(mma);
        sportsList.add(nfl);
        sportsList.add(boxing);
        sportsList.add(baseball);
        sportsList.add(powerS);
        sportsList.add(tennis);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        abuAdapter =  new AbuAdapter(sportsList);
        recyclerView.setAdapter(abuAdapter);

        //still need to set the clicklistener her so it works how you want it on the screen we see on create
        abuAdapter.setCardClickListener(this);

    }

    @Override
    public void onClick(View v, int pos) {

        Toast.makeText(this,"Transition To: "+ sportsList.get(pos).getSportName(), Toast.LENGTH_SHORT).show();

    }
}