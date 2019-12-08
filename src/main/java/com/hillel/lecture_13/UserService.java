package com.hillel.lecture_13;

public class UserService {

    private String[] users = {"alex", "bob", "mark"};

    public String findUserByName(String userName) throws CustomException {
        for (String user: users) {
            if (user.equalsIgnoreCase(userName)) {
                return user;
            }
        }

        throw new CustomException("User " + userName + " not found");
    }

}
