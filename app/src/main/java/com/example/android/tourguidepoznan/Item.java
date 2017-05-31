package com.example.android.tourguidepoznan;

/**
 * Created by Naatay on 31.05.2017.
 */

public class Item {
    private int temp;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageId = NO_IMAGE_PROVIDED;

    Item(int t){
        this.setTemp(t);
    }

    Item(int t, int bg){
        this.imageId = bg;
        this.temp=t;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public int getImageId(){
        return imageId;
    }
    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }
}
