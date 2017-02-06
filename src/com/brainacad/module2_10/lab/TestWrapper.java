package com.brainacad.module2_10.lab;

/**
 * Created by Дима on 03.02.2017.
 */

// lab2_10_1
class TestWrapper1 {
    void testCash() {
        Integer x1 = 15;
        Integer x2 = new Integer(15);
        Integer x3 = Integer.valueOf(15);
        Integer x4 = Integer.parseInt("15");

        System.out.println();
        System.out.println("Compare number if there is a CASH");
        System.out.println();
        System.out.println("Compare x1 == x2 -> " + (x1 == x2));
        System.out.println("Compare x1 == x3 -> " + (x1 == x3));
        System.out.println("Compare x1 == x4 -> " + (x1 == x4));
        System.out.println();
        System.out.println("Compare x2 == x3 -> " + (x2 == x3));
        System.out.println("Compare x2 == x4 -> " + (x2 == x4));
        System.out.println();
        System.out.println("Compare x3 == x4 -> " + (x3 == x4));

        System.out.println();
        System.out.println("x1.equals(x2) -> " + x1.equals(x2));
        System.out.println("x1.equals(x3) -> " + x1.equals(x3));
        System.out.println("x1.equals(x4) -> " + x1.equals(x4));
        System.out.println();
        System.out.println("x2.equals(x3) -> " + x2.equals(x3));
        System.out.println("x2.equals(x4) -> " + x2.equals(x4));
        System.out.println();
        System.out.println("x3.equals(x4) -> " + x3.equals(x4));
        System.out.println();

    }

    void testNoCash() {
        Integer x1 = 357;
        Integer x2 = new Integer(357);
        Integer x3 = Integer.valueOf(357);
        Integer x4 = Integer.parseInt("357");

        System.out.println();
        System.out.println("Compare number if there is NO CASH");
        System.out.println();
        System.out.println("Compare x1 == x2 -> " + (x1 == x2));
        System.out.println("Compare x1 == x3 -> " + (x1 == x3));
        System.out.println("Compare x1 == x4 -> " + (x1 == x4));
        System.out.println();
        System.out.println("Compare x2 == x3 -> " + (x2 == x3));
        System.out.println("Compare x2 == x4 -> " + (x2 == x4));
        System.out.println();
        System.out.println("Compare x3 == x4 -> " + (x3 == x4));

        System.out.println();
        System.out.println("x1.equals(x2) -> " + x1.equals(x2));
        System.out.println("x1.equals(x3) -> " + x1.equals(x3));
        System.out.println("x1.equals(x4) -> " + x1.equals(x4));
        System.out.println();
        System.out.println("x2.equals(x3) -> " + x2.equals(x3));
        System.out.println("x2.equals(x4) -> " + x2.equals(x4));
        System.out.println();
        System.out.println("x3.equals(x4) -> " + x3.equals(x4));
        System.out.println();

    }

    void test() {
        testCash();
        testNoCash();
    }
}

// lab2_10_2
class TestWrapper2 {
    static Long computeBI(Byte numAsByte, Integer numAsInteger) {

        return new Long(numAsByte + numAsInteger);
//        return (long)(numAsByte + numAsInteger);
    }

    static Long computeID(Integer numAsInteger, Double numAsDouble) {

        return numAsInteger + (long)numAsDouble.doubleValue();
    }

    void test() {
        Byte x = 120;
        Integer y = 38392;
        Double z = 48348.94753;

        System.out.println("Long X = new Long(Byte + Integer) -> " + computeBI(x, y));

        System.out.println("Long X = Integer + Double -> " + computeID(y, z));
    }
}

// lab2_10_3
class TestWrapper3 {
    void test() {
        String rectangle = "Rectangle:RED:10,20";
        String triangle = "Triangle:GREEN:9,7,12";
        String circle = "Circle:BLACK:10";

        Shape[] shapes = new Shape[3];

        shapes[0] = Shape.parseShape(rectangle);
        shapes[1] = Shape.parseShape(triangle);
        shapes[2] = Shape.parseShape(circle);

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}

// lab2_10_4
class TestWrapper4 {
    void test() {

    }
}

// lab2_10_5
class TestWrapper5 {
    void test() {

    }
}

public class TestWrapper {
    public static void main(String[] args) {
        // lab2_10_1
        TestWrapper1 tw1 = new TestWrapper1();
        tw1.test();
        // lab2_10_2
        TestWrapper2 tw2 = new TestWrapper2();
        tw2.test();
        // lab2_10_3
        TestWrapper3 tw3 = new TestWrapper3();
        tw3.test();
        // lab2_10_4
        TestWrapper4 tw4 = new TestWrapper4();
        tw4.test();
        // lab2_10_5
        TestWrapper5 tw5 = new TestWrapper5();
        tw5.test();
    }

}
