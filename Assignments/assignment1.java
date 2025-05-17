/* Assignment 1 - Calculating Grades */
import java.util.Scanner;

class Assignment1 
{
  static int round(double x) {
    if (x - (int) x >= 0.5) {
      return (int) x + 1;
    } else {
      return (int) x;
    }
  }
  public static void main(String[] args) 
  {
    
    Scanner myObj = new Scanner(System.in);  // Creates a Scanner object

    System.out.println("Please enter the course name.");
    
    String Name = myObj.nextLine();
    
    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    
    int time = myObj.nextInt();

    System.out.println("Please enter the homework grades for this course.");
    
    int frst = myObj.nextInt();
    
    int scnd = myObj.nextInt();
    
    int thrd = myObj.nextInt();
    
    int frth = myObj.nextInt();

    System.out.println("Please enter the quiz grades for this course.");
  
    double qzone = myObj.nextDouble();
  
    double qztwo = myObj.nextDouble();

    System.out.println("Please enter the final exam grade for this course.");

    double last = myObj.nextDouble();

    
    /*
    String Name = "AP computer Science";
 
    int time = 135;
    
    int frst = 75;
    
    int scnd = 99;
  
    int thrd = 80;
    
    int frth = 100;
    
    double qzone = 89.2;
    
    double qztwo = 98.1;
    
    double last = 87.58;
    */
    
    System.out.printf("Course name: %s\n", Name);
  
    System.out.printf("Weekly time spent: %dh%d\n", time/60, time%60);

    System.out.printf("Average homework grade: %.2f\n", (frst+scnd+thrd+frth)/4.0);

    System.out.printf("Average quiz grade: %.2f\n", (qzone + qztwo)/2.0);

    System.out.printf("Final exam grade: %.2f\n", last);

    double averageHomework = (frst + scnd + thrd + frth) / 4.0;
    
    double averageQuiz = (qzone + qztwo) / 2.0;
    
    double overallGrade = (averageHomework*0.35 + averageQuiz*0.15 + last*0.50) / 1.0;
    
    //System.out.println(overallGrade);
    int total =  round(overallGrade); 
    
    System.out.printf("Overall grade: %d\n", total);
    
    //close the scanner
    myObj.close();
  }
}