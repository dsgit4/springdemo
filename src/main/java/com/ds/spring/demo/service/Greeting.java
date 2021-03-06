package com.ds.spring.demo.service;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public static String justToTest(String caller){
        return "Hello from Google Cloud12313!";
    }
}
