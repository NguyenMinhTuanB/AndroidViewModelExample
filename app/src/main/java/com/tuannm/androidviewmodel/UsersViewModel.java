package com.tuannm.androidviewmodel;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.ViewModel;

/**
 * Created by TuanNM on 31/12/2018.
 * descripsiont:
 */
public class UsersViewModel extends ViewModel {
    private List<User> mUsers;

    public List<User> getUsers() {
        if (mUsers == null) {
            mUsers = loadUsers();
        }
        return mUsers;
    }

    private List<User> loadUsers() {
        Log.d("TAG", "getUsers: only one time");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Nguyen Van A", "0912213960"));
        users.add(new User(2, "Nguyen Van B", "0912213961"));
        users.add(new User(3, "Nguyen Van C", "0912213962"));
        users.add(new User(4, "Nguyen Van D", "0912213963"));
        users.add(new User(5, "Nguyen Van E", "0912213964"));
        users.add(new User(6, "Nguyen Van F", "0912213965"));
        users.add(new User(7, "Nguyen Van G", "0912213966"));
        users.add(new User(8, "Nguyen Van H", "0912213967"));
        return users;
    }
}
