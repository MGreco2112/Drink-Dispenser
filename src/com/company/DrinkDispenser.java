package com.company;

import java.util.ArrayList;

public class DrinkDispenser {
    ArrayList<Shots> shots = new ArrayList<>();
    ArrayList<Syrup> syrups = new ArrayList<>();

    public String locationName;

    public DrinkDispenser(String name) {
        this.locationName = name;
    }

    public void loadDispenser(Shots shot) {
        shots.add(shot);
    }

    public void loadDispenser(Syrup syrup) {
        syrups.add(syrup);
    }

    public void displayMenu(String type) {
        if (type.equals("Shots") || type.equals("shots")) {
            System.out.println("Shots\n");
            for (Shots shots: shots) {
                System.out.println(shots);
            }
        } else if (type.equals("Syrup") || type.equals("syrup")) {
            System.out.println("Syrup\n");
            for (Syrup syrup: syrups) {
                System.out.println(syrup);
            }
        }
    }

    public void serveDrink(CupHolder size, int syrupIndex) {
        System.out.println("Now serving " + size.volumeAmount + " fl oz " + syrups.get(syrupIndex));
        size.dispenseCup();
        syrups.get(syrupIndex).dispense(1);
    }

    public void serveDrink(CupHolder size, int syrupIndex, int shotIndex, int shotCount) {
        System.out.println("Now serving " + size.volumeAmount + " fl oz " + shots.get(shotIndex) + " " + syrups.get(syrupIndex));
        size.dispenseCup();

        for (int i = 0; i < shotCount; i++) {
            shots.get(shotIndex).dispenseShot();
        }

    }



}
