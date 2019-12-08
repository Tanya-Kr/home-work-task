package com.hillel.lecture_13;

public class CustomMain {

    public static void main(String[] args) {

        UserService userService = new UserService();

        try {
            String user = userService.findUserByName("boob");
            System.out.println(user);
        } catch (CustomException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close connection ");
        }


    }
}
