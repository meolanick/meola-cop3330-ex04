/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter a noun:" );
        String noun = scan.nextLine();
        System.out.println( "Enter a verb:" );
        String verb = scan.nextLine();
        System.out.println( "Enter an adjective:" );
        String adjective = scan.nextLine();
        System.out.println( "Enter an adverb:" );
        String adverb = scan.nextLine();;

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
