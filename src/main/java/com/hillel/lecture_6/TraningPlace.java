package com.hillel.lecture_6;

import java.lang.reflect.Array;
import java.util.SplittableRandom;

public class TraningPlace {
    public static void main(String[] args) {

        long actual = 38458215;
        String StringActual = Long.toString(actual);
        long result;
        char[] number = Long.toString(actual).toCharArray();
        String x = "";
        String maxValue = StringActual;

        for (int i = 0; i < number.length; i++) {
            x = StringActual.substring(0, i).concat(StringActual.substring(i+1).concat(StringActual.substring(i, i+1)));
            StringActual = x;
            if (Long.parseLong(maxValue) < Long.parseLong(x)) {
                maxValue = x;
            }
        }
        System.out.println(maxValue);



        }


}