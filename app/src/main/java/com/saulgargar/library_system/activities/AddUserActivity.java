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
import com.saulgargar.library_system.models.Author;
import com.saulgargar.library_system.models.User;
import com.saulgargar.library_system.services.DataBaseHandler;

import io.realm.Realm;

public class AddUserActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private EditText userNameEt;
    private EditText userAddressEt;
    private EditText userPhoneEt;

    private Button addButton;

    private DataBaseHandler dataBaseHandler = new DataBaseHandler(Realm.getDefaultInstance());


    private User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        toolbar = findViewById(R.id.toolbar);

        userNameEt = findViewById(R.id.user_name);
        userAddressEt = findViewById(R.id.user_address);
        userPhoneEt = findViewById(R.id.user_phone);

        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setName(userNameEt.getText().toString());
                user.setAddress(userAddressEt.getText().toString());
                user.setPhone(userPhoneEt.getText().toString());

                dataBaseHandler.saveNewUser(user.getName(),user.getAddress(),user.getPhone());
                Toast.makeText(AddUserActivity.this, "Usuario guardado", Toast.LENGTH_SHORT).show();

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
