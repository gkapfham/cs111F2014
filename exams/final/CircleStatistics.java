import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleStatistics
{
   public static void main (String[] args)
   {
      // declare the variables 
      int radius;
      double area, circumference;
      // accept input from the user
      Scanner scan = new Scanner (System.in);
      System.out.print (" Enter the circle's radius: ");
      radius = scan.nextInt();
      // perform the computations
      area = Math.PI * Math.pow(radius, 2);
      circumference = 2 * Math.PI * radius;
      // format and produce the output
      DecimalFormat fmt = new DecimalFormat (" 0.### ");
      System.out.println (" The circle's area: " + 
                          fmt.format(area));
      System.out.println (" The circle's circumference: " +
                           fmt.format(circumference));
   }
}