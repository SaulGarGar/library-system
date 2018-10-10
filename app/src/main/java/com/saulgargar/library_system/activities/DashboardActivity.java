package com.saulgargar.library_system.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.fragments.CatalogAuthorFragment;
import com.saulgargar.library_system.fragments.CatalogBookFragment;
import com.saulgargar.library_system.fragments.CatalogUsersFragment;

public class DashboardActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        setBottomNavigationView();
        setFragmentByDefault();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }

    public void setBottomNavigationView(){

        bottomNavigationView = findViewById(R.id.navigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                boolean fragmentTransaction = false;
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.books:
                        fragment = new CatalogBookFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.authors:
                        fragment = new CatalogAuthorFragment();
                        fragmentTransaction = true;
                        break;
                    case R.id.users:
                        fragment = new CatalogUsersFragment();
                        fragmentTransaction = true;
                        break;
                }

                if (fragmentTransaction){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container,fragment)
                            .commit();
                    item.setChecked(true);

                }

                return true;
            }
        });
    }

    private void setFragmentByDefault(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new CatalogBookFragment())
                .commit();

    }
}
