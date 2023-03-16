package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.beans.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao{
    List<User> userList;

    public UserDaoMemory() {
        userList = new Vector<>();
        userList.add(new User("user1@gmail.com","1234","user1"));
        userList.add(new User("user2@gmail.com","1234","user2"));
        userList.add(new User("user3@gmail.com","1234","user3"));
        userList.add(new User("user4@gmail.com","1234","user4 "));

    }

    @Override
    public User get(String login) {
        for (User user:userList) {
            if (user.getLoign().equals(login)){
                return user;
            }
        }
        return null;
    }
}
