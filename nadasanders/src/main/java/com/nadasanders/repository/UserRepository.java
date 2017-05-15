package com.nadasanders.repository;

import com.nadasanders.pojo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juilee on 5/15/2017.
 */
public interface UserRepository extends CrudRepository<User,Long> {

    User findDistinctByUserNameAndPassword(String userName, String password);
}
