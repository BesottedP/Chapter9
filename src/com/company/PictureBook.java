package com.company;

public class PictureBook extends Book{

    private String illustrator;

    public PictureBook(String t, String a, String i){
        super(t, a);
        illustrator = i;
    }

//    public String printBookInfo(){
//        System.out.println(super.printBookInfo());
////        System.out.println(super.printBookInfo() + ", " + this.illustrator);
//    }
}

