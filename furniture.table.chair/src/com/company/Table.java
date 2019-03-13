package com.company;
public class Table extends Furniture {
    private int legCount;
    private double surfaceArea;
    private int tableId;

    public Table(double price, String style, String scope, int legCount, double surfaceArea) {
        this.legCount = legCount;
        this.surfaceArea = surfaceArea;
    }    }