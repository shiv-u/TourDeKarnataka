package com.androidexample.tourdemysore;

/**
 * Created by shivu on 24-07-2018.
 */

public class Info {

    private String mPlace;
    private int mRatings, mImage;

    public Info(String mPlace, int mImage, int mRatings) {
        this.mPlace = mPlace;
        this.mRatings = mRatings;
        this.mImage = mImage;
    }

    public String getmPlace() {
        return mPlace;
    }

    public int getmRatings() {
        return mRatings;
    }

    public int getmImage() {
        return mImage;
    }
}
