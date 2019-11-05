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

      String word = "help";
      char[] letters = word.toCharArray();
//      char[] words = new char[word.length()];

//        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < letters.length; j++) {
                if (j != letters.length - 1) {
                    char letterToEnd = letters[j];
                    letters[letters.length - 1] = letterToEnd;
                    letters[j] = letters[j + 1];
//                } else {
//                    letters[j] = letterToEnd;
                }

//            }
            word = String.valueOf(letters);
            System.out.println(word);
        }





    }

}
