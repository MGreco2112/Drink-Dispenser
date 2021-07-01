package com.company;

public class Shots extends Drinks{

    public double liquidPerShot;

    public Shots(String name, double amountRemaining, double liquidPerShot) {
        super(name, amountRemaining);
        this.liquidPerShot = liquidPerShot;
    }

    public void dispenseShot() {
        amountRemaining -= liquidPerShot;
    }

    public double getVolume() {
        return amountRemaining / liquidPerShot;
    }


}
