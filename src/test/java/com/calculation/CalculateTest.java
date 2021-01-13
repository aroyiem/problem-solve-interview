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
        Calculate calculateSquare = new CalculateForSquare(null);
        Assert.assertNull(calculateSquare.getArea());
    }
}
