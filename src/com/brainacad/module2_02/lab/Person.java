package com.brainacad.module2_02.lab;

/**
 * Created by Дима on 03.12.2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void setPersonalData(String firstName) {

        this.firstName = firstName;
    }

    public void setPersonalData(String firstName, String lastName) {

        this.firstName = firstName;
        this.firstName = lastName;
    }

    public void setPersonalData(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.firstName = lastName;
        this.age = age;
    }

    public void setPersonalData(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.firstName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void setPersonalData(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.firstName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public void setPersonalData(String firstName,  int phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public void printPerson() {

        System.out.print("The person is : " + ((firstName != null)?("   First Name - " + firstName):("")));
        System.out.print((lastName != null)?("   Last Name - " + lastName):(""));
        System.out.print((age != 0)?("   Age - " + age):(""));
        System.out.print((gender != null)?("   Gender - " + gender):(""));
        System.out.println((phoneNumber != 0)?("   Phone Number - " + phoneNumber):(""));

    }
}

