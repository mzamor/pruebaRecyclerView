package com.example.marian.pruebarecyclerview3.Model;

/**
 * Created by marian on 26/03/18.
 */

public class Picture {
    private String picture;
    private String userName;

    public Picture(String picture, String userName) {
        this.picture = picture;
        this.userName = userName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
