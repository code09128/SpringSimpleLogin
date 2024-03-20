package com.lei.thestation.service;

import com.lei.thestation.entity.User;

/**
 * Dustin.hsieh
 * 2024/2/23上午 09:24
 * Description:登入接口
 **/
public interface UserService {
    public User login(String email, String password);
}
