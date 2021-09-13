/*
 *  UCF COP3330 Fall 2021 Assignment 1.11 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? "); //Asking for user input
        double euro = x.nextInt(); //Storing user input
        System.out.print("What is the exchange rate? ");
        double exrate = x.nextDouble();

        double toUS = euro * exrate;
        double roundedres = Math.round(toUS * 100)/100.0; //rounding to the nearest penny

        System.out.printf("%.0f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euro,exrate,roundedres);

    }
}