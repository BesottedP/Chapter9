package com.company;

public class Poem {

    private int lines;

    public Poem(int x){
        lines = x;
    }

    public int getLines(){
        return this.lines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public static void main(String[] args) {
        // write your code here
    }
}
