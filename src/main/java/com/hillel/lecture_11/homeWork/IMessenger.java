package com.hillel.lecture_11.homeWork;

public interface IMessenger {

    String findChat(String contactName);

    String startNewChat(String contactName);

    void makeCall();

    void openChat();

}
