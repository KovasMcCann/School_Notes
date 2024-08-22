/*
 * This program is a simple program that takes user input and prints it to the terminal
 */

import java.util.Scanner; //This is an imported class for user input
public class variables {

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in); //This is the scanner object that looks for user input
    //String n; //Sets user input as string
    
    String n = scan.nextLine(); //This is the user input defined as n (string)
    System.out.println(n); //Print output to terminal
  }
  
}