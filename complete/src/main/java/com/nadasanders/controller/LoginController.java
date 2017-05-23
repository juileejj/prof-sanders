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
@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public @ResponseBody
    User authenticateUser(@RequestParam String email,
                          @RequestParam String password,
                          HttpServletResponse response) throws IOException {

        User authenticatedUser = userService.authenticateUser(email, password);
        if (authenticatedUser != null) {
            return authenticatedUser;
        } else {
            response.sendError(401, "Authentication Failure");
        }
        return null;
    }
}
