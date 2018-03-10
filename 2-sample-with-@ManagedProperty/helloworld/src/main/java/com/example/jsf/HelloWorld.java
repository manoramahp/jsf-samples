package com.example.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

// ManagedBean is a java bean managed by JSF framework
// If eager = "true" then managed bean is created before it is requested for the first time
// otherwise "lazy" initialization is used in which bean will be created only when it is requested
@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

//  JSF is a simple static Dependency Injection (DI) framework.
//  Using @ManagedProperty annotation, a managed bean's property can be injected in another managed bean.
    @ManagedProperty(value = "#{message}")
    private Message messageBean;
    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        if(messageBean != null) {
            return messageBean.getMessage();
        }
        return message;
    }

//  when @ManagedProperty is using, this setter method is mandatory
    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
}