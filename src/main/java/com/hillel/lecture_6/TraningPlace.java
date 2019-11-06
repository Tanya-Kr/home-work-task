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
            boolean result;
            String code1 = code.substring(0, code.indexOf(" "));
            String code2 = code.substring(code.indexOf(" ")+1);

            int leng = code1.length();
            char[] code1Chars = code1.toCharArray();

            String[] numbers = new String[6];
            int counter = 0;
            int index = 0;

            for (int i = 0; i < code1Chars.length; i++) {
                if (Character.isDigit(code1Chars[i])) {
                    numbers[index] = Character.toString(code1Chars[i]);
                    index++;
                    counter += 1;
                }
            }

            if (counter < 6) {
                result = false;
            }

            int[] results = new int [6];
            int res = 1;
            for (int i = 0; i < numbers.length ; i++) {
                if (i % 2 != 0) {
                    String str = numbers[i-1] + numbers[i];
                    int number = Integer.parseInt(str);
                    res = res * number;
                }
            }

            if (res == Integer.parseInt(code2)) {
                result = true;
            }

    }

}
