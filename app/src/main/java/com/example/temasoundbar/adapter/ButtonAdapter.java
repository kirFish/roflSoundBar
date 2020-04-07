package com.example.temasoundbar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.temasoundbar.R;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.MyViewHolder>{
    private String[][] dataset;

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageButton imageButton;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageButton = itemView.findViewById(R.id.temaButton);
            this.textView = itemView.findViewById(R.id.temaButtonText);
        }


    }

    public ButtonAdapter(String[][] dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public ButtonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_element_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(dataset[position][0]);
        holder.imageButton.setImageResource(Integer.parseInt(dataset[position][1]));
    }

    @Override
    public int getItemCount() {

        return dataset.length;
    }
}
