package com.hillel.lecture_4;

public class LectudeTask {
    public static void main(String[] args) {
       boolean result = evenOrOdd(45);
        System.out.println(result);
        int[] data = {5,6,7};
        int result2 = sumOfArray(data);
        String result1 = unicodeArray(data);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static boolean evenOrOdd(int number) {
        boolean result;

        if(number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for(int i = 0; i <= array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        return sum;
    }


    public static String unicodeArray(int[] data) {
    String result = "";
    char temp;
        for (int i = 0; i < data.length; i++) {
            temp = (char) data[i];
            result += temp;
        }
        return result;
    }
}
