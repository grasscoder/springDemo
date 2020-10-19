package com.springstudy;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Person {

    @Resource
    private Cat cat;

    @Autowired
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
