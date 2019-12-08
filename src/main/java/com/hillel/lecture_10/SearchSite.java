package com.hillel.lecture_10;

public class SearchSite {

    private String url;

    public SearchSite(String url) {
        this.url = url;
    }

    public SearchSite(){}

    public void search(String query) {
        System.out.println(String.format("%s -> Start search at %s for %s...",
               this.getClass().getSimpleName(), url, query));
    }
}
