package com.hillel.lecture_11.homeWork;

public enum MessengersInfo {

    TELEGRAM("Telegram", "v5.12.1"),
    VIBER("Viber", "v11.9.5"),
    WHATSAPP("WhatsApp", "v2.19.341");

    private String messengerName;
    private String messengerVersion;

    MessengersInfo(String messagerName, String messagerVersion) {
        this.messengerName = messagerName;
        this.messengerVersion = messagerVersion;
    }

    public String getMessengerName() {
        return messengerName;
    }

    public String getMessengerVersion() {
        return messengerVersion;
    }
}
