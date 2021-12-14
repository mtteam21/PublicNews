package com.example.publicnews.Model;

public class NotificationModel {

    private String notificationTitle;
    private String notificationImage;

    public NotificationModel(String notificationTitle, String notificationImage) {
        this.notificationTitle = notificationTitle;
        this.notificationImage = notificationImage;
    }


    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationImage() {
        return notificationImage;
    }

    public void setNotificationImage(String notificationImage) {
        this.notificationImage = notificationImage;
    }
}
