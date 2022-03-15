package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //BOOK
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        System.out.println();

        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frankenstein", "Mary Shelby");
        PictureBook book2 = new PictureBook(
                "The Wonderful Wizard of OZ",
                "L. Frank Baum",
                "W.W. Denslow");

        myLibrary.add(book1);
        myLibrary.add(book2);


        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();

        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();

        System.out.println();

        //ANIMAL
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa);

        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary);

        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy);

    }
}
