package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void main(String[] args) {

        int x = 10;
        double sinX;

        while (x <= 360) {
            sinX = Math.sin(x);
            System.out.println("Sin " + x + " | " + sinX);
            x += 10;
        }
    }
}
