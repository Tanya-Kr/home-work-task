package com.hillel.lecture_11.homeWork;

public class User {

    private String name;
    private IMessenger messengerGeneral;
    private IGroupCreator groupCreator;

    public User(String name, MessengerGeneral messengerGeneral) {
        this.name = name;
        this.messengerGeneral = messengerGeneral;
        this.groupCreator = messengerGeneral;
    }

    public User(String name, IMessenger messengerGeneral) {
        this.name = name;
        this.messengerGeneral = messengerGeneral;
    }

    public void findChat(String name) {
        System.out.println("User searching for " + name);
        messengerGeneral.findChat(name);
    }

    public void startNewChat(String name){
        System.out.println("User start a chat with " + name);
        messengerGeneral.startNewChat(name);
    }

    public void makeCall(){
        System.out.println("User calling");
        messengerGeneral.makeCall();
    }

    public void openChat(){
        System.out.println("User open chat");
        messengerGeneral.openChat();
    }

    public String createNewGroup(String contacts) {
        if(groupCreator == null) {
            System.out.println("Messenger does not have this function");
            return "Messenger does not have this function";
        }

       System.out.println("User add " + contacts + " to group");
       groupCreator.createNewGroup(contacts);
       return "User add " + contacts + " to group";
    }


}
