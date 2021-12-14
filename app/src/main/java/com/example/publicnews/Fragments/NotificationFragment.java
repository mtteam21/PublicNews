package com.example.publicnews.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

import com.example.publicnews.Adapter.NotificationAdapter;
import com.example.publicnews.Model.NewsModel;
import com.example.publicnews.Model.NotificationModel;
import com.example.publicnews.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {
    private View v;
    private NotificationAdapter notificationAdapter;
    private RecyclerView recyclerView;
    private List<NotificationModel> notificationModelList;
    private NotificationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.fragment_notification, container, false);

         recyclerView = v.findViewById(R.id.notificationListRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        notificationModelList = new ArrayList<>();

        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));
        notificationModelList.add(new NotificationModel("",""));

        notificationAdapter = new NotificationAdapter(notificationModelList);
        recyclerView.setAdapter(notificationAdapter);

        return v;
    }
}