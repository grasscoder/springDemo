package com.springstudy;

public class Dog {

    private String type;

    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        System.out.println("狗叫");
    }

    public void setName(String name) {
        this.name = name;
    }

}
