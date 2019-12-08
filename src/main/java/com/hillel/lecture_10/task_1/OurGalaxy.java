package com.hillel.lecture_10.task_1;

public class OurGalaxy extends AbstractClass {

    @Override
    public String name() {
        return "Milky Way";
    }

    @Override
    public void hasStars() {
        System.out.println("Galaxy has 200 billion");
    }

    @Override
    public void isMove() {
        System.out.println("Galaxy speed is 220–360 Myr");
    }

    @Override
    public void hasMass() {
        System.out.println("Galaxy mass is 0.8–1.5×1012 M☉");
    }

}
