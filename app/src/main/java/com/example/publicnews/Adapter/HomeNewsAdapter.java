package com.example.publicnews.Adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;

import com.example.publicnews.Model.NewsModel;
import com.example.publicnews.R;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.imageview.ShapeableImageView;


import java.util.List;

public class HomeNewsAdapter extends RecyclerView.Adapter<HomeNewsAdapter.viewHolder> {

    private List<NewsModel> newsModelList;

    public HomeNewsAdapter(List<NewsModel> newsModelList) {
        this.newsModelList = newsModelList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_news,parent,false);
        return new viewHolder(v);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//        try {
//            ExoPlayer player = new ExoPlayer.Builder(holder.itemView.getContext()).build();
//
//            holder.exoPlayerView.setPlayer(player);
//            MediaItem mediaItem = MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4");
//// Set the media item to be played.
//            player.setMediaItem(mediaItem);
//// Prepare the player.
//            player.prepare();
//// Start the playback.
//            player.play();
//
//        }catch(IllegalArgumentException e){
//            e.printStackTrace();
//        }

        // adding the color to be shown
        ObjectAnimator animator = ObjectAnimator.ofInt(holder.followBlinkTv, "textColor", Color.RED,Color.BLACK);

        // duration of one color
        animator.setDuration(500);
        animator.setEvaluator(new ArgbEvaluator());

        // color will be show in reverse manner
        animator.setRepeatCount(Animation.REVERSE);

        // It will be repeated up to infinite time
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.zoom_width);
        animation.setRepeatMode(Animation.INFINITE);

        holder.followBlinkTv.startAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return newsModelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView thumbnailImage;
        private PlayerView exoPlayerView;
        private TextView followBlinkTv;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnailImage = itemView.findViewById(R.id.thumbnailImg);
            exoPlayerView = itemView.findViewById(R.id.exoPlayerView);
            followBlinkTv = itemView.findViewById(R.id.followTvBlink);

        }
    }
}
