package com.hillel.lecture_7;

public class Lecture7 {

    public static void main(String[] args) {

        Phone iPhone = new Phone("Apple", "11 Pro", "iOS", 10.5, 5.5, 120);

        System.out.println(iPhone);
        iPhone.call();
        iPhone.setBrand("Pixel");
        iPhone.call();

        Phone samsung = new Phone();
        samsung.setBrand("Samsung");
        samsung.setModel("Galaxy S10");
        samsung.setOs("Android");
        samsung.setHeight(12.7);
        samsung.setWidth(6.3);
        samsung.setWeight(130);

        System.out.println(samsung);
        samsung.call();

//        System.out.println(samsung.getModel());
//        System.out.println(samsung.getBrand());
//        System.out.println(samsung.getOs());
//        System.out.println(samsung.getHeight());
//        System.out.println(samsung.getWidth());
//        System.out.println(samsung.getWeight());


    }
}
