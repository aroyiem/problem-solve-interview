package com.model;

public class Rectangle extends Square {

    private Double breadth;

    public Rectangle(Double length, Double breadth) {
        super(length);
        this.breadth = breadth;
    }

    public Double getBreadth() {
        return breadth;
    }
}
