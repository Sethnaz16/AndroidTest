package com.example.pisith.androidtest.collector;

/**
 * Created by Pisith on 10/28/16.
 */

public class Name {
    private String  name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Hello World");
    }
}
