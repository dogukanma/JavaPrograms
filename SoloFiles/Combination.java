/*
 * @author Dogukan Unal
 * @date 13.09.2023
 * This program calculates combination of entered numbers.
*/

import java.util.Scanner;

public class Combination {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    if(num1 < 1){
      System.out.println("Enter a number greater than 0.");
      sc.close();
      return;
    }
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    if(num2 < 1){
      System.out.println("Enter a number greater than 0.");
      sc.close();
      return;
    }
    long total = 0;
    long fact1 = 1;
    long fact2 = 1;
    long fact3 = 1;
    for(int i = num1; i > 0 ; i--){
      fact1 *= i;
    }
    for(int i = num2; i > 0 ; i--){
      fact2 *= i;
    }
    for(int i = (num1 - num2); i > 0 ; i--){
      fact3 *= i;
    }
    // System.out.println("" + num1 + "; " + num2 + "; " + fact1 + "; " + fact2 + "; " + fact3);
    total = fact1 / (fact2 * fact3);
    System.out.println("Combination of " + num1 + " and " + num2 + " is " + total);
    sc.close();

  }
}
