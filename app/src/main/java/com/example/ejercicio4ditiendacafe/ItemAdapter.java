package com.example.ejercicio4ditiendacafe;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>{

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

    class ItemViewHolder extends RecyclerView.ViewHolder{

    protected ImageView imagen;
    protected androidx.appcompat.widget.Toolbar toolbar;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imagen = itemView.findViewById(R.id.imagen);
        toolbar = itemView.findViewById(R.id.divider);
    }
}
