package com.company;

public class Drinks {
    public String name;
    public double amountRemaining;

    public Drinks(String name, double amountRemaining) {
        this.name = name;
        this.amountRemaining = amountRemaining;
    }

    public String toString() {
        return name;
    }

}
