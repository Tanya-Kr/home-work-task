package com.hillel.lecture_9;

import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Autor autor;
    private long id;

    public Book() {}

    public Book(String title, int year, Autor autor, long id) {
        this.title = title;
        this.year = year;
        this.autor = autor;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", autor=" + autor +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o!= null && this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, autor);
    }
}
