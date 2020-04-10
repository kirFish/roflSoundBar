package com.example.temasoundbar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.temasoundbar.MainActivity;
import com.example.temasoundbar.R;
import com.example.temasoundbar.services.ConstantsWorker;
import com.example.temasoundbar.services.TemaOnCLickListener;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.MyViewHolder>{
    private int[][] id;
    private String[] labels;
    private Context context;

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageButton imageButton;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageButton = itemView.findViewById(R.id.temaButton);
            this.textView = itemView.findViewById(R.id.temaLabel);
        }


    }

    public ButtonAdapter(int[][] id, String[] labels,Context context) {
        this.id = id;
        this.labels = labels;
        this.context = context;
    }

    @NonNull
    @Override
    public ButtonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_element_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(labels[position]);
        holder.imageButton.setImageResource(id[position][0]);
        TemaOnCLickListener temaOnCLickListener = new TemaOnCLickListener(id[position][1],context);
        holder.imageButton.setOnClickListener(temaOnCLickListener);
    }

    @Override
    public int getItemCount() {

        return id.length;
    }
}
