package com.saulgargar.library_system.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.models.Author;

import java.util.ArrayList;

public class AuthorRecyclerAdapter extends RecyclerView.Adapter<AuthorRecyclerAdapter.AuthorViewHolder>{

    private ArrayList<Author> authors;
    private Context context;
    //private DataBaseHandler dataBaseHandler;

    public static class AuthorViewHolder extends RecyclerView.ViewHolder{

        private TextView authorName;
        private TextView booksNumber;

        public AuthorViewHolder(View itemView) {
            super(itemView);

            authorName = itemView.findViewById(R.id.author_name);
            booksNumber = itemView.findViewById(R.id.books_number);
        }
    }

    public AuthorRecyclerAdapter(ArrayList<Author> authors, Context context) {
        this.authors = authors;
        this.context = context;
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_author, parent, false);

        return new AuthorRecyclerAdapter.AuthorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int position) {

        final Author author = authors.get(position);

        holder.authorName.setText(author.getName());
        holder.booksNumber.setText(String.valueOf(author.getBooks().size()));

    }

    @Override
    public int getItemCount() {
        return authors.size();
    }

}
