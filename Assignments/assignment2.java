/* Unit 2 - Assignment 2: Control Tower */
/* Class name - must be "Assignment2" in order to run */

import java.util.Scanner;
import edhesive.assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  Airplane a1 = new Airplane();
  System.out.println("Enter the details of the second airplane (call-sign, distance, bearing, and altitude:");
  String a2name = scan.nextLine();
  
  double dist2 = scan.nextDouble();
  int dir2 = scan.nextInt();
  int alt2 = scan.nextInt();
  
  Airplane a2 = new Airplane(a2name.toUpperCase(), dist2, dir2, alt2);
  
  int alt1 = a1.getAlt();
  int alt3 = Math.abs(alt2 - alt1);
  double dist3 = a1.distTo(a2);
  
  System.out.println("\nInitial Positions: ");
  System.out.println("\"Airplane 1\": " + a1);
  System.out.println("\"Airplane 2\": " + a2);
  System.out.println("The distance between the planes is " + dist3 + " miles.");
  System.out.println("The difference in height between the planes is " + alt3 + " feet.");
  
  /*New position code starts here: */
  a1.gainAlt();
  a1.gainAlt();
  a1.gainAlt();
  a1.gainAlt();

  a2.loseAlt();
  a2.loseAlt();
  
  alt1 = a1.getAlt();
  alt2 = a2.getAlt();
  alt3 = Math.abs(alt2 - alt1);
  
  a1.move(10.5, 50);
  a2.move(8.0, 125);
  
  dist3 = a1.distTo(a2);
  
  System.out.println("\nNew Positions: ");
  System.out.println("\"Airplane 1\": " + a1);
  System.out.println("\"Airplane 2\": " + a2);
  System.out.println("The distance between the planes is " + dist3 + " miles.");
  System.out.println("The difference in height between the planes is " + alt3 + " feet.");
    
    
  }
}
