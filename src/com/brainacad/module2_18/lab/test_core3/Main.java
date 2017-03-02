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
        // for current Locale
        System.out.println("Current Locale");
        Locale currentLocale = Locale.getDefault();
        NumberFormat currentNF = NumberFormat.getInstance(currentLocale);
        NumberFormat currentCurrencyNF = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Currency currentCurrency = Currency.getInstance(currentLocale);

        System.out.println("CurrentLocale : " + currentLocale.getDisplayLanguage() + " (" + currentLocale.getDisplayCountry() + ")");
        System.out.println("Integer : " + currentNF.format(1231283198));
        System.out.println("Double : " + currentNF.format(474.8583));
        System.out.println("Currency : " + currentCurrency.getDisplayName() + " : " + currentCurrencyNF.format(329823982));
        System.out.println("Date : " + new Date());

        // for China
        System.out.println();
        System.out.println("CHINA");
        NumberFormat chinaNF = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat chinaCurrencyNF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Currency chinaCurrency = Currency.getInstance(Locale.CHINA);

        System.out.println("Integer : " + chinaNF.format(1231283198));
        System.out.println("Double : " + chinaNF.format(474.8583));
        System.out.println("Currency : " + chinaCurrency.getDisplayName() + " : " + chinaCurrencyNF.format(329823982));

        // for Italy
        System.out.println();
        System.out.println("ITALY");
        NumberFormat italyNF = NumberFormat.getInstance(Locale.ITALY);
        NumberFormat italyCurrencyNF = NumberFormat.getCurrencyInstance(Locale.ITALY);
        Currency italyCurrency = Currency.getInstance(Locale.ITALY);

        System.out.println("Integer : " + italyNF.format(1231283198));
        System.out.println("Double : " + italyNF.format(474.8583));
        System.out.println("Currency : " + italyCurrency.getDisplayName() + " : " + italyCurrencyNF.format(329823982));

        // just experiment
//        DateFormat df = DateFormat.getDateInstance(0, Locale.GERMAN);
//        System.out.println(df.format(new Date()));

    }
}
