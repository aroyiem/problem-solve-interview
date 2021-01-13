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
            return null;
        return rectangle.getLength() * rectangle.getBreadth();
    }

    @Override
    public Double getTotalDistance() {
        if(null == rectangle)
            return null;
        return (rectangle.getLength() * 2) + (rectangle.getBreadth() * 2);
    }

    @Override
    public Integer getNumberOfSides() {
        if(null == rectangle)
            return null;
        return 4;
    }

    @Override
    public String getOtherAttributes() {
        return null;
    }
}
