/*
 * @author Dogukan Unal
 * @date 04.12.2023
 * This program outputs the greatest common divisor of given 2 numbers.
*/

import java.util.Scanner;

public class EuclideanAlgorithm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("This program calculates the GCD of given 2 numbers.");
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    int greater;
    int less;
    if (num1 > num2) {
      greater = num1;
      less = num2;
    } else {
      greater = num2;
      less = num1;
    }
    System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcdEuclidean(greater, less));
    sc.close();
  }

  static int gcdEuclidean(int greater, int less) {
    if (less == 0) {
      return greater;
    } else {
      int remainder = greater % less;
      System.out.println("greater: " + greater + " | less: " + less + " | remainder: " + remainder);
      return gcdEuclidean(less, remainder);
    }
  }
}

// take greater divide by less
// return func(less, remainder)
// if remainder == 0 -> return divisor