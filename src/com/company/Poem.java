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

    public void printTas(int k){
        for (int j = 0; j < k-1; j++) {
            System.out.print("ta-");
        }
        System.out.print("ta");
        System.out.println();
    }

}
