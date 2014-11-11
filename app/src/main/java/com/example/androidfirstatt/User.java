package com.example.androidfirstatt;

import android.media.Image;

/**
 * Created by Дмитрий on 01.10.2014.
 */
public class User {
    private String name;
    void SetName(String val){
        name = val;
    }
    String GetName(){
        return name;
    }

    private String some_info;
    void SetInfo(String val){
        some_info = val;
    }
    String GetInfo(){
        return some_info;
    }

    private int pic;
    void SetPic(int img){
        pic = img;
    }
    int GetPic(){
        return pic;
    }

    public User(){

    }
}
