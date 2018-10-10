package com.saulgargar.library_system.models;

public class Copy {

    private int id;
    private String copyNumber;
    private boolean isBorrow;

    public Copy(int id, String copyNumber, boolean isBorrow) {
        this.id = id;
        this.copyNumber = copyNumber;
        this.isBorrow = isBorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }
}
