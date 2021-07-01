package com.company;

public class Main {

    public static void main(String[] args) {

        CupHolder small = new CupHolder(2.5, 50);

        CupHolder medium = new CupHolder(7.5, 50);

        CupHolder large = new CupHolder(10, 50);

        Shots vanilla = new Shots("Vanilla", 50, 2);
        Shots cherry = new Shots("Cherry", 75, 3);

        Syrup Conke = new Syrup("Conke", 125);
        Syrup SeirraDew = new Syrup("Seirra Dew", 125);

        DrinkDispenser McDougals = new DrinkDispenser("McDouglas");

        McDougals.loadDispenser(vanilla);
        McDougals.loadDispenser(cherry);
        McDougals.loadDispenser(Conke);
        McDougals.loadDispenser(SeirraDew);

        McDougals.displayMenu("Syrup");
        McDougals.displayMenu("Shots");

        McDougals.serveDrink(small, 0);

        McDougals.serveDrink(medium, 1, 0, 4);


    }
}
