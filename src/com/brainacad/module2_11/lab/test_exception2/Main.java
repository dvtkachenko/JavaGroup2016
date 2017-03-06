package com.brainacad.module2_11.lab.test_exception2;

/**
 * Created by Дима on 06.03.2017.
 */

// lab2_11_2
class MyException extends Exception {
    private String msg;

    MyException(String msg) {
        this.msg = msg;
    }

    public void printMessage() {
        System.out.println("My message is " + msg);
    }
}

class MyTest {
    public void test() throws MyException {
        throw new MyException("Test class MyTest & MyException");
    }
}

// lab2_11_2
public class Main {
    public static void main(String[] args) throws MyException {
        // test MyException
        try {
            throw new MyException("Test MyException");
        } catch (MyException mE) {
            mE.printMessage();
        }

        // test MyTest & MyException
        try {
            new MyTest().test();
        } catch (MyException mE) {
            mE.printMessage();
        }

        // test null reference with & without try & catch
        MyTest myTest = null;
//        myTest.test();
        try {
            myTest.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
