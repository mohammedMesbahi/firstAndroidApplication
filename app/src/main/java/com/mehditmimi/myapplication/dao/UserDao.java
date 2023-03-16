package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.beans.User;

public interface UserDao {
    User get(String login);
}
