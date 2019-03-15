package org.woodworks.java;

public class BookStoreTest {

    public static void main(String args[]) throws CloneNotSupportedException {
        BookStoreTest program = new BookStoreTest();
        program.execute();
    }

    public void execute() throws CloneNotSupportedException {
        BookStore bookStore = new BookStore("Komala");
        bookStore.loadData();
        System.out.println(bookStore);

        BookStore newStore = bookStore.clone();
        System.out.println(newStore);
    }

}
