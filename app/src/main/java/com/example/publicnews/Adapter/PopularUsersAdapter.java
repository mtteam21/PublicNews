package com.example.publicnews.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.publicnews.Model.PopularUsersModel;
import com.example.publicnews.R;

import java.util.List;

public class PopularUsersAdapter extends RecyclerView.Adapter<PopularUsersAdapter.viewHolder> {
    private List<PopularUsersModel> popularUsersModelsList;

    public PopularUsersAdapter(List<PopularUsersModel> popularUsersModelsList) {
        this.popularUsersModelsList = popularUsersModelsList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popular_users,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return popularUsersModelsList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
