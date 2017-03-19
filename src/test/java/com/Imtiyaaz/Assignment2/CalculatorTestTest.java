package com.Imtiyaaz.Assignment2;

import com.sun.org.apache.xpath.internal.SourceTree;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by imtiyaaz on 2017/03/18.
 */
public class CalculatorTestTest {
    @Test
    public void TestAddFail() throws Exception {
        assertNotEquals("Error in addN()",0, CalculatorTest.addN(1, 2));
    }

    protected double value1, value2;

    @Test
    public void multiple() throws Exception {
        CalculatorTest calc = new CalculatorTest();

        for (int i = 0; i < 100; i++) {
            Double a = Math.random();
            Double b = Math.random();
            Double c = Math.random();
            String message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c);
            assertEquals(message,
                    calc.multiple(calc.multiple(a, b), c),
                    calc.multiple(a, calc.multiple(b, c)),
                    1E-14);
        }

    }


    @Test
    public void addN() throws Exception {
        System.out.println("Enter number:");

        assertNotNull(value1);
        assertNotNull(value2);

        double result = value1 + value2;
        assertTrue(result == 50);
    }

    @Test
    public void TheStringArray() {
        CalculatorTest myUnit = new CalculatorTest();

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray =  myUnit.TheStringArray();

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void isDivide() throws Exception {
        System.out.println("Enter number:");
        CalculatorTest calc = new CalculatorTest();
        assertFalse(calc.isDivide(value1, value2));
    }

    @Test
    public void substract() throws Exception {
        CalculatorTest calc = new CalculatorTest();
        int result = calc.substract(50, 40);
        Assert.assertEquals("Subtract", 10, result);
    }

    @Test
    public void division() throws Exception {
        CalculatorTest calc = new CalculatorTest();
        float result = calc.division(100, 4);
        Assert.assertEquals("Divide a / b", 25, result);

    }

    @org.junit.Test
    public void add() throws Exception {

        CalculatorTest calc = new CalculatorTest();
        float result = calc.add(100, 50);
        Assert.assertEquals("Add a + b", 150.00, result);
    }

}