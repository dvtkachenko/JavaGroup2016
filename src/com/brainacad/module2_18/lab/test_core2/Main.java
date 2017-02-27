package com.brainacad.module2_18.lab.test_core2;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Дима on 27.02.2017.
 */

// lab2_18_2
public class Main {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("1");
        int count = 0;
        while (money.compareTo(BigDecimal.valueOf(0)) > 0 ) {
            count++;
            money = money.subtract(BigDecimal.valueOf(0.1*count));
        }
        System.out.println(count + " nails were bought");
        NumberFormat curFmt = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Money left over : " + curFmt.format(money));
    }
}
