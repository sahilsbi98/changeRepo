package com.example.recyclerview;

public class Item {

    private String mImageUrl;
    private String mImageName;

    public Item(String mImageUrl, String mImageName) {
        this.mImageUrl = mImageUrl;
        this.mImageName = mImageName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmImageName() {
        return mImageName;
    }
}
