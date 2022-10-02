package com.example.springboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CreatePeople {
    @Value("可以创建用户")
    private String name;
    @Value("3")
    private Integer age;

    public CreatePeople(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public CreatePeople() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "createPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
