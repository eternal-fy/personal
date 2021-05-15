package com.ld.service;

import com.ld.dao.UserDao;
import com.ld.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
