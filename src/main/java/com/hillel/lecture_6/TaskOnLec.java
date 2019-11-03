package com.hillel.lecture_6;

import java.lang.reflect.Array;
import java.util.Random;

public class TaskOnLec {

    public static void main(String[] args) {

//        getRandom();
//
//        public static String getRandom (int random) {
//
//        }

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int randomStringLength = 17;
        char[] randomCharArray = new char[randomStringLength];

        for(int i = 0; i <= randomStringLength; i++) {
            Random random = new Random();
            int s = random.nextInt(alphabet.length);
            randomCharArray[i] = alphabet[s];
        }
        String text = String.valueOf(randomCharArray);
        System.out.println(text);

    }
}
