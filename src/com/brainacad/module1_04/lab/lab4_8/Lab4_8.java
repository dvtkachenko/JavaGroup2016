package com.brainacad.module1_04.lab.lab4_8;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_8 {

    public static void main(String[] args) {

        byte byte_var = 98;
        short short_var = 27896;
        int int_var = 275853422;
        long long_var = 3943948356L;

        float float_var = 29484.49848F;
        double double_var = 393023439494.4784840;

        char char_var = '\u0047';

        System.out.println();
        System.out.println(" IT IS a VARIABLE");
        System.out.println();

        System.out.println("Type byte -> " + byte_var);
        System.out.println("Type short -> " + short_var);
        System.out.println("Type int -> " + int_var);
        System.out.println("Type long -> " + long_var);
        System.out.println("Type float -> " + float_var);
        System.out.println("Type double -> " + double_var);
        System.out.println("Type char -> " + char_var);


        System.out.println();
        System.out.println(" IT IS a WIDENING Primitive Conversion");

        System.out.println();
        System.out.println("Result of typecasting byte to short, int, long, float, or double -> short " +
                +  (short)byte_var + "  int " +  (int)byte_var + "  long "
                +  (long)byte_var + "  float " +  (float)byte_var + "  double " +  (double)byte_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting char to int, long, float, or double -> int " +
                +  (int)char_var + "  long "
                +  (long)char_var + "  float " +  (float)char_var + "  double " +  (double)char_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting float to double " + (double)float_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting long to double " + (double)long_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println(" IT IS a NARROWING Primitive Conversion");

        System.out.println();
        System.out.println("Result of typecasting short to byte, char -> byte " + (byte)short_var + "  char " + (char)short_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting char to byte, short -> byte " + (byte)char_var + "  short " + (short)char_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting long to byte, short, char, int -> byte " +
                (byte)long_var + "  short " + (short)long_var + "  char " + (char)long_var + "  int " + (int)long_var);
        System.out.println("------------------------------------");

        System.out.println();
        System.out.println("Result of typecasting double to byte, short, char, int, long, float -> byte " +
                +  (byte)double_var + "  short " +  (short)double_var + "  char "
                +  (char)double_var + "  int " +  (int)double_var + "  long " +  (long)double_var + "  float " +  (float)double_var);
        System.out.println("------------------------------------");

    }
}
