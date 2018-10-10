package com.saulgargar.library_system.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.activities.AddAuthorActivity;
import com.saulgargar.library_system.activities.AddBookActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogBookFragment extends Fragment {

    private FloatingActionButton addBookFab;


    public CatalogBookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_catalog_book, container, false);

        addBookFab = view.findViewById(R.id.add_book);
        addBookFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddBookActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }

}
