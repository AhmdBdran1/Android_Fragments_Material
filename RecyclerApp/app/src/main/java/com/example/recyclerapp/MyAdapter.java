package com.example.recyclerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    //handling the click events
    private ItemClickListener clickListener;

    // data source
    private VaccineModel[] listData;
    public  MyAdapter(VaccineModel[] listData){
        this.listData=listData;
    }

    public  void setClickListener(ItemClickListener clickListener){
        this.clickListener=clickListener;
    }


    //View Holder Class:
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView textView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView=itemView.findViewById(R.id.imageView);
            this.textView=itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            if(clickListener!=null){
                clickListener.onClick(view,getAdapterPosition());
            }
        }
    }

    // Implementing the methods


    //called when we need a new view
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View listItem=inflater.inflate(R.layout.recycler_view_item,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(listItem);
        return  viewHolder;
    }


    //provide and bind the new data
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    final  VaccineModel myListData=listData[position];
    holder.textView.setText(listData[position].getTitle());
    holder.imageView.setImageResource(listData[position].getImage());

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }


}
