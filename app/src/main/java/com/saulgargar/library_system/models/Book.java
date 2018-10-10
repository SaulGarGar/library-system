package com.saulgargar.library_system.models;

public class Book {

    private int id;
    private String title;
    private String location;
    private String editorial;
    private String numberOfCopies;

    public Book(int id, String title, String location, String editorial, String numberOfCopies) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.editorial = editorial;
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(String numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
