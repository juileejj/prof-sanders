package com.nadasanders.nadasanders;

import com.nadasanders.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juilee on 5/15/2017.
 */
@ComponentScan
public interface UserRepository extends CrudRepository<User, Long> {

    User findDistinctByUserNameAndPassword(String userName, String password);
}
