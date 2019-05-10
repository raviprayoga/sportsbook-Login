package com.example.android.tubesSportsBook.Activities;


public class SportsItem {
    private String mName;
    private int mThumbnail;
    private String mDeskripsi;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }


    public String getDeskripsi() {
        return mDeskripsi;
    }

    public void setDeskripsie(String deskripsi) {
        this.mDeskripsi = deskripsi;
    }
}