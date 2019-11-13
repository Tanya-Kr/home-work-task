package com.hillel.lecture_6;

import java.lang.reflect.Array;
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


//        String sentence = "a String in Java is actually an object, which contain methods that can perform certain operations on strings." +
//                " for example, the length of a string can be found with the length() method";
//        String result = "";
//        String delimeter = "(?<=\\. )";
//        for (String word : sentence.split(delimeter)) {
//            System.out.println(word);
//            word = word.substring(0,1).toUpperCase() + word.substring(1);
//            result += word;
//        }
//
//        System.out.println(result);

        long actual = 38458215;
        String StringActual = Long.toString(actual);
        long result;
        char[] number = Long.toString(actual).toCharArray();
        long[] allNumbers = new long[number.length];
        String x = "";
        String maxValue = StringActual;

        for (int i = 0; i < number.length+1; i++) {

            x = StringActual.substring(0, i).concat(StringActual.substring(i+1).concat(StringActual.substring(i, i+1)));
            StringActual = x;

            if (Long.parseLong(maxValue) < Long.parseLong(x)) {

                maxValue = x;
                System.out.println(maxValue);
//                i++;
            }

            String m = maxValue;

            System.out.println(m);
//            System.out.println(x);

            allNumbers[i] = Long.parseLong(x);

        }
//        System.out.println(maxValue);

//        long y = allNumbers[0];
//        for (int i = 1; i < allNumbers.length; i++) {
//            System.out.println(allNumbers[i]);
//            if (y < allNumbers[i]) {
//                y = allNumbers[i];
//                i++;
//            }
//        }
//
//        System.out.println(y);

//        char[] newNumber = new char[number.length];
//        for (int i = 0; i < number.length; i++) {
//            char temp = number[i];
//            newNumber[i] = number[i+1];
//            newNumber[number.length - 1] = temp;
//            System.out.println(newNumber[i]);
//        }

//        System.out.println(result);
    }


}