package com.lei.thestation.repository;

import com.lei.thestation.entity.User;

/**
 * Dustin.hsieh
 * 2024/2/22下午 04:20
 * Description:使用者資料接口
 **/
public interface UserDao {
    /**
     * 根據信箱跟密碼獲得使用者資料
     * @param email
     * @param password
     * @return
     */
    public User getUser(String email, String password);
}
