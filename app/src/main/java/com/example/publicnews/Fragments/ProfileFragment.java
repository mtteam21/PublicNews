package com.example.publicnews.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.publicnews.Adapter.UploadedImagesAdapter;
import com.example.publicnews.AllActivities.EditProfileActivity;
import com.example.publicnews.AllActivities.SendMessageActivity;
import com.example.publicnews.R;
import com.example.publicnews.UserDataFragments.BookemarkedFragment;
import com.example.publicnews.UserDataFragments.UplaodedNewsFragment;


public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    private LinearLayout uploadedPosts,bookmarkedPro,uploadedVideoPro,accountPro;
    private TextView editProfileTv;
    private ImageView messageIv;

    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);

        uploadedPosts = v.findViewById(R.id.dashboardProfile);
        bookmarkedPro = v.findViewById(R.id.bookmarkProfile);
        uploadedVideoPro = v.findViewById(R.id.videosProfile);
        accountPro = v.findViewById(R.id.accountProfile);
        editProfileTv = v.findViewById(R.id.editProfileTv);
        messageIv = v.findViewById(R.id.messageIv);

        Fragment fragment = new UplaodedNewsFragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.con1, fragment);
        transaction.addToBackStack(null);
        transaction.commit();


        editProfileTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), EditProfileActivity.class));
            }
        });

        messageIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SendMessageActivity.class));
            }
        });

        uploadedPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new UplaodedNewsFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.con1, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        bookmarkedPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new BookemarkedFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.con1, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return v;
    }
}