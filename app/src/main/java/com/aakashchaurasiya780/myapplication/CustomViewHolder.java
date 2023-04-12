package com.aakashchaurasiya780.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView text_title;
    public TextView text_source;
    public ImageView img_headlines;
    public CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        text_title=itemView.findViewById(R.id.text_title);
        text_source=itemView.findViewById(R.id.text_source);
        img_headlines=itemView.findViewById(R.id.img_headline);

        cardView=itemView.findViewById(R.id.main_container);
    }
}
