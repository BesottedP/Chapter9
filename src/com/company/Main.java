package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();

        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frank", "Mary Shelby");
        PictureBook book2 = new PictureBook("TWWOO", "LFB", "WWD");

        myLibrary.add(book1);
        myLibrary.add(book2);


        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();

        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();
    }
}
