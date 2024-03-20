package com.lei.thestation.repository.impl;

import com.lei.thestation.repository.UserDao;
import com.lei.thestation.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dustin.hsieh
 * 2024/2/23上午 09:19
 * Description:
 **/
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public User getUser(String email, String password) {
        logger.debug("調用 getUser(), email: {} password: {}", email,password);

        User user = null;

        if ("admin@lei.com.tw".equals(email)){
            if ("admin".equals(password)){
                user = new User();
                user.setEmail(email);
                user.setUsername("admin@lei.com.tw");

                logger.info("成功獲取 \"{}\"用戶訊息", user.getUsername());
            }
        }
        else{
            logger.warn("獲取失敗 \"{}\"", email);
        }

        return user;
    }
}
