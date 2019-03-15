package org.woodworks.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookStore implements Cloneable{
    private String name;
    List<Book> books = new ArrayList<>();

    public BookStore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loadData(){
        IntStream.range(0,10).forEach(i -> {
            Book b = new Book(String.valueOf(i), i);
            books.add(b);
        });
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookStore clone() throws CloneNotSupportedException {
        BookStore shop = new BookStore("Thasor Press");
        this.getBooks().forEach(b -> shop.getBooks().add(b));
        return shop;
    }
}
