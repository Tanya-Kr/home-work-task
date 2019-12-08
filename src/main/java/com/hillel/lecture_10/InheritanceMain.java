package com.hillel.lecture_10;

public class InheritanceMain {

    public static void main(String[] args) {

//        SearchSite searchSite = new SearchSite("google.com");
//        searchSite.search("Java");
//
//        SearchSite duckduckgoSite = new SearchSite("duckduckgo.com");
//        duckduckgoSite.search("Java");

        GoogleSearchSite googleSearchSite = new GoogleSearchSite();
        googleSearchSite.search("Java");
        googleSearchSite.showHits();

        DuckduckgoSearchSite duckduckgoSearchSite = new DuckduckgoSearchSite();
        duckduckgoSearchSite.search("Java");

        YahooSearchSite yahooSearchSite = new YahooSearchSite();
        yahooSearchSite.search("aut");
    }
}
