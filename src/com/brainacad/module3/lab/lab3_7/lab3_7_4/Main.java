package com.brainacad.module3.lab.lab3_7.lab3_7_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by diman on 10.04.2017.
 */
// lab3_7_4
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Stream
                            .<Integer>iterate(10, i -> i + 10)
                            .limit(10)
                            .map(x -> x/2)
                            .collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println();

        List<Person> persons = Arrays.asList(new Person("Andrey",15, Sex.MAN),
                new Person("Tanya",25, Sex.WOMAN),
                new Person("Ivan",25, Sex.MAN),
                new Person("Oksana",20, Sex.WOMAN),
                new Person("Tolik",35, Sex.MAN),
                new Person("Pavel",18, Sex.MAN),
                new Person("Anton",26, Sex.MAN),
                new Person("Lena",35, Sex.WOMAN),
                new Person("Ira",22, Sex.WOMAN),
                new Person("Petr",26, Sex.MAN),
                new Person("Sergey",24, Sex.MAN));

        persons.stream()
                .filter(p -> p.getAge() > 17 && p.getAge() < 28 && p.getGender() == Sex.MAN)
                .forEach(System.out::println);

        System.out.println();

        double averageAgeOfWomen = persons.stream()
                .filter(p -> p.getGender() == Sex.WOMAN)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println("Average age of all women = " + averageAgeOfWomen);
    }
}
