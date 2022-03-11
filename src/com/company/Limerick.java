package com.company;

public class Limerick extends Poem{

    public Limerick(){
        super(5);
    }

    public int getSyllables(int k){
        if(k == 1 || k == 2 || k == 5){
            return 9;
        }
        else if(k == 3 || k==4){
            return 6;
        }
        else return 0;
    }

    public void printRhythm() {

        for (int i = 1; i <= getLines(); i++) {
            super.printTas(getSyllables(i));
            System.out.print("ta");
            System.out.println();
        }
    }

}
