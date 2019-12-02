package com.hillel.lecture_11.homeWork;

public class WhatsApp extends MessengerGeneral {

    @Override
    public String createNewGroup(String contacts) {

        return String.format("Add to %s group: ", MessengersInfo.WHATSAPP.getMessengerName());
    }

    @Override
    public String findChat(String contactName) {

        System.out.println("Search for " + contactName);
        return String.format("Search in %s contacts", MessengersInfo.WHATSAPP.getMessengerName());
    }

    @Override
    public String startNewChat(String contactName) {

        System.out.println("Start new chat with " + contactName);
        return String.format("Start new chat in %s", MessengersInfo.WHATSAPP.getMessengerName());
    }

    @Override
    public void makeCall() {
        System.out.println(String.format("Call in %s", MessengersInfo.WHATSAPP.getMessengerName()));
    }

    @Override
    public void openChat() {
        System.out.println(String.format("Open chat in %s", MessengersInfo.WHATSAPP.getMessengerName()));
    }
}