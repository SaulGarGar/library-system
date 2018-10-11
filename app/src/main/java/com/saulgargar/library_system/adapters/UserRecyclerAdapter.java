package com.saulgargar.library_system.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saulgargar.library_system.R;
import com.saulgargar.library_system.models.User;

import java.util.ArrayList;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder>{

    private ArrayList<User> users;
    private Context context;
    //private DataBaseHandler dataBaseHandler;

    public static class UserViewHolder extends RecyclerView.ViewHolder{

        private TextView userName;
        private TextView userAddress;
        private TextView userPhone;
        private TextView borrowedBooks;

        public UserViewHolder(View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.user_name);
            userPhone = itemView.findViewById(R.id.user_phone);
            userAddress = itemView.findViewById(R.id.user_address);
            borrowedBooks = itemView.findViewById(R.id.borrowed_books);
        }
    }

    public UserRecyclerAdapter(ArrayList<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_user, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        final User user = users.get(position);

        holder.userName.setText(user.getName());
        holder.userPhone.setText(user.getPhone());
        holder.userAddress.setText(user.getAddress());
        //holder.borrowedBooks.setText(String.valueOf(user.getCopiesBorrowed().size()));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
