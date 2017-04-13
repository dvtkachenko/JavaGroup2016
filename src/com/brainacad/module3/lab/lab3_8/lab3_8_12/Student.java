package com.brainacad.module3.lab.lab3_8.lab3_8_12;

import java.io.Serializable;

/**
 * Created by diman on 12.04.2017.
 */

// lab3_8_1
public class Student implements Serializable{

    private static int next_id = 1;
    private String name;
    private String course;
    private int id;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        id = next_id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (!getName().equals(student.getName())) return false;
        return getCourse().equals(student.getCourse());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getCourse().hashCode();
        result = 31 * result + getId();
        return result;
    }
}
