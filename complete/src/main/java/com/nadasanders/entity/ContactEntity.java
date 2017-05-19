package com.nadasanders.entity;

/**
 * Created by ajinkya on 5/17/17.
 */
public class ContactEntity {
    private String email;
    private String subject;
    private String message;
    private String name;

    public ContactEntity() {
    }

    public ContactEntity(String email, String subject, String message, String name) {
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
