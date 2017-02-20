package com.brainacad.module2_15.lab.test_map1;

import com.sun.java.accessibility.util.Translator;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Дима on 17.02.2017.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary;

    public MyTranslator() { dictionary = new HashMap<>();}

    public void addNewWord(String en, String ru) {
        en = en.toLowerCase();
        ru = ru.toLowerCase();
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        String result = null;
        en = en.toLowerCase();
        if (dictionary.containsKey(en)) {
            result = dictionary.get(en);
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();
        fillDictionary(translator);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text : ");
        String text = sc.nextLine();
        translateText(text, translator);
        System.out.println();
    }

    public static void fillDictionary(MyTranslator translator) {
        translator.addNewWord("Cat","кот");
        translator.addNewWord("mouse","мышь");
        translator.addNewWord("caught","поймал");
    }

    public static void translateText(String text, MyTranslator translator) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(translator.translate(words[i]) + " ");
        }
    }

}
