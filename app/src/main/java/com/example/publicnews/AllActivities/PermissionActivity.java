package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.publicnews.R;

public class PermissionActivity extends AppCompatActivity {

    private CardView givePermissionCardView;
    private ImageView locationImageView;
    private TextView locationRequiredTextV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        givePermissionCardView = findViewById(R.id.givePermissionCard);
        locationImageView = findViewById(R.id.imageViewLocation);
        locationRequiredTextV = findViewById(R.id.locationReqTV);


//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
//
//        locationImageView.setAnimation(animation);


        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.zoom_width);

        locationRequiredTextV.startAnimation(animation1);

//        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 1.0f, 1f, 1.0f,locationRequiredTextV.getWidth() / 2.0f, locationRequiredTextV.getHeight() / 2.0f);
//        scaleAnimation.setDuration(2000); // scale to 3 times as big in 3 seconds
//        scaleAnimation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
//        locationRequiredTextV.startAnimation(scaleAnimation);
//
//        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
//            public void onAnimationStart(Animation animation) {
//                Log.d("ScaleActivity", "Scale started...");
//            }
//
//            public void onAnimationEnd(Animation animation) {
//                Log.d("ScaleActivity", "Scale ended...");
//            }
//
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });

        givePermissionCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PermissionActivity.this,ChooseLanguageActivity.class));
            }
        });

    }
}