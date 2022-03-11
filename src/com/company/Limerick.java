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
            for (int j = 0; j < getSyllables(i)-1; j++) {
                System.out.print("ta-");
            }
            System.out.print("ta");
            System.out.println();
        }
    }

}
