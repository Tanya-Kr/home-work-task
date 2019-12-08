package com.hillel.lecture_15;

import java.util.*;


public class MapsMain {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Cinema");
        map.put(131, "Mall");
        map.put(22, "Car");
        map.put(null, "trololo");

//

//       String value1 = map.get(22);
//       System.out.println(value1);
//
//       String value2 = map.get(null);
//       System.out.println(value2);

//        for (String value : map.values()) {
//            System.out.println(value);
//        }


        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            if(value.equalsIgnoreCase("Mall")) {
                System.out.println("key " + entry.getKey());
            }
        }

        String train = map.getOrDefault(1560, "Train");
        System.out.println(train);


        List<String> stringList = new ArrayList<>();
        stringList.add("fe");
        stringList.add("few");
        stringList.add("feer");

        Map<String, List<String>> listMap = new HashMap<>();
//        listMap.putAll("one", stringList);

        List<String> stringList1 = listMap.get("one");
        for (String string : stringList1) {
            System.out.println(string);
        }


    }

}
