package com.saulgargar.library_system.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.activities.AddAuthorActivity;
import com.saulgargar.library_system.adapters.AuthorRecyclerAdapter;
import com.saulgargar.library_system.models.Author;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogAuthorFragment extends Fragment {

    private FloatingActionButton addAuthorFab;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AuthorRecyclerAdapter adapter;

    private ArrayList<Author> authors = new ArrayList<>();

    public CatalogAuthorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_catalog_author, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        addAuthorFab = view.findViewById(R.id.add_author);
        addAuthorFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddAuthorActivity.class);
                getActivity().startActivity(intent);
            }
        });

        getTheData();

        return view;
    }

    public void getTheData(){

        setRecyclerView();
    }

    public void setRecyclerView(){
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AuthorRecyclerAdapter(authors,getActivity());
        recyclerView.setAdapter(adapter);
    }

}
