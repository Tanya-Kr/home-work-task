package com.hillel.lecture_9;

public class Galaxy {

    private String name;
    private Planet planet;

    public Galaxy() {}

    public Galaxy(String name, Planet planet) {
        this.name = name;
        this.planet = planet;
    }

   
      public static class Planet {

          String name;
          public Planet(String name) {
              this.name = name;
          }

          public String getName() {
              return name;
          }
      }
}




