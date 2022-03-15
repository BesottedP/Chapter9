package com.company;

public class Animal {

    private String eat;
    private String species;
    private String name;

    public Animal(String e, String s, String n){
        eat = e;
        species = s;
        name = n;
    }

    public String toString(){
        return name + " the " + species + " is a " + eat;
    }
}
