package com.hillel.lecture_11.homeWork;

public class Viber implements IMessenger {

    @Override
    public String findChat(String contactName) {

        System.out.println("Search for " + contactName);
        return String.format("Search in %s contacts", MessengersInfo.VIBER.getMessengerName());
    }

    @Override
    public String startNewChat(String contactName) {

        System.out.println("Start new chat with " + contactName);
        return String.format("Start new chat in %s", MessengersInfo.VIBER.getMessengerName());
    }

    @Override
    public void makeCall() {
        System.out.println(String.format("Call in %s", MessengersInfo.VIBER.getMessengerName()));
    }

    @Override
    public void openChat() {
        System.out.println(String.format("Open chat in %s", MessengersInfo.VIBER.getMessengerName()));
    }
}
