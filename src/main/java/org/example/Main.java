package org.example;

public class Main {
    public static void main(String[] args) {

        String text = "Хочу стать программистом";
        String [] result = text.split(" ");
        for(String st:result){
            System.out.println(st);
        }

        String one = text.substring(0, 4);
        String two = text.substring(5, 10);
        String three = text.substring(11);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }
    }
