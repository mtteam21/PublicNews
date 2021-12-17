package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.publicnews.R;

public class VerifyAndSubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_and_submit);

        String vpath = getIntent().getStringExtra("path");

        Toast.makeText(this, vpath, Toast.LENGTH_SHORT).show();


        Log.e("PATH",vpath);
    }
}