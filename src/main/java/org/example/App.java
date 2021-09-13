/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Euros are you exchanging?");
        int euros = sc.nextInt();
        System.out.println("What is the current exchange rate?");
        double exRate = sc.nextDouble();

        double dollars = exRate * euros;
        System.out.printf("%d Euros at an exchange rate of %f is %.2f U.S dollars", euros, exRate, dollars);
    }
}
