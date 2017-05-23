package com.nadasanders.service;

import com.nadasanders.entity.ContactEntity;

/**
 * Created by Juilee on 5/17/17.
 */
public interface ContactService {
    void sendEmail(ContactEntity contactEntity);
}
