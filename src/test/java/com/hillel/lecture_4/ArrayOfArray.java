package com.hillel.lecture_4;

public class ArrayOfArray {
    public static void main(String[] args) {
//        int[][] array = new int[3][3];
        int[][] array = {{1, 2, 6}, {5, 6,7}};

        int[] a = array[1];
        int b = array[1][1];
        System.out.println(a[1]);
        System.out.println(b);
    }

}
