package com.example.realprojectforuploads;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUri;
    private String mKey;

    public Upload(){
        //empty constructor needed
    }
    public Upload(String name,String imageUri){
        if(name.trim().equals("")){
            name="No name";
        }
        mName=name;
        mImageUri=imageUri;

    }
    public String getmName(){
        return mName;
    }
    public String getmImageUri(){
        return mImageUri;
    }
    public void setmName(String name){
        mName=name;
    }
    public void setmImageUri(String imageUri){
        mImageUri=imageUri;
    }
    @Exclude
    public String getKey()
    {
        return mKey;
    }
    public void setKey(String Key)
    {
        mKey=Key;
    }

}
