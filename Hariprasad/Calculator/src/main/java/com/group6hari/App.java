package com.group6hari;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args ) {
        System.out.println("*********************Calculator Project****************");
        Calculator calc = new Calculator();
        Scanner i = new Scanner(System.in);
        System.out.println("Enter value for a :  ");
        int a = i.nextInt();
        System.out.println("Enter value for b : ");
        int b = i.nextInt();
        int sum = calc.sum(a, b);
        int sub= calc.sub(a, b);
        int mult=calc.mult(a,b);
        System.out.println("The Addition of a and b is " + sum);
        System.out.println("The substraction of a and b is : " + sub);
        System.out.println("The Multiplication of a and b is : " + mult);

    }
}
