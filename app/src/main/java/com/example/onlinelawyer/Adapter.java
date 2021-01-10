package com.example.onlinelawyer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {
    ArrayList<Lawyerslist> mArray;
    Context context;

    public Adapter(ArrayList<Lawyerslist> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lawyers_names_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).name.setText(mArray.get(position).getName()+"");
        ((ViewHolder)holder).phone.setText(mArray.get(position).getPhone()+"");
        ((ViewHolder)holder).img.setImageResource(mArray.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
           public ImageView img;
           public TextView name;
           public TextView phone;
           public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView3);
            name = itemView.findViewById(R.id.textView2);
            phone = itemView.findViewById(R.id.phonetxt);
        }
    }
}
