package com.company;

public class CupHolder {
    public double volumeAmount;
    public int quantity;

    public CupHolder(double volumeAmount, int quantity) {
        this.volumeAmount = volumeAmount;
        this.quantity = quantity;

    }

    public double dispenseCup() {

        quantity--;

        return volumeAmount;
    }

    public String refill(int amt) {
        quantity += amt;

        return amt + " cups have been added.\nThere are now " + quantity + " cups";
    }




}
