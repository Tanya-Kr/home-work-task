package com.hillel.lecture_6;

public class StaticStringMethod {
    public static void main(String[] args) {
        String name = "Martin";
        int age = 30;
        String.valueOf(age);

        String stringAge = String.valueOf(age);
        System.out.println(stringAge);


        System.out.println(String.format("Result %s, %s", age, "Bob"));

        String join = String.join(", ", "Mark", "Igor", "Anna");
        System.out.println(join);

    }

    public static void formatString(String[] args, int data) {

    }
}
