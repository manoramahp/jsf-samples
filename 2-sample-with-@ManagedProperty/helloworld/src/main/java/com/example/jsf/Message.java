package com.example.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
    private String message = "Hello World! In Message class";

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}