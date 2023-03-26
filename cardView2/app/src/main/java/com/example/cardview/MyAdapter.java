package com.example.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    //1-data
    private Context context;
    private ArrayList<gameModel> gamesList;


    //2- constructor


    public MyAdapter(Context context, ArrayList<gameModel> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }


    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameName;
        private  TextView gameYear;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gameImg=(ImageView)itemView.findViewById(R.id.gamePic);
            gameName=(TextView) itemView.findViewById(R.id.gameName);
            gameYear=(TextView) itemView.findViewById(R.id.gameYear);

        }
    }


    //4 implement the methods

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
        gameModel model=gamesList.get(position);
        holder.gameName.setText(model.getGameName());
        holder.gameYear.setText(String.valueOf(model.getYear()));
        holder.gameImg.setImageResource(model.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,""+"You choose: "+model.getGameName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }


}
