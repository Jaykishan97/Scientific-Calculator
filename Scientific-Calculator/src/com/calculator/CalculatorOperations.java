package com.calculator;

public class CalculatorOperations implements BasicMath, ScientificFunctions {
    public double addition(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public double subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public double division(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }

        return operand1 / operand2;
    }

    public double squareRoot(double operand) {
        if (operand < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not allowed!");
        }

        return Math.sqrt(operand);
    }

    public double exponentiation(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double logarithm(double base, double operand) {
        if (base <= 0 || base == 1 || operand <= 0) {
            throw new IllegalArgumentException("Logarithm of an invalid base or operand is not allowed!");
        }

        return Math.log(operand) / Math.log(base);
    }
}
