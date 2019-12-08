package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayList<String> listOfString = new ArrayList();

        listOfString.add("yellow");
        listOfString.add("green");
        listOfString.add("red");

        System.out.println(listOfString.size());

        listOfString.remove(2);

        boolean isContainsBlue = listOfString.contains("blue");

        listOfString.get(2);

        ArrayList<String> listOfString2 = new ArrayList();

        listOfString2.add("yellow");
        listOfString2.add("green");

        listOfString.removeAll(listOfString2);

        System.out.println(listOfString.size());

        for (String string: listOfString) {
            System.out.println(string);
        }
    }

}
