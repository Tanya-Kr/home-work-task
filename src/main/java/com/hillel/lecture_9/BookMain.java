package com.hillel.lecture_9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {

        Autor andrzeiSupkowski = new Autor("Andrzei", "Supkowski");
        Book witcherLastWish = new Book("The Witcher: The Laast Wish", 1992, andrzeiSupkowski, 1L);
        Book witcherSwordOfDestiny = new Book("The Witcher: Sword of Destiny", 1993, andrzeiSupkowski, 2L);
//        System.out.println(witcherLastWish);
//        System.out.println(witcherSwordOfDestiny);

        Autor viktorHugo = new Autor("Viktor", "Hugo");
        Book theHunchbackOfNotreDame = new Book("The Hunchback of Notre-Dame", 1831, viktorHugo, 3L);
//        System.out.println(theHunchbackOfNotreDame);

        Autor stephenKing = new Autor("Stephen", "King");
        Book theShining = new Book("The Shining", 1977, stephenKing, 4L);
        Book theShining2 = new Book("The Shining", 1977, stephenKing, 5L);
//        System.out.println(theShining);

        Autor autor = theShining.getAutor();
//        System.out.println(autor);
//
//        System.out.println(theShining.equals(null));

        Book[] books = {witcherLastWish, witcherSwordOfDestiny, theHunchbackOfNotreDame, theShining};

        for (Book book : books) {
            if (book.getAutor().equals(andrzeiSupkowski)) {
                System.out.println(book);
            }
        }

        for (Book book : books) {
            if (book.getYear() < 1978) {
                System.out.println(book);
            }
        }


//        Arrays.asList(books).forEach(book ->  {
//                if (book.getAutor().equals(andrzeiSupkowski)) {
//                    System.out.println(book);
//                }
//        });


    }
}
