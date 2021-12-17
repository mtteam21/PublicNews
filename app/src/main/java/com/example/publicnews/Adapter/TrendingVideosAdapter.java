package com.example.publicnews.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.publicnews.Model.TrendingVideo;
import com.example.publicnews.R;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class TrendingVideosAdapter extends RecyclerView.Adapter<TrendingVideosAdapter.vHolder> {

    private List<TrendingVideo> trendingVideoList;

    public TrendingVideosAdapter(List<TrendingVideo> trendingVideoList) {
        this.trendingVideoList = trendingVideoList;
    }

    @NonNull
    @Override
    public vHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending_video,parent,false);
        return new vHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull vHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return trendingVideoList.size();
    }

    public class vHolder extends RecyclerView.ViewHolder {
        public vHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
