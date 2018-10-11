package com.saulgargar.library_system.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.models.Author;
import com.saulgargar.library_system.services.DataBaseHandler;

import io.realm.Realm;

public class AddAuthorActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private EditText authorNameEt;

    private Button addButton;

    private Author author = new Author();
    private DataBaseHandler dataBaseHandler = new DataBaseHandler(Realm.getDefaultInstance());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_author);

        toolbar = findViewById(R.id.toolbar);

        authorNameEt = findViewById(R.id.author_name);

        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                author.setName(authorNameEt.getText().toString());
                dataBaseHandler.saveNewAuthor(author.getName());
                Toast.makeText(AddAuthorActivity.this, "Autor guardado", Toast.LENGTH_SHORT).show();
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
