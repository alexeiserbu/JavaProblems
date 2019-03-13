package com.company;
public class Chair extends Furniture {
    private int shelfCount;
    private double height;
    private int chairId;

    public Chair(double price, String style, String scope, int shelfCount, double height) {
        this.shelfCount = shelfCount;
        this.height = height;
    }
}