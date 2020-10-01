package me.sachinmuralig.simplecalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import me.sachinmuralig.utils.MathFunctions;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestMathFunctions {

    @Test
    public void Should_returnSum_when_bothOperandsValidNumbers() {
        assertEquals(4, MathFunctions.add("2.0", "2.0"), 0.0);
        assertEquals(1, MathFunctions.subtract("3", "2.0"), 0.0);
        assertEquals(6, MathFunctions.multiply("3", "2.0"), 0.0);
        assertEquals(1.5, MathFunctions.divide("3", "2.0"), 0.0);
    }

    @Test
    public void Should_returnInfinity_when_divisionByZero() {
        assertEquals(Double.POSITIVE_INFINITY, MathFunctions.divide("1", "0.0"), 0.0);
    }

    @Test (expected = NumberFormatException.class)
    public void Should_raiseException_when_operandNotNumberForAdd() {
        MathFunctions.add("1", "ABC");
    }
}
