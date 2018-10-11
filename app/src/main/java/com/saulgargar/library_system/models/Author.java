package com.saulgargar.library_system.models;

import java.util.ArrayList;

import io.realm.RealmObject;

public class Author extends RealmObject{

    private int id;
    private String name;
    //private ArrayList<Book> books;

    public Author() {
    }

    public Author(int id, String name, ArrayList<Book> books) {
        this.id = id;
        this.name = name;
        //this.books = books;
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


}
