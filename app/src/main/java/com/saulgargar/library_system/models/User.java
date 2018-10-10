package com.saulgargar.library_system.models;

import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Copy> copiesBorrowed;

    public User() {
    }

    public User(int id, String name, String address, String phone, ArrayList<Copy> copiesBorrowed) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.copiesBorrowed = copiesBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Copy> getCopiesBorrowed() {
        return copiesBorrowed;
    }

    public void setCopiesBorrowed(ArrayList<Copy> copiesBorrowed) {
        this.copiesBorrowed = copiesBorrowed;
    }
}
