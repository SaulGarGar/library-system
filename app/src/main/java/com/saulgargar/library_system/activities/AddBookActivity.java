package com.saulgargar.library_system.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.models.Book;
import com.saulgargar.library_system.services.DataBaseHandler;

import io.realm.Realm;

public class AddBookActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private DataBaseHandler dataBaseHandler = new DataBaseHandler(Realm.getDefaultInstance());

    private EditText bookTitleEt;
    private EditText bookLocationEt;
    private EditText bookEditorialEt;
    private EditText bookExamplesEt;

    private Book book = new Book();

    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        toolbar = findViewById(R.id.toolbar);

        bookTitleEt = findViewById(R.id.book_title);
        bookLocationEt = findViewById(R.id.book_location);
        bookEditorialEt = findViewById(R.id.book_editorial);
        bookExamplesEt = findViewById(R.id.examples_number);

        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book.setTitle(bookTitleEt.getText().toString());
                book.setEditorial(bookEditorialEt.getText().toString());
                book.setLocation(bookLocationEt.getText().toString());
                book.setNumberOfCopies(bookExamplesEt.getText().toString());

                Toast.makeText(AddBookActivity.this, "Libro guardado", Toast.LENGTH_SHORT).show();
                dataBaseHandler.saveNewBook(book.getTitle(),book.getEditorial(),book.getLocation(),book.getNumberOfCopies());
            }
        });

        setToolbar();
    }

    public void setToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Agregar Autor");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
