package com.nadasanders.service;

import com.nadasanders.pojo.User;

/**
 * Created by ajinkya on 5/15/17.
 */
public interface UserService {
    /**
     * Authenticates user by its userName
     * @param userName is accepted from controller
     * @param password is accepted from controller
     * @return User if authenticated otherwise return null
     */
     User authenticateUser(String userName, String password);
}
