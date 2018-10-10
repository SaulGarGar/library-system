package com.saulgargar.library_system.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saulgargar.library_system.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogBookFragment extends Fragment {


    public CatalogBookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_catalog_book, container, false);
    }

}
