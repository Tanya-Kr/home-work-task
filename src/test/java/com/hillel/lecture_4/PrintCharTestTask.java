package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */
public class PrintCharTestTask {

    public static void main(String[] args) {

        String code = "";
        for (int i = 135; i < 255; i++) {
            code = Character.toString((char)i);
            System.out.println(code);
        }
    }

}
