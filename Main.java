import java.util.Scanner;
/**
 * This program will find the maximum integer between three numbers that the user inputs
 * @author Dafna Kkhripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create the scanner for user inputs
    Scanner input = new Scanner(System.in);
    
    // ask the user for three integers
    System.out.println("Please enter three integers on separate lines");

    // declare and initialize a variablle for integer 1
    int integer1 = input.nextInt();

    // declare and initialize a variablle for integer 2
    int integer2 = input.nextInt();

    // declare and initialize a variablle for integer 3
    int integer3 = input.nextInt();

    // declare biggest integer
    if (integer2 < integer1 && integer1 > integer3){
      System.out.println("Maximum: " + integer1);

    }else if (integer1 < integer2 && integer2 > integer3){
      System.out.println("Maximum: " + integer2);

    }else if (integer1 < integer3 && integer3 > integer2){
      System.out.println("Maximum: " + integer3);
    }
  }
}
