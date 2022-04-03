package com.fistkim.designpatternjava.practice.creation2.simplefactory;

public class SimpleFactoryClient {
    public static void main(String[] args) {

        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.serveBook(true);
        System.out.println(book.getClass().getName());

        Book book2 = bookFactory.serveBook(false);
        System.out.println(book2.getClass().getName());

    }
}
