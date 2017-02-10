package com.brainacad.module2_13.lab.test_enum1;

import java.util.Scanner;

/**
 * Created by Дима on 10.02.2017.
 */

enum MyDayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

enum MyDayOfWeekBetter {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public MyDayOfWeekBetter nextDay() {
       MyDayOfWeekBetter[] mdwb = MyDayOfWeekBetter.values();

       int index = this.ordinal();

       if (index == 6)
           return mdwb[0];
       else
           return mdwb[index + 1];

    }

}

public class Main {
    public static void main(String[] args) {

        // lab_2_13_1
        System.out.println();
        System.out.println("Result of lab2_13_1");

        for (MyDayOfWeek mdw : MyDayOfWeek.values()) {
            System.out.println(mdw);
        }

        // lab2_13_2
        System.out.println();
        System.out.println("Result of lab2_13_2");

        for (MyDayOfWeek mdw : MyDayOfWeek.values()) {

            switch(mdw) {
                case  MONDAY: case WEDNESDAY : case FRIDAY : System.out.println("My Java day : " + mdw);
            }

        }

        // lab2_13_3
        System.out.println();
        System.out.println("Result of lab2_13_3");
        System.out.println("Please enter the week day : ");

        Scanner getDay = new Scanner(System.in);
        String weekDay = getDay.next();
        weekDay = weekDay.toUpperCase();

      try {

          MyDayOfWeekBetter mdwb = MyDayOfWeekBetter.valueOf(weekDay);
          System.out.println("Te next day of week " + mdwb.nextDay());

        }
            catch (IllegalArgumentException e)  {
                System.out.println("Day is not correct ! Please enter only weeks day !");
        }

    }
}