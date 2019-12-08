package com.hillel.lecture_12;

public class MainEnum {

    public static void main(String[] args) {

//        System.out.println(Phones.IPHONE.name());
//        System.out.println(Phones.IPHONE.getModel());
//        System.out.println(Phones.IPHONE.getProduser());

        sayHello(Phones.SAMSUNG);

        Phones[] phones = Phones.values();

        for(Phones phone: phones){
            System.out.println(phone.getModel());
        }

    }


    public static void sayHello(Phones phone) {
        switch (phone){
            case IPHONE:
                System.out.println("Say hello " + phone.getModel());
                break;
            case SAMSUNG:
                System.out.println("Say hello " + phone.getModel());
                break;
            case XIAOMI:
                System.out.println("Say hello " + phone.getModel());
                break;
            case OPPO:
                System.out.println("Say hello " + phone.getModel());
                break;
        }
    }
}
