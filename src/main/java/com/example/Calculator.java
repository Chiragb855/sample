package com.example;

public class Calculator {
    public static double calculate(double a, String op, double b) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*", "x" -> a * b;
            case "/" -> {
                if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Use +, -, x, * or /");
        };
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Error");
            System.exit(1);
        }
        try {
            System.out.println(calculate(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2])));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
