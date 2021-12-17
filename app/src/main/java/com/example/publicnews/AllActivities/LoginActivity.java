package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.publicnews.R;

public class LoginActivity extends AppCompatActivity {

    private CardView loginWithGoogleCardView,loginWithFacebookCardView;
    private TextView animatedHeadingText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        findViewByIds();

        clickListeners();

        Animation aniSlide = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in_width);

        animatedHeadingText.startAnimation(aniSlide);

    }
    private void findViewByIds() {
        loginWithFacebookCardView = findViewById(R.id.loginWithFacebookCardView);
        loginWithGoogleCardView = findViewById(R.id.loginWithGoogleCardView);
        animatedHeadingText = findViewById(R.id.headingText);
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