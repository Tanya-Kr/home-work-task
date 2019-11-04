package com.hillel.lecture_4;

public class DoWhileLoopExample {
    public static void main(String[] args) {

        int[][] array = {{2, 5}, {9, 3}, {1, 1}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > array[i+1][j]) {
                    System.out.print(array[i][j] + " | " );
                    System.out.print("row_1 is bigger" );
                } else if (array[i][j] < array[i+1][j]) {
                    System.out.print(array[i][j] + " | " );
                    System.out.print("row_2 is bigger" );
                }

            }
            System.out.println();

        }

    }
}
