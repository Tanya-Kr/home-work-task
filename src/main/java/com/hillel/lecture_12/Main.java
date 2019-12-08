package com.hillel.lecture_12;

public class Main {

    public static void main(String[] args) {
        User user = new User("Bob", "bbb", "dd");
        User.Cat cat = user.getCat();
        cat.sayMeu();

        User.Dog dog = user.getDog();
        dog.sayWuf();
        dog.setName("Barsik");
        dog.sayWuf();
    }
}
