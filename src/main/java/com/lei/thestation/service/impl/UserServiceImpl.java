package com.lei.thestation.service.impl;

import com.lei.thestation.TheStationApplication;
import com.lei.thestation.entity.User;
import com.lei.thestation.repository.UserDao;
import com.lei.thestation.service.UserService;

/**
 * @author Admin
 * 2024/2/23 上午 11:37
 * Description:使用者登入處理
 **/
public class UserServiceImpl implements UserService {
    @Override
    public User login(String email, String password) {
        TheStationApplication context = new TheStationApplication();
        UserDao userDao = (UserDao) context.getBean("userDao");
        return userDao.getUser(email,password);
    }
}
