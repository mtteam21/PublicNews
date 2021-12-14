package com.example.publicnews.Model;

public class NewsModel {

    String channelName;
    String channelDescription;
    String dateCountyView;
    String postStatus;
    String imgUrl;

    public NewsModel(String channelName, String channelDescription, String dateCountyView, String postStatus, String imgUrl) {
        this.channelName = channelName;
        this.channelDescription = channelDescription;
        this.dateCountyView = dateCountyView;
        this.postStatus = postStatus;
        this.imgUrl = imgUrl;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    public String getDateCountyView() {
        return dateCountyView;
    }

    public void setDateCountyView(String dateCountyView) {
        this.dateCountyView = dateCountyView;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
