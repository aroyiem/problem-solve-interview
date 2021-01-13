package com.calculation;

import com.model.Square;

public class CalculateForSquare implements Calculate {

    private Square square;

    public CalculateForSquare(Square square) {
        this.square = square;
    }

    @Override
    public Double getArea() {
        if(null == square)
            throw new RuntimeException("Incomplete information");
        return square.getLength() * square.getLength();
    }

    @Override
    public Double getTotalDistance() {
        if(null == square)
            throw new RuntimeException("Incomplete information");
        return square.getLength() * 4;
    }

    @Override
    public Integer getNumberOfSides() {
        if(null == square)
            throw new RuntimeException("Incomplete information");
        return 4;
    }

    @Override
    public String getOtherAttributes() {
        if(null == square)
            throw new RuntimeException("Incomplete information");
        return null;
    }
}
