package com.example.betabu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AbuAdapter extends RecyclerView.Adapter<AbuAdapter.SportViewHolder>{

    private List<Sport> sportList;

    public AbuAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        //also removed the recyclerviewholder parameter and input my custom one

        // called for each item in the list and is responsible for binding the
        //data from the sports object to the views within the sports view holder.


        //thia specifying 1 by 1 in the list
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imgView.setImageResource(sport.sportImg);
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    //THIS need to be done first so i can put it in the brackets for my adapter
    public static class SportViewHolder extends  RecyclerView.ViewHolder{

        TextView textView;
        ImageView imgView;


        public SportViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imgView = itemView.findViewById(R.id.cardImage);
        }
    }
}
