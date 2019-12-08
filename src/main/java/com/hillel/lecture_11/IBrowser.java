package com.hillel.lecture_11;

public interface IBrowser {

    String navigateToUrl(String url);


    String moveForward();

    String moveBack();

    void refresh();

}
