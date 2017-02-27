package com.brainacad.module2_18.lab.test_core3;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Дима on 27.02.2017.
 */

// lab2_18_3

public class Main {
    public static void main(String[] args) {
        // current Locale
        System.out.println("Current Locale");
        Locale currentLocale = Locale.getDefault();
        NumberFormat nf = NumberFormat.getInstance(currentLocale);
        Currency currency = Currency.getInstance(currentLocale);
        Date date = new Date();

        System.out.println("CurrentLocale : " + currentLocale.getDisplayLanguage() + " (" + currentLocale.getDisplayCountry() + ")");
        System.out.println("Integer : " + nf.format(1231283198));
        System.out.println("Double : " + nf.format(474.8583));

        NumberFormat curFmt = NumberFormat.getCurrencyInstance(Locale.getDefault());

        System.out.println("Currency : " + currency.getDisplayName() + " : " + curFmt.format(329823982));
        System.out.println("Date : " + new Date());

        // forChina
        System.out.println("CHINA");
        NumberFormat nfChina = NumberFormat.getInstance(Locale.CHINA);
        System.out.println("Integer : " + nfChina.format(1231283198));
        System.out.println("Double : " + nfChina.format(474.8583));

        NumberFormat fmtChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Currency currChina = Currency.getInstance(Locale.CHINA);
        System.out.println("Currency : " + currChina.getDisplayName() + " : " + fmtChina.format(329823982));

        // It is needed to do for Italy

        // just experiment
//        DateFormat df = DateFormat.getDateInstance(0, Locale.GERMAN);
//        System.out.println(df.format(new Date()));

    }
}
