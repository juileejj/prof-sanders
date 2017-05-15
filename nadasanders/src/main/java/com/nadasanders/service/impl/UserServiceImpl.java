package com.nadasanders.service.impl;

import com.nadasanders.pojo.User;
import com.nadasanders.repository.UserRepository;
import com.nadasanders.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ajinkya on 5/15/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User authenticateUser(String userName, String password) {
        User verifiedUser = userRepository.findDistinctByUserNameAndPassword(userName, password);
        return verifiedUser;
    }
}
