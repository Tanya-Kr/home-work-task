package com.hillel.lecture_11;

public class Safari  implements IBrowser {

    public static final String SAFARI = "Safari";

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return String.format("Open by %s", SAFARI);
    }

    @Override
    public String moveForward() {
        System.out.println("Move forward");
        return String.format("Move forward %s", SAFARI);
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return String.format("Move back %s", SAFARI);
    }

    @Override
    public void refresh() {
        System.out.println(String.format("Refresh by %s", SAFARI));
    }
}