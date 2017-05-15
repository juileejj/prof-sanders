package com.nadasanders.controller;

import com.nadasanders.pojo.User;
import com.nadasanders.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Juilee on 5/15/2017.
 */

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public @ResponseBody
    User loginUser(@RequestParam String userName, @RequestParam String password) {
        return new User();
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public @ResponseBody
    User authenticateUser(@RequestParam String userName,
                          @RequestParam String password,
                          HttpServletResponse response) throws IOException {
        User authenticatedUser = userService.authenticateUser(userName, password);
        if (authenticatedUser != null) {
            return authenticatedUser;
        } else {
            response.sendError(403, "Authentication Failure");
        }
        return null;
    }
}
