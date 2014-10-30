//*****************************
// CMPSC 111
// Practical 6
// October 29, 2014
//
// Purpose: a program that determines what activities happen
// during a specific year.
//*****************************

import java.util.Date;
import java.util.Scanner;
public class Practical6Main
{
    public static void main ( String[] args)
    {
        //Variable dictionary
        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.println("Please enter a year between 1000 and 3000!");
        userInput = scan.nextInt();

        YearChecker activities = new YearChecker(userInput);

        // TO DO: include method calls

        System.out.println("Thank you for using this program.");
    }
}
