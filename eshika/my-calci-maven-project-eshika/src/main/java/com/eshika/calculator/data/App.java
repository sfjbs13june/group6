package com.eshika.calculator.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        calculators object=new calculators();
        int addition=object.sum(5,6);
        System.out.println( "Addition:"+addition );
        int subtraction=object.subtraction(5,6);
        System.out.println( "subtraction:"+subtraction );
        int division=object.division(5,6);
        System.out.println( "division:"+division );
        int multiply=object.multiply(5,6);
        System.out.println( "multiply:"+multiply );


    }
}
