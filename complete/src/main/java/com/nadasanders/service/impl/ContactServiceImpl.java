package com.nadasanders.service.impl;

import com.nadasanders.entity.ContactEntity;
import com.nadasanders.service.ContactService;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

/**
 * Created by Juilee on 5/17/17.
 */
@Service
public class ContactServiceImpl implements ContactService {

    private static final String FROM = "safetymeter@mail.com";
    private static final String USERNAME = "safetymeter@mail.com";
    private static final String PASSWORD = "@dmin@123";
    private static final String HOSTNAME = "smtp.mail.com";
    private static final int HOSTPORT = 587;
    private static final String TO = "jadhav.j@husky.neu.edu";

    @Override
    public void sendEmail(ContactEntity contactEntity) {

        Email email = new SimpleEmail();
        email.setHostName(HOSTNAME);
        email.setSmtpPort(HOSTPORT);
        email.setAuthentication(USERNAME, PASSWORD);
        email.setSSLOnConnect(true);
        try {
            email.setFrom(FROM);
            email.setSubject(contactEntity.getSubject());
            email.setMsg(composeMessage(contactEntity));
            email.addTo(TO);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

    private String composeMessage(ContactEntity contactEntity) {
        return contactEntity.getMessage();
    }
}
