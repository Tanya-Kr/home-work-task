package com.hillel.lecture_6;

public class TraningPlace {
    public static void main(String[] args) {

//        String hello = "Hello student!";
//
//        String[] split = hello.split(" ");
//        for (String word : hello.split(" ")) {
//            word = word.substring(0,1).toUpperCase() + word.substring(1);
//
//        }
//        System.out.print(hello);

//        String st = "the sentence you want to apply caps to";
//        String [] wo = st.split(" ");
//        String n = "";
//        for(String w: wo)
//
//            w = w.toUpperCase().replace(w.substring(1), w.substring(1).toLowerCase());
//
//            n += w;

//      String word = "help";
//      char[] letters = word.toCharArray();
//
//            for (int i = 0; i < letters.length; i++) {
//                if (i != letters.length - 1) {
//                    char letterToEnd = letters[i];
//                    for (int j = letters.length; j > i; j--) {
//
//
//                        letters[i] = letters[i + 1];
//
//                        letters[letters.length - 1] = letterToEnd;
//                    }
//                }
//            word = String.valueOf(letters);
//            System.out.println(word);
//        }

            String code = "AX6BYU56UX6CV6BNT7NM 287430";

            String code1 = code.substring(0, code.indexOf(" "));
            String code2 = code.substring(code.indexOf(" ")+1);

            char[] code1Chars = code1.toCharArray();

            for (int i = 0; i < code1Chars.length; i++) {

            }

            System.out.println(code1);
            System.out.println(code2);


    }

}
