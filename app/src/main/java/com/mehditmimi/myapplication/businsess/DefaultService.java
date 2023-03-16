package com.mehditmimi.myapplication.businsess;

import com.mehditmimi.myapplication.beans.User;
import com.mehditmimi.myapplication.dao.UserDao;

public class DefaultService implements Services {
    private UserDao userDao;

    public DefaultService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User authenticate(String login, String pwd) {
        User user = userDao.get(login);
        if(user == null){
            return null;
        }
        if (user.getPwd().equals(pwd)){
            return user;

        } else {
        return null;
    }
}
}
