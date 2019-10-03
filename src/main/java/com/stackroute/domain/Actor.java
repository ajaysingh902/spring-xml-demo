package com.stackroute.domain;

public class Actor {
    private int age;
    private String name;
    private String gender;

//    public Actor(int age) {
//        this.age = age;
//    }


    public Actor(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
}
