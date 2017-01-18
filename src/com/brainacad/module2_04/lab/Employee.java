package com.brainacad.module2_04.lab;

/**
 * Created by Дима on 18.01.2017.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNumberofEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberofEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee[] myEmployees = new Employee[10];

        myEmployees[0] = new Employee("Dima","Popov","manager","123412");
        myEmployees[1] = new Employee("Andrey","Grigorenko","chief","54352234");
        myEmployees[2] = new Employee("Tanya","Tkachenko","head of department","773545");
        myEmployees[3] = new Employee("Masha","Ostapenko","cleaner","1342351");
        myEmployees[4] = new Employee("Ivan","Lishenko","manager","76523351");

        for(int i = 0; i < Employee.getNumberofEmployees(); i++) {
            System.out.println(myEmployees[i]);
        }

        System.out.println();
        System.out.println("Number of employees is " + Employee.getNumberofEmployees());

    }


}



