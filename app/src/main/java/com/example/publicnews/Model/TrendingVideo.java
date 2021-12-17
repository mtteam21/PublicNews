package com.example.publicnews.Model;

public class TrendingVideo {
    private String videoUrl;
    private String thumbnailUrl;


    public TrendingVideo(String videoUrl, String thumbnailUrl) {
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }


    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
