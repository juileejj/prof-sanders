package com.nadasanders.controller;

import com.nadasanders.pojo.User;
import com.nadasanders.pojo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Juilee on 5/15/2017.
 */

@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path="/login",method = RequestMethod.POST)
    public @ResponseBody
    User loginUser(@RequestParam String userName, @RequestParam String password)
    {
        return new User();
    }

}
