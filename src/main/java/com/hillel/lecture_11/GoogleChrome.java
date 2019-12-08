package com.hillel.lecture_11;

public class GoogleChrome implements IBrowser, FileDownload {

    public static final String CHROME = "Chrome";

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return String.format("Open by %s", CHROME);
    }

    @Override
    public String moveForward() {
        System.out.println("Move forward");
        return String.format("Move forward %s", CHROME);
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return String.format("Move back %s", CHROME);
    }

    @Override
    public void refresh() {
        System.out.println(String.format("Refresh by %s", CHROME));
    }

    @Override
    public void download() {
        System.out.println(String.format("Download by %s", CHROME));
    }
}
