package com.hillel.lecture_13;

public class MainEx {

    public static void main(String[] args) {
        System.out.println("Start application");

        try {
            int result = 10/0;
        } catch (ArithmeticException e){
            e.printStackTrace();
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement stackTraceElement: stackTraceElements) {

            }
        }


        System.out.println("Stop application");
    }

}
