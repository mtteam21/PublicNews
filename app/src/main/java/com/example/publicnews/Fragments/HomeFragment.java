package com.example.publicnews.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.publicnews.Adapter.HomeNewsAdapter;
import com.example.publicnews.AllActivities.MainActivity;
import com.example.publicnews.Model.NewsModel;
import com.example.publicnews.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import static com.example.publicnews.AllActivities.MainActivity.drawer;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private List<NewsModel> newsModelList;
    private View v;
    private HomeNewsAdapter homeNewsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = v.findViewById(R.id.homeNewsRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        newsModelList = new ArrayList<>();
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));
        newsModelList.add(new NewsModel("","","","",""));


        homeNewsAdapter = new HomeNewsAdapter(newsModelList);
        recyclerView.setAdapter(homeNewsAdapter);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                getActivity(), drawer , null , R.string.navigation_drawer_open ,
                R.string.navigation_drawer_close ) ;
        drawer.addDrawerListener(toggle) ;
        toggle.syncState();



        MainActivity.openCloseDrawerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);
                if(drawer.isDrawerOpen(MainActivity.navigationView)){
                    drawer.closeDrawer(GravityCompat.END);
                }
            }
        });




        return v;
    }
}