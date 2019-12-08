package com.hillel.lecture_10;

public class GoogleSearchSite extends SearchSite {

    private static final String GOOGLE_URL = "google.com";

    public GoogleSearchSite() {
        super(GOOGLE_URL);
    }

    public void showHits() {
        System.out.println(String.format("%s -> Maybe you search for 1", this.getClass().getSimpleName()));
        System.out.println("Maybe you search for 2");
        System.out.println("Maybe you search for 3");
    }
}
