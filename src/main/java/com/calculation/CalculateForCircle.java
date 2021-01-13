package com.calculation;

import com.model.Circle;

public class CalculateForCircle implements Calculate {

    private Circle circle;

    public CalculateForCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public Double getArea() {
        if(null == circle)
            return null;
        return circle.getRadius() * circle.getRadius()  * Math.PI;
    }

    @Override
    public Double getTotalDistance() {
        if(null == circle)
            return null;
        return 2 * circle.getRadius() * Math.PI;
    }

    @Override
    public Integer getNumberOfSides() {
        if(null == circle)
            return null;
        return 1;
    }

    @Override
    public String getOtherAttributes() {
        return "Diameter";
    }
}
