package com.saulgargar.library_system.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.activities.AddBookActivity;
import com.saulgargar.library_system.activities.AddUserActivity;
import com.saulgargar.library_system.adapters.BookRecyclerAdapter;
import com.saulgargar.library_system.adapters.UserRecyclerAdapter;
import com.saulgargar.library_system.models.Book;
import com.saulgargar.library_system.models.User;
import com.saulgargar.library_system.services.DataBaseHandler;

import java.util.ArrayList;

import io.realm.Realm;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogUsersFragment extends Fragment {

    private FloatingActionButton addUserFab;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private UserRecyclerAdapter adapter;

    private ArrayList<User> users = new ArrayList<>();

    private DataBaseHandler dataBaseHandler = new DataBaseHandler(Realm.getDefaultInstance());


    public CatalogUsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_catalog_users, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        addUserFab = view.findViewById(R.id.add_user);
        addUserFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddUserActivity.class);
                getActivity().startActivity(intent);
            }
        });

        getTheData();

        return view;
    }

    public void getTheData(){

        users.addAll(dataBaseHandler.getUsersSaved());

        setRecyclerView();
    }

    public void setRecyclerView(){
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new UserRecyclerAdapter(users,getActivity());
        recyclerView.setAdapter(adapter);
    }

}
