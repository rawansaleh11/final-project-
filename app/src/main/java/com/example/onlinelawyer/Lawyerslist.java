package com.example.onlinelawyer;

public class Lawyerslist {
    private String name;
    private int phone;
    private int img;


    public Lawyerslist(String name, int phone, int img) {
        this.name = name;
        this.phone = phone;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
