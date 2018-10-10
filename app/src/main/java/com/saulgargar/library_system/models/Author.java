package com.saulgargar.library_system.models;

import java.util.ArrayList;

public class Author {

    private int id;
    private String name;
    private ArrayList<Book> books;

    public Author() {
    }

    public Author(int id, String name, ArrayList<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
