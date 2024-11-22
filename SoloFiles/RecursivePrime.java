/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program decides whether the given number is prime or not.
*/

import java.util.Scanner;

public class RecursivePrime {
  
  static boolean isPrime(int n, int x){
    if(x == 1){
      return true;
    }
    if(n % x == 0){
      return false;
    }
    return isPrime(n, x - 1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    if(n == 1){
      System.out.println(n + " is NOT a prime number.");
      sc.close();
      return;
    } else if(n <= 0){
      System.out.println("Please enter a number greater than 0");
      sc.close();
      return;
    } else{
    System.out.println(isPrime(n, n - 1) ? n + " is a prime number." : n + " is NOT a prime number.");
    }
    sc.close();
  }
}
