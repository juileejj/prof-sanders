package com.nadasanders.controller;

import com.nadasanders.entity.ContactEntity;
import com.nadasanders.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Juilee on 5/17/17.
 */
@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    public void contactUsEmailAction(@RequestBody ContactEntity contactEntity) {
        contactService.sendEmail(contactEntity);
    }
}
