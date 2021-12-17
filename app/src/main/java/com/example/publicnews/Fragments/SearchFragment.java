package com.example.publicnews.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.publicnews.Adapter.PopularUsersAdapter;
import com.example.publicnews.Adapter.SearchTagsAdapter;
import com.example.publicnews.Adapter.TrendingVideosAdapter;
import com.example.publicnews.Model.PopularUsersModel;
import com.example.publicnews.Model.TagModel;
import com.example.publicnews.Model.TrendingVideo;
import com.example.publicnews.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }

    private View v;
    private RecyclerView recyclerView,recyclerView1,popularUsersRecyclerView,trendingVideosRecyclerView;
    private PopularUsersAdapter popularUsersAdapter;
    private List<TagModel> tagsList;
    private List<PopularUsersModel> popularUsersModelList;
    private List<TrendingVideo> trendingVideoList;
    private SearchTagsAdapter adapter,adapter1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = v.findViewById(R.id.tagRecyclerView);
        recyclerView1 = v.findViewById(R.id.tagRecyclerView1);
        popularUsersRecyclerView = v.findViewById(R.id.usersPopularRecyclerView);
        trendingVideosRecyclerView = v.findViewById(R.id.trendingVideosRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(v.getContext());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(v.getContext());
        linearLayoutManager1.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView1.setLayoutManager(linearLayoutManager1);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(v.getContext());
        linearLayoutManager2.setOrientation(RecyclerView.HORIZONTAL);
        popularUsersRecyclerView.setLayoutManager(linearLayoutManager2);

        tagsList = new ArrayList<>();

        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));
        tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));       tagsList.add(new TagModel(""));

        adapter = new SearchTagsAdapter(tagsList);
        recyclerView.setAdapter(adapter);

        adapter1 = new SearchTagsAdapter(tagsList);
        recyclerView1.setAdapter(adapter1);


        popularUsersModelList = new ArrayList<>();
        popularUsersModelList.add(new PopularUsersModel("",""));
        popularUsersModelList.add(new PopularUsersModel("",""));
        popularUsersModelList.add(new PopularUsersModel("",""));
        popularUsersModelList.add(new PopularUsersModel("",""));
        popularUsersModelList.add(new PopularUsersModel("",""));
        popularUsersModelList.add(new PopularUsersModel("",""));

        popularUsersAdapter = new PopularUsersAdapter(popularUsersModelList);
        popularUsersRecyclerView.setAdapter(popularUsersAdapter);

        LinearLayoutManager layoutManager =
                new GridLayoutManager(getActivity(), 2, GridLayoutManager.HORIZONTAL, false);
        trendingVideosRecyclerView.setLayoutManager(layoutManager);

        trendingVideoList = new ArrayList<>();

        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));
        trendingVideoList.add(new TrendingVideo("",""));

        TrendingVideosAdapter trendingVideosAdapter = new TrendingVideosAdapter(trendingVideoList);
        trendingVideosRecyclerView.setAdapter(trendingVideosAdapter);


        return v;
    }
}