package com.sworkstudio.gsontutorial;

import com.google.gson.annotations.SerializedName;

public class Student2 {

    @SerializedName("name")     // this serilizedName anotation tell that this  "name" (in json file)  belong to this  mName (part of student object)  ..they both could be different
    private String mName;

    @SerializedName("rollno")
    private  String mRollNo;

    @SerializedName("age")
    private  String mAge;


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRollNo() {
        return mRollNo;
    }

    public void setmRollNo(String mRollNo) {
        this.mRollNo = mRollNo;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }
}
