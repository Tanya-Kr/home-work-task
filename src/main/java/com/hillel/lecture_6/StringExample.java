package com.hillel.lecture_6;

public class StringExample {

    public static void main(String[] args) {
        String name = "Bob";
//        String lastName = new String("Ivanov");

        boolean empty = name.isEmpty();
        System.out.println(empty);

        boolean isContains = name.contains("b");
        System.out.println(isContains);

        String concat = name.concat(" Ivanov");
        System.out.println(concat);

        String toLowerCase = name.toLowerCase();
        String toUpperCase = name.toUpperCase();

        System.out.println(toLowerCase + toUpperCase);

        boolean isContains2 = name.toLowerCase().contains("b");
        System.out.println(isContains2);

        int length = name.length();
        System.out.println("length " + length);

        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
            char charAt1 = name.charAt(0);
            char charAt2 = name.charAt(1);
            char charAt3 = name.charAt(2);

            System.out.println(charAt1);

            String helloJava = "Hello Java!";
            String substring = helloJava.substring(3,8);
            System.out.println("substring " + substring);


            String replaceChar = helloJava.replaceAll("a", "o");
            System.out.println(helloJava);
            String replaceChar2 = helloJava.replaceAll(".", "");
            String replaceChar3 = helloJava.replaceFirst("a", "e");

            String adminUser = "admin";
            String guest = "guest";
            boolean equals = adminUser.equals(guest);
            System.out.println("equals " + equals);

            String hello = "Hello student!";

            String[] split = hello.split(" ");
            System.out.println("split " + split.length);

            for (String s: split){
                System.out.println(s);
            }

    }
}
