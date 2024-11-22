/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program decides whether the given number is a palindrome or not.
*/

import java.util.Scanner;

public class Palindrome {

  static boolean isPalindrome(int n){
    int temp = n;
    int reverse = 0;
    while(temp != 0){
      reverse *= 10;
      reverse += temp % 10;
      temp /= 10;
    }
    System.out.println("number = " + n + " ; reverse = " + reverse);
    if(n == reverse){
      return true;
    } else{
      return false;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isPalindrome(n)){
      System.out.println("Given number is palindrome.");
    } else{
      System.out.println("Given number is NOT palindrome.");
    }
    sc.close();

  }
}
