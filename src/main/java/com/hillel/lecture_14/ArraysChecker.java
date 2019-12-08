package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

//        TODO implements result

        ArrayList<String> revreceList = new ArrayList();

        for (int i = list.size() - 1; i >= 0; i--) {

            revreceList.add(list.get(i));
        }

        return revreceList;
    }

    public String getLongestString(List<String> list) {

//        TODO implements result
        String result = "";

        for (String s : list) {

            if (s.length() >= s.length()){
                result = s;
            }

        }
        return result;
    }

    public List<String> changeIndex(List<String> list) {

//        TODO implements result

        String temp = list.get(3);
        list.set(3, list.get(1));
        list.set(1, temp);

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

//        TODO implements result

        return list;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result

        return list;
    }
}
