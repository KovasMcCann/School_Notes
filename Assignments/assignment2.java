import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    //Define the first two planes
    Airplane plane1 = new Airplane();
    Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
    
    //Define the second plane from user input
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the details of the third airplane (call sign, distance, bearing and altitude):");
    String cs = input.nextLine();
    double dist = input.nextDouble();
    int dir = input.nextInt();
    int alt = input.nextInt();
    
  
    /*
    String cs = "UaL256";
    double dist = 12.8;
    int dir = 200;
    int alt = 22000;
    */
    
    /*
    String cs = "aca549";
    double dist = 25.3;
    int dir = 305;
    int alt = 1000;
    */
    
    //"Build" third plane
    Airplane plane3 = new Airplane(cs.toUpperCase(), dist, dir, alt);
    
    System.out.println("\nInitial Positions:");
    System.out.println("\"Airplane 1\": " + plane1);
    System.out.println("\"Airplane 2\": " + plane2);
    System.out.println("\"Airplane 3\": " + plane3);
    
    //List Distances
    System.out.println("\nInitial Distances:");
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + plane1.distTo(plane2) + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + plane1.distTo(plane3) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + plane2.distTo(plane3) + " miles.");

    //List hight
    System.out.println("\nInitial Height Differences:");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(( plane1.getAlt() - plane2.getAlt())) + " feet.");
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(( plane1.getAlt() - plane3.getAlt())) + " feet.");
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(( plane2.getAlt() - plane3.getAlt())) + " feet.");

    //Move planes to new pos
    //Plane 1
    plane1.move(plane2.distTo(plane3),65);
    plane1.gainAlt();
    plane1.gainAlt();
    plane1.gainAlt();
    //Plane 2
    plane2.move(8,135);
    plane2.loseAlt();
    plane2.loseAlt();
    ///Plane 3
    plane3.move(5,55);
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    
    //Print new pos
    System.out.println("\nNew Positions:");
    System.out.println("\"Airplane 1\": " + plane1);
    System.out.println("\"Airplane 2\": " + plane2);
    System.out.println("\"Airplane 3\": " + plane3);
    
    //List Distances
    System.out.println("\nNew Distances:");
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + plane1.distTo(plane2) + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + plane1.distTo(plane3) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + plane2.distTo(plane3) + " miles.");

    //List hight
    System.out.println("\nNew Height Differences:");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(( plane1.getAlt() - plane2.getAlt())) + " feet.");
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(( plane1.getAlt() - plane3.getAlt())) + " feet.");
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(( plane2.getAlt() - plane3.getAlt())) + " feet.");
    
  }
}
