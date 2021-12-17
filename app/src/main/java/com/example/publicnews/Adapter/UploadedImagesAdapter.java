package com.example.publicnews.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.publicnews.Model.UploadedPosts;
import com.example.publicnews.R;

import java.util.List;

public class UploadedImagesAdapter extends RecyclerView.Adapter<UploadedImagesAdapter.VIEWHOLDER> {

    private List<UploadedPosts> uploadedImagesList;

    public UploadedImagesAdapter(List<UploadedPosts> uploadedImagesList) {
        this.uploadedImagesList = uploadedImagesList;
    }

    @NonNull
    @Override
    public VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uploaded_posts,parent,false);
        return new VIEWHOLDER(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VIEWHOLDER holder, int position) {

    }

    @Override
    public int getItemCount() {
        return uploadedImagesList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {
        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);
        }
    }
}
