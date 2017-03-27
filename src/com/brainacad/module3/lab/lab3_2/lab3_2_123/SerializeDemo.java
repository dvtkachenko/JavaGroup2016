package com.brainacad.module3.lab.lab3_2.lab3_2_123;

import java.io.*;

/**
 * Created by diman on 27.03.2017.
 */

// lab3_2_123 and lab3_2_4

public class SerializeDemo {
    public static void main(String[] args) {

        // lab3_2_123 and lab3_2_3
        Employee emp = new Employee();

        emp.setName("Dmitriy Tkachenko");
        emp.setSsn(25364);
        emp.setNumber(567);
        emp.setAddress("Kiev, bul. Drujbi Narodov");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\files\\employee.ser"))) {
            oos.writeObject(emp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lab3_2_4 and lab3_2_3
        Employee emp1 = new Employee();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\files\\employee.ser"))) {
            emp1 = (Employee) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(emp1);

    }
}
