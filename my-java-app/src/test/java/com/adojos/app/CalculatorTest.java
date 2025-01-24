package com.adojos.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private static Calc calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calc();
    }

    @Test
    void addSimple(){
        double result = calculator.calculate(1, 1, '+');
        assertEquals(2, result);
    }

    @Test
    void multiplySimple(){
        double result = calculator.calculate(1, 1, '*');
        assertEquals(1, result);
    }

    @Test
    void subtractSimple(){
        double result = calculator.calculate(1, 1, '-');
        assertEquals(0, result);
    }

    @Test
    void divideSimple(){
        double result = calculator.calculate(1, 1, '/');
        assertEquals(1, result);
    }
}
