package com.nadasanders.service;

import com.nadasanders.pojo.User;

/**
 * Created by ajinkya on 5/16/17.
 */
public interface UserService {
    User authenticateUser(String username, String password);
}
