package com.hillel.lecture_4;

public class DoWhileLoopExample {
    public static void main(String[] args) {

        boolean isStarted = false;

        do {
            System.out.println("hey");
        } while (isStarted);

        int number = 20;
        int[] result = new int [number];

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int n3;
        result[0] = n0;
        result[1] = n1;
//        System.out.print(n0+" "+n1+" ");
        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            result[i] = n2;
//            System.out.print(n2 + " ");
            n1 = n2;
            n2 = n3;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("Student: " + result[i]);
        }
    }
}
