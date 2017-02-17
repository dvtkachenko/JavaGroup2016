package com.brainacad.module2_15.lab.test_map1;

import java.util.HashMap;

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

// fill from foto !
class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();
        fillDictionary(translator);
    }

    public static void fillDictionary(MyTranslator translator) {

    }
}
