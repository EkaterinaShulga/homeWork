package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(" new words");
        System.out.println(" new words2");

        String CONTACT_TEXT_PATTERN = "([\\W+]+)(\\s)([0-9]{11})(\\s)([\\W+]+)";
        Pattern pattern = Pattern.compile(CONTACT_TEXT_PATTERN);
        String text = "Шарик 89061855572 Иванов Иван Иванович ";
        Matcher matcher = pattern.matcher(text);

       if (matcher.matches()) {
          String name = matcher.group(1);
           String age = matcher.group(3);
            String color = matcher.group(5);

           System.out.println(name);
           System.out.println(age);
           System.out.println(color);

       }System.out.println(text);

       List<String> words = new ArrayList<>();
       words.add("text");
       words.add("words");
        System.out.println(words.toString());

    }
}

