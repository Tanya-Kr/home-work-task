package com.hillel.lecture_4;

public class WhileLoopExample {
    public static void main(String[] args) {

//        boolean isStarter = true;
//
//        while (isStarter) {
//            System.out.println("hey");
//            isStarter = false;
//            break;
//        }

        int min = 1;
        int max = 10;

//        while (min < max) {
//            System.out.println("min: " + min + ", max: " + max);
////            min++;
//            max--;
//        }

        boolean isStarter = true;
        while (isStarter) {
            System.out.println("min: " + min + ", max: " + max);
            if (min == 5) {
                isStarter = false;
            }
            min++;
//
        }

    }
}
