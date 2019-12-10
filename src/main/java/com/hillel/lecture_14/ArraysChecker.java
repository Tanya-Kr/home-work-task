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
        String temp = "";
        for (String s : list) {

            if (s.length() >= temp.length()){
                temp = s;
            }
            result = temp;

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

//        int temp = 0;
//        for (int i = 1; i <= list.size(); i++) {
//
//            if (list.get(temp).equals(list.get(i))){
//
//                list.remove(temp);
//                temp = i;
//            }
//        }

        return list;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result

        return list;
    }
}
