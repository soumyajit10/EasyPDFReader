package com.example.easypdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class PdfAdapter  extends RecyclerView.Adapter<PDfViewHolder> {
    private Context context;
    private List<File> pdfFiles;
    private  OnPdfFileSelectListener pdfFileSelectListener;

    public PdfAdapter(Context context, List<File> pdfFiles ,OnPdfFileSelectListener listener) {
        this.context = context;
        this.pdfFiles = pdfFiles;
        this.pdfFileSelectListener = listener;
    }

    @NonNull

    @Override
    public PDfViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new PDfViewHolder(LayoutInflater.from(context).inflate(R.layout.element_holder,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull PDfViewHolder holder, int position) {

        holder.textViewName.setText(pdfFiles.get(position).getName());
        holder.textViewName.setSelected(true);

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfFileSelectListener.onPdfSelected(pdfFiles.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }
}
