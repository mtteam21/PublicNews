package com.example.publicnews.UserDataFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.publicnews.Adapter.UploadedImagesAdapter;
import com.example.publicnews.Model.UploadedPosts;
import com.example.publicnews.R;

import java.util.ArrayList;
import java.util.List;

public class UplaodedNewsFragment extends Fragment {


    public UplaodedNewsFragment() {
        // Required empty public constructor
    }
    private View v;

    private RecyclerView uploadedPostsRecyclerView;
    private List<UploadedPosts> uploadedPostsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_uplaoded_news, container, false);

        uploadedPostsRecyclerView = v.findViewById(R.id.uploadedRecyclerView);

        GridLayoutManager layoutManager = new GridLayoutManager(v.getContext(),3);
        uploadedPostsRecyclerView.setLayoutManager(layoutManager);

        uploadedPostsList = new ArrayList<>();

        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));
        uploadedPostsList.add(new UploadedPosts(""));

        UploadedImagesAdapter adapter = new UploadedImagesAdapter(uploadedPostsList);
        uploadedPostsRecyclerView.setAdapter(adapter);




        return v;
    }
}