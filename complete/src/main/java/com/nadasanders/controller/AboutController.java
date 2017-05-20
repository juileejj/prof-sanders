package com.nadasanders.controller;

import com.nadasanders.entity.AboutEntity;
import com.nadasanders.pojo.About;
import com.nadasanders.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ajinkya on 5/20/17.
 */
@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @PostMapping
    public About addAbout(@RequestBody AboutEntity aboutEntity, HttpServletResponse response) throws IOException {
        About saved = aboutService.addAbout(aboutEntity);
        if (saved != null) {
            return saved;
        } else {
            response.sendError(500, "Can not create about");
            return null;
        }
    }

    @GetMapping
    public About getAbout(@RequestParam Long aboutId, HttpServletResponse response) throws IOException {
        About about = aboutService.getAbout(aboutId);
        if (about != null) {
            return about;
        } else {
            response.sendError(404, "Can not locate record in database");
            return null;
        }
    }

    @DeleteMapping
    public Boolean deleteAbout(@RequestParam Long aboutId, HttpServletResponse response) throws IOException {
        Boolean result = aboutService.deleteAbout(aboutId);
        if (result) {
            return true;
        } else {
            response.sendError(404, "Can not locate record in database");
            return false;
        }
    }
}
