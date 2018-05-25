package com.sworkstudio.gsontutorial;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("countryx")  // you dont need to put anotation wehn you are converting to json from object
    private String mCountry;


    @SerializedName("cityx")
    private  String mCity;


    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }
}
