package me.sachinmuralig.utils;

public class MathFunctions {
    private MathFunctions() {
    }

    public static double add(String operandOne, String operandTwo) {
        return Double.parseDouble(operandOne) + Double.parseDouble(operandTwo);
    }

    public static double subtract(String operandOne, String operandTwo) {
        return Double.parseDouble(operandOne) - Double.parseDouble(operandTwo);
    }

    public static double multiply(String operandOne, String operandTwo) {
        return Double.parseDouble(operandOne) * Double.parseDouble(operandTwo);
    }

    public static double divide(String operandOne, String operandTwo) {
        // @TODO: Check Division by zero
        return Double.parseDouble(operandOne) / Double.parseDouble(operandTwo);
    }
}
