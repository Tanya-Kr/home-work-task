package com.hillel.lecture_11.homeWork;

public class MessengersMain {

    public static void main(String[] args) {

        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        WhatsApp whatsApp = new WhatsApp();

        User user = new User("Mark", whatsApp);


        user.findChat("Tom");
        user.startNewChat("Bob");
        user.makeCall();
        user.openChat();
        user.createNewGroup("Rob, Tom, Bob");

    }

}
