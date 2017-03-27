package com.brainacad.module3.lab.lab3_2.lab3_2_123;

import java.io.Serializable;

/**
 * Created by diman on 27.03.2017.
 */

// lab3_2_123
public class Employee implements Serializable {

    private String name;
    private String address;
    // lab3_2_123
//    private int ssn;
    // lab3_2_3
    private transient int ssn;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", number=" + number +
                '}';
    }

}
