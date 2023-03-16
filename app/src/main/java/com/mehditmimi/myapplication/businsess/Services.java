package com.mehditmimi.myapplication.businsess;

import com.mehditmimi.myapplication.beans.User;

public interface Services {
    public User authenticate(String login, String pwd);
}
