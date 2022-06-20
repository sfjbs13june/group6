package com.kesil.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Calculator cal = new Calculator();

        System.out.println( "Addition - "+cal.add(2,3) );

        System.out.println( "Subtraction - "+cal.subtract(5,3) );

        System.out.println( "Multiplication - "+cal.multiply(2,3) );

        System.out.println( "Division - "+cal.divide(6,3) );

    }
}
