package com.shermine.testing;
import com.shermine.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
    private Calculator calculatorUnderTest;

    @BeforeEach
    // A executer avant @Test
    public void initCalculator() {
        System.out.println("Appel avant chaque test");
        // Initialisation des attributs de la Cette classe CalculatorTest
        this.calculatorUnderTest = new Calculator();
    }
    @Test
    void testAddTwoPositiveNumbers()
    {
        // ARRANGE
        final int a = 1;
        final int b = 4;

        // ACT
        final int result = this.calculatorUnderTest.addition(a, b);

        // ASSERT
        assertEquals(5, result);
    }


    @Test
    void testMultiTwoPositiveNumbers()
    {
        // ARRANGE
        final int a = 2;
        final int b = 4;

        // ACT
        final int result = this.calculatorUnderTest.multiply(a, b);

        // ASSERT
        assertEquals(8, result);
    }
}
