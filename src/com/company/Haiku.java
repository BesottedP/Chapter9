package com.company;

public class Haiku extends Poem{

    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
        if(k == 1 || k == 3){
            return 5;
        }
        else if(k == 2){
            return 7;
        }
        else return 0;
    }

    public void printRhythm() {

        for (int i = 1; i <= getLines(); i++) {
            for (int j = 0; j < getSyllables(i)-1; j++) {
                System.out.print("ta-");
            }
            System.out.print("ta");
            System.out.println();
        }
    }

}