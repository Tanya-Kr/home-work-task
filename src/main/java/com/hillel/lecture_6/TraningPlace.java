package com.hillel.lecture_6;

import java.util.SplittableRandom;

public class TraningPlace {
    public static void main(String[] args) {

//        String hello = "Hello student!";
//
//        String[] split = hello.split(" ");
//        for (String word : hello.split(" ")) {
//            word = word.substring(0,1).toUpperCase() + word.substring(1);
//
//        }
//        System.out.print(hello);

//        String st = "the sentence you want to apply caps to";
//        String [] wo = st.split(" ");
//        String n = "";
//        for(String w: wo)
//
//            w = w.toUpperCase().replace(w.substring(1), w.substring(1).toLowerCase());
//
//            n += w;


        String sentence = "a String in Java is actually an object, which contain methods that can perform certain operations on strings." +
                " for example, the length of a string can be found with the length() method";
        String result = "";
        String delimeter = "(?<=\\. )";
        for (String word : sentence.split(delimeter)) {
            System.out.println(word);
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            result += word;
        }

        System.out.println(result);



    }


}