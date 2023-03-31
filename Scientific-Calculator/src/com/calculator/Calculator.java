package com.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOperations calculator = new CalculatorOperations();

        while (true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Logarithm");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Enter the operands:");
            double operand1 = scanner.nextDouble();
            double operand2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(calculator.addition(operand1, operand2));
                    break;
                case 2:
                    System.out.println(calculator.subtraction(operand1, operand2));
                    break;
                case 3:
                    System.out.println(calculator.multiplication(operand1, operand2));
                    break;
                case 4:
                    System.out.println(calculator.division(operand1, operand2));
                    break;
                case 5:
                    System.out.println(calculator.squareRoot(operand1));
                    break;
                case 6:
                    System.out.println(calculator.exponentiation(operand1, operand2));
                    break;
                case 7:
                    System.out.println(calculator.logarithm(operand1, operand2));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
