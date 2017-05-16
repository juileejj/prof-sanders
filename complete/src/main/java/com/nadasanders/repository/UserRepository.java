package com.nadasanders.repository;

import org.springframework.data.repository.CrudRepository;

import com.nadasanders.pojo.User;

/**
 * Created by Juilee on 5/15/2017.
 */

public interface UserRepository extends CrudRepository<User, Long> {
    User findDistinctByUserNameAndPassword(String userName, String password);
}
