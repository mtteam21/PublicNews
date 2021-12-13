package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.publicnews.R;

public class PermissionActivity extends AppCompatActivity {

    private CardView givePermissionCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        givePermissionCardView = findViewById(R.id.givePermissionCard);

        givePermissionCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PermissionActivity.this,ChooseLanguageActivity.class));
            }
        });

    }
}