package com.hillel.lecture_11;

public class InterfaceMain {

    public static void main(String[] args) {



        GoogleChrome googlechrome = new GoogleChrome();
        Firefox firefox = new Firefox();
        Safari safari = new Safari();

        User testUser = new User("Bob", safari);

        testUser.searchSomeInfo("fewf");
        testUser.refresh();
        testUser.downloadFile();


    }

}
