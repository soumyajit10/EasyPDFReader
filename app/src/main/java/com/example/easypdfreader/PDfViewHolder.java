package com.example.easypdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PDfViewHolder  extends RecyclerView.ViewHolder {
    public TextView textViewName;
    public CardView container;

    public PDfViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewName = itemView.findViewById(R.id.txtPdfName);
        container = itemView.findViewById(R.id.CardViewContainer);



    }
}
