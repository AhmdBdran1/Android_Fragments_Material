package com.example.viewpager;

public enum CourseModel {
    RED(R.string.red,R.layout.view_red),
    BLU(R.string.blue,R.layout.view_blue),
    green(R.string.green,R.layout.view_green);

    private int mTitleID;
    private int mLayoutID;

    CourseModel(int mTitleID,int mLayoutID){
        this.mLayoutID=mTitleID;
        this.mLayoutID=mLayoutID;
    }

    public int getmTitleID() {
        return mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }
}
