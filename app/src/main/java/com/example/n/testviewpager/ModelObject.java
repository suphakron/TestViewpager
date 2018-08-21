package com.example.n.testviewpager;

import android.graphics.Color;

public enum  ModelObject {
    PINK(R.color.pink_color, R.layout.view_pink),
    DEEP_ORANGE(R.color.deep_orange_color, R.layout.view_deep_orange),
    ORANGE(R.color.orange_color, R.layout.view_orange),
    LOGIN(R.color.colorPrimary,R.layout.activity_login);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getmTitleResId() { return  mTitleResId;}
    public  int getmLayoutResId(){ return  mLayoutResId;}
}
