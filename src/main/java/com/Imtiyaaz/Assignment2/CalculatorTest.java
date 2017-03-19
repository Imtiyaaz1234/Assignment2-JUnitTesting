package com.Imtiyaaz.Assignment2;

import junit.framework.Assert;
import junit.framework.ComparisonFailure;

/**
 * Created by imtiyaaz on 2017/03/18.
 */
public class CalculatorTest {

    public static float add(float a, float b) {
        return a + b;

    }

    public static int addN(int a, int b) {
        return a + b;

    }

    public static int substract(int a, int b) {
        return a - b;

    }

    public static float division(float a, float b) {
        return a / b;

    }

    public Double multiple(double a, double b){
        return a * b;
    }

    public static boolean isDivide(double a, double b){
        boolean option;

        if((a%b ) == 0)
            option = true;
            else
                option = false;

            return option;

    }
}
/*





 */





