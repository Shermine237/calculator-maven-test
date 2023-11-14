package com.shermine.testing;
import com.shermine.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
    @Test
    void testAddTwoPositiveNumbers()
    {
        // ARRANGE
        final int a = 1;
        final int b = 4;
        final Calculator calculator = new Calculator();

        // ACT
        final int somme = calculator.addition(a, b);

        // ASSERT
        assertEquals(5, somme);
    }
}
