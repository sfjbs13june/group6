package com.calculator.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Jai Hind from Kumar");
        double num1 = 10;
        double num2 = 5;
    calculator calculator = new calculator();
        System.out.println(num1 + " + " + num2 + " = " + calculator.add(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + calculator.subtract(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + calculator.multiply(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + calculator.divide(num1,num2));
    }
}

