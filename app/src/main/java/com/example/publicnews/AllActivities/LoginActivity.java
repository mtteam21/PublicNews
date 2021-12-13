package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.publicnews.R;

public class LoginActivity extends AppCompatActivity {

    private CardView loginWithGoogleCardView,loginWithFacebookCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        findViewByIds();

        clickListeners();


    }
    private void findViewByIds() {
        loginWithFacebookCardView = findViewById(R.id.loginWithFacebookCardView);
        loginWithGoogleCardView = findViewById(R.id.loginWithGoogleCardView);
    }

    private void clickListeners() {

        loginWithGoogleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,PermissionActivity.class));
            }
        });

        loginWithFacebookCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,PermissionActivity.class));
            }
        });

    }

}