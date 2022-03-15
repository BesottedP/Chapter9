package com.company;

public class BookListing{

    private double cost;
    private Book book;

    public BookListing(Book b, double p){
        book = b;
        cost = p;
    }

    public void printDescription(){
        book.printBookInfo();
        System.out.println(", $" + this.cost);
    }
}
