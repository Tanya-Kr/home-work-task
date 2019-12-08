package com.hillel.lecture_11.homeWork;

import javax.jws.soap.SOAPBinding;

public class Telegram extends MessengerGeneral {

    @Override
    public String createNewGroup(String contacts) {

        return String.format("Add to %s group: ", MessengersInfo.TELEGRAM.getMessengerName());
    }

    @Override
    public String findChat(String contactName) {

        return String.format("Search in %s contacts", MessengersInfo.TELEGRAM.getMessengerName());
    }

    @Override
    public String startNewChat(String contactName) {

        return String.format("Start new chat in %s", MessengersInfo.TELEGRAM.getMessengerName());
    }

    @Override
    public void makeCall() {
        System.out.println(String.format("Call in %s", MessengersInfo.TELEGRAM.getMessengerName()));
    }

    @Override
    public void openChat() {
        System.out.println(String.format("Open chat in %s", MessengersInfo.TELEGRAM.getMessengerName()));
    }
}
