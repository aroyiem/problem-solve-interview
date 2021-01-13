package com.calculation;

import com.model.Rectangle;

public class CalculateForRectangle implements Calculate{

    private Rectangle rectangle;

    public CalculateForRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public Double getArea() {
        if(null == rectangle)
            throw new RuntimeException("Incomplete information");
        return rectangle.getLength() * rectangle.getBreadth();
    }

    @Override
    public Double getTotalDistance() {
        if(null == rectangle)
            throw new RuntimeException("Incomplete information");
        return (rectangle.getLength() * 2) + (rectangle.getBreadth() * 2);
    }

    @Override
    public Integer getNumberOfSides() {
        if(null == rectangle)
            throw new RuntimeException("Incomplete information");
        return 4;
    }

    @Override
    public String getOtherAttributes() {
        if(null == rectangle)
            throw new RuntimeException("Incomplete information");
        return null;
    }
}
