package com.sworkstudio.gsontutorial;

import com.google.gson.annotations.SerializedName;

public class Student3 {

    @SerializedName("name")
    private String mName;

    @SerializedName("rollno")
    private  String mRollNo;

    @SerializedName("age")
    private  String mAge;



  Address   address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
