package com.saulgargar.library_system.services;

import com.saulgargar.library_system.models.Author;
import com.saulgargar.library_system.models.Book;
import com.saulgargar.library_system.models.Copy;
import com.saulgargar.library_system.models.User;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class DataBaseHandler {

    private Realm realm;

    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Copy> copies = new ArrayList<>();

    public DataBaseHandler(Realm realm) {
        this.realm = realm;
    }

    public void saveNewAuthor(String name){

        realm.beginTransaction();

        Author author = realm.createObject(Author.class);

        author.setName(name);

        realm.commitTransaction();
    }

    public void saveNewBook(String title, String editorial, String location, String numberOfCopies){
        realm.beginTransaction();

        Book book = realm.createObject(Book.class);

        book.setTitle(title);
        book.setEditorial(editorial);
        book.setLocation(location);
        book.setNumberOfCopies(numberOfCopies);

        realm.commitTransaction();
    }

    public void saveNewUser(String name, String address, String phone){
        realm.beginTransaction();

        User user = realm.createObject(User.class);

        user.setName(name);
        user.setAddress(address);
        user.setPhone(phone);
        realm.commitTransaction();
    }

    public ArrayList<Author> getAuthorsSaved(){

        RealmResults<Author> results = realm.where(Author.class).findAll();

        authors.addAll(results);

        return authors;
    }

    public ArrayList<Book> getBooksSaved(){

        RealmResults<Book> results = realm.where(Book.class).findAll();

        books.addAll(results);

        return books;
    }

    public ArrayList<User> getUsersSaved(){

        RealmResults<User> results = realm.where(User.class).findAll();

        users.addAll(results);

        return users;
    }
}
