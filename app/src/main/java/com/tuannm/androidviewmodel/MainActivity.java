package com.tuannm.androidviewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private UsersViewModel mUsersViewModel;
    private RecyclerView mRecyclerUsers;
    private UsersAdapter mUsersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsersViewModel = ViewModelProviders.of(this).get(UsersViewModel.class);
        mRecyclerUsers = findViewById(R.id.recycler_users);
        mRecyclerUsers.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        mUsersAdapter = new UsersAdapter(mUsersViewModel.getUsers());
        mRecyclerUsers.setAdapter(mUsersAdapter);
    }
}
