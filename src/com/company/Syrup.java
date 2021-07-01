package com.company;

public class Syrup extends Drinks{

    public Syrup(String name, double amountRemaining) {
        super(name, amountRemaining);
    }

    public void dispense(double amt) {
        amountRemaining -= amt;
    }

    public double getVolume() {
        return amountRemaining;
    }
}
