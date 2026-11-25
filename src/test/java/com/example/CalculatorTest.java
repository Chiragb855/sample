package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource({"10,+,5,15", "10,-,5,5", "10,*,5,50", "10,x,5,50", "10,/,5,2", "-2,+,3,1", "0.1,+,0.2,0.3", "5,/,2,2.5", "0,*,5,0"})
    void calculates(double a, String op, double b, double expected) {
        assertEquals(expected, Calculator.calculate(a, op, b), 0.000000001);
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(5, "/", 0));
    }

    @Test
    void rejectsUnknownOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(5, "%", 2));
    }
}
