package com.hillel.lecture_12;

public class User {

    private String name;
    private Cat cat;
    private Dog dog;


    public User(String name, String catName, String Dog) {
        this.name = name;
        cat = new Cat();
        cat.setName("Barsik");

        dog = new Dog();
        dog.setName("Tuzik");

    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public class Cat {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayMeu() {
            System.out.println("Myp Myp " + User.this.name);
        }
    }


    public static class Dog{

        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void sayWuf() {
            System.out.println("Wuf Wuf " + name );
        }
    }
}
