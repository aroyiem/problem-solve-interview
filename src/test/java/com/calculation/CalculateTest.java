package com.calculation;


import com.model.Square;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;


public class CalculateTest extends TestCase {


    public CalculateTest(String name) {
        super(name);
    }

    @Test
    public void testCalculateAreaForSquare_success() {
        Calculate calculateSquare = new CalculateForSquare(new Square(2.0));
        Assert.assertEquals(4.0d, calculateSquare.getArea());
    }

    @Test
    public void testCalculateAreaForSquare_nullobject() {
        try {
            Calculate calculateSquare = new CalculateForSquare(null);
            Double area = calculateSquare.getArea();
            fail("test case broken");
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Incomplete information");
        }

    }

    @Test
    public void testCalculateTotalDistanceForSquare_success() {
        Calculate calculateSquare = new CalculateForSquare(new Square(2.0));
        Assert.assertEquals(8.0d, calculateSquare.getTotalDistance());
    }

    @Test
    public void testCalculateTotalDistanceForSquare_nullobject() {
        try {
            Calculate calculateSquare = new CalculateForSquare(null);
            Double totalDistance = calculateSquare.getTotalDistance();
            fail("test case broken");
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Incomplete information");
        }

    }

    @Test
    public void testNumberOfSidesForSquare_success() {
        Calculate calculateSquare = new CalculateForSquare(new Square(2.0));
        Assert.assertEquals(4, (int)calculateSquare.getNumberOfSides());
    }

    @Test
    public void testNumberOfSidesForSquare_nullobject() {
        try {
            Calculate calculateSquare = new CalculateForSquare(null);
            Integer numberOfSide = calculateSquare.getNumberOfSides();
            fail("test case broken");
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Incomplete information");
        }

    }

    @Test
    public void testOtherAttributesForSquare_success() {
        Calculate calculateSquare = new CalculateForSquare(new Square(2.0));
        Assert.assertNull(calculateSquare.getOtherAttributes());
    }

    @Test
    public void testOtherAttributesForSquare_nullobject() {
        try {
            Calculate calculateSquare = new CalculateForSquare(null);
            String attributes = calculateSquare.getOtherAttributes();
            fail("test case broken");
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Incomplete information");
        }

    }
}
