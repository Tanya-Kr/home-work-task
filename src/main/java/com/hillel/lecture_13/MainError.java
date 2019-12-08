package com.hillel.lecture_13;

public class MainError {

    public static void main(String[] args) {

        System.out.println("Start app");

        try {
            int result = calculation(-2, 5);
            System.out.println(result);
        } catch (Error e) {
            e.printStackTrace();
        }

        System.out.println("Stop app");

    }

    public static int calculation(int a, int b) {
        if(a < 0) {
            throw new AssertionError("because a < 0");
        }

        return a + b;
    }
}
