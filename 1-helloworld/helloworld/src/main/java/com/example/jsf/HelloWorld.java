package com.example.jsf;

import javax.faces.bean.ManagedBean;

// ManagedBean is a java bean managed by JSF framework
// If eager = "true" then managed bean is created before it is requested for the first time
// otherwise "lazy" initialization is used in which bean will be created only when it is requested
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World by Mano!";
    }
}