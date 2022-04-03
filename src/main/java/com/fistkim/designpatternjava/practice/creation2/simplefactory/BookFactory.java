package com.fistkim.designpatternjava.practice.creation2.simplefactory;

public class BookFactory {

    public Book serveBook(boolean isDeveloper) {
        if (isDeveloper) {
            return new DevBook();
        }

        return new NormalBook();
    }

}
