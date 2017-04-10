package com.brainacad.module3.lab.lab3_7.lab3_7_123;

/**
 * Created by diman on 10.04.2017.
 */

// lab3_7_3

@FunctionalInterface
public interface MyConverter {

    String convertStr(String str);

    static boolean isNull(String str) {
        if (str == null) {
            return true;
        } else {
            return false;
        }
    }
}
