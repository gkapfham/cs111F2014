import java.text.NumberFormat;
import java.util.Scanner;
public class Wages
{
   public static void main (String[] args)
   {
      // declare and initialize the regular pay rate
      final double RATE = 8.25;  
      // declare and initialize the standard hours in a work week
      final int STANDARD = 40;   
      // declare and initialize the total payment variable 
      double pay = 0.0;
      // accept the number of hours that the individual worked
      Scanner scan = new Scanner (System.in);
      System.out.print(" Enter the number of hours worked: ");
      int hours = scan.nextInt();
      System.out.println();

      // pay the worker the correct amount of money
      if (hours > STANDARD) 
      {
         pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
      }
      else 
      {
         pay = hours * RATE;
      }

      // correctly format and produce the output
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println (" Gross earnings: " + fmt.format(pay));
   }
}