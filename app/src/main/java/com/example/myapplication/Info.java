package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class Info {

    private String ten;
    private String tel;
    private int img;

    public Info() {
    }

    public Info(String ten, String tel, int img) {
        this.ten = ten;
        this.tel = tel;
        this.img = img;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
