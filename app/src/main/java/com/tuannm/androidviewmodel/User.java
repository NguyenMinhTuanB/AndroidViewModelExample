package com.tuannm.androidviewmodel;

/**
 * Created by TuanNM on 31/12/2018.
 * descripsiont:
 */
public class User {
    private int mId;
    private String mName;
    private String mPhone;

    public User(int id, String name, String phone) {
        mId = id;
        mName = name;
        mPhone = phone;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }
}
