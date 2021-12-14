package com.example.publicnews.Model;

import javax.sql.StatementEvent;

public class PopularUsersModel {

    private String userName;
    private String imgUrl;

    public PopularUsersModel(String userName, String imgUrl) {
        this.userName = userName;
        this.imgUrl = imgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
