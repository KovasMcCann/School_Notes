/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      Airplane plane1 = new Airplane();
      System.out.println("Enter the details of the second airplane (call-sign, distance, bearing, and altitude:");
      String plane2name = input.nextLine();
      double dist2 = input.nextDouble();
      int dir2 = input.nextInt();
      int alt2 = input.nextInt();
  
      Airplane plane2 = new Airplane(plane2name.toUpperCase(), dist2, dir2, alt2);
      int alt1 = plane1.getAlt();
      int alt3 = Math.abs(alt2 - alt1);
      double dist3 = plane1.distTo(plane2);
      System.out.println("\nInitial Positions: ");
      System.out.println("\"Airplane 1\": " + plane1);
      System.out.println("\"Airplane 2\": " + plane2);
      System.out.println("The distance between the planes is " + dist3 + " miles.");
      System.out.println("The difference in height between the planes is " + alt3 + " feet.");

      plane1.gainAlt();
      plane1.gainAlt();
      plane1.gainAlt();
      plane1.gainAlt();
      plane2.loseAlt();
      plane2.loseAlt();
      alt1 = plane1.getAlt();
      alt2 = plane2.getAlt();
      alt3 = Math.abs(alt2 - alt1);
      plane1.move(10.5, 50);
      plane2.move(8.0, 125);
      dist3 = plane1.distTo(plane2);
      System.out.println("\nNew Positions: ");
      System.out.println("\"Airplane 1\": " + plane1);
      System.out.println("\"Airplane 2\": " + plane2);
      System.out.println("The distance between the planes is " + dist3 + " miles.");
      System.out.println("The difference in height between the planes is " + alt3 + " feet.");
    
  }
}
