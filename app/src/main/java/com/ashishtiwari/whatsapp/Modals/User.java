package com.ashishtiwari.whatsapp.Modals;

public class User {
    private String uid,phoneNumber,name,profileImage;
    // if you are using firebase then make a empty constructor
    public User(){

    }
    public User(String uid, String name, String phoneNumber, String profileImage) {
        this.uid = uid;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.profileImage = profileImage;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
