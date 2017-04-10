package com.brainacad.module3.lab.lab3_7.lab3_7_4;

/**
 * Created by diman on 10.04.2017.
 */
// lab3_7_4
enum Sex {
    MAN, WOMAN
}

public class Person {
    private String name;
    private int age;
    private Sex gender;

    public Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
