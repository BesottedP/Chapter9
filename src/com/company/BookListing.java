package com.company;

public class BookListing extends Book{

    private double cost;
    private Book book;

    public BookListing(Book b, double p){
        super();
        book = b;
        cost = p;
    }

    public void printDescription(){
        super.printBookInfo();
        System.out.println(", $" + this.cost);
    }
}
