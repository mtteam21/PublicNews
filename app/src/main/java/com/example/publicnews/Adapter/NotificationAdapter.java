package com.example.publicnews.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.publicnews.Model.NotificationModel;
import com.example.publicnews.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.vHolder> {

    private List<NotificationModel> notificationsList;

    public NotificationAdapter(List<NotificationModel> notificationsList) {
        this.notificationsList = notificationsList;
    }

    @NonNull
    @Override
    public vHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item,parent,false);
        return new vHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull vHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notificationsList.size();
    }

    public class vHolder extends RecyclerView.ViewHolder {
        public vHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
