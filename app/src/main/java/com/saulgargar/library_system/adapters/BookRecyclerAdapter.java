package com.saulgargar.library_system.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.models.Book;

import java.util.ArrayList;

public class BookRecyclerAdapter extends RecyclerView.Adapter<BookRecyclerAdapter.BookViewHolder>{

    private ArrayList<Book> books;
    private Context context;
    //private DataBaseHandler dataBaseHandler;

    public static class BookViewHolder extends RecyclerView.ViewHolder{

        private TextView bookTitle;
        private TextView bookLocation;
        private TextView bookEditorial;
        private TextView bookNumberOfCopies;

        public BookViewHolder(View itemView) {
            super(itemView);

            bookTitle = itemView.findViewById(R.id.book_title);
            bookLocation = itemView.findViewById(R.id.book_location);
            bookEditorial = itemView.findViewById(R.id.book_editorial);
            bookNumberOfCopies = itemView.findViewById(R.id.examples_number);
        }
    }

    public BookRecyclerAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_book, parent, false);

        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        final Book book = books.get(position);

        holder.bookTitle.setText(book.getTitle());
        holder.bookLocation.setText(book.getLocation());
        holder.bookEditorial.setText(book.getEditorial());
        holder.bookNumberOfCopies.setText(book.getNumberOfCopies());

    }

    @Override
    public int getItemCount() {
        return books.size();
    }


}
