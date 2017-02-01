package com.brainacad.module2_09.lab;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Дима on 01.02.2017.
 */

// lab2_9_1
class TestString1 {
    public static String reverseString(String str) {

//        StringBuilder sb = new StringBuilder(str);
        return (new StringBuilder(str)).reverse().toString();
    }

    void test() {
        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(TestString1.reverseString(myStr));
        System.out.println();
    }
}

// lab2_9_2
class TestString2 {

    void test() {
        String myStr1 = "Cartoon", myStr2 = "Tomcat";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStr1.length(); i++) {
            if(myStr2.indexOf(myStr1.charAt(i)) < 0) {
                sb.append(myStr1.charAt(i));
            }
        }
        System.out.println(sb.toString());
        System.out.println();
    }
}

// lab2_9_3
class TestString3 {

    public static char[] uniqueChars(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (sb.indexOf(String.valueOf(str.charAt(i))) < 0)
                sb.append(str.charAt(i));
        }

        return sb.toString().toCharArray();
    }

}

// lab2_9_4
class TestString4 {
    static void printTokenizer(String str, String delm) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, delm);
        System.out.println("String: " + str);
        System.out.println("Delimiter: " + "\"" + delm + "\"");
        while(stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println();
    }

    void test() {
        String myStr = "This is String, split by StringyTokenizer. Created by Student : Dmytry";
        printTokenizer(myStr, " |,|.");
        System.out.println();
    }
}

// lab2_9_5
class TestString5 {

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(userNameString);

        return matcher.matches();
    }

    void test() {
      String[] arrStr = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};

      for (String str : arrStr) {
          System.out.print("String : " + str + "  ");
          System.out.println(checkPersonWithRegExp(str));
      }
      System.out.println();
    }
}

public class MainTestString {
    public static void main(String[] args) {
        // do lab 2_9_1
        TestString1 ts1 = new TestString1();
        ts1.test();

        // do lab 2_9_2
        TestString2 ts2 = new TestString2();
        ts2.test();

        // do lab 2_9_3
        System.out.println(TestString3.uniqueChars("Using methods of class String"));

        // do lab 2_9_4
        TestString4 ts4 = new TestString4();
        ts4.test();

        // do lab 2_9_5
        TestString5 ts5 = new TestString5();
        ts5.test();

    }
}
