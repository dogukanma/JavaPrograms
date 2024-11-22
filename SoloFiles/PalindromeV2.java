/*
 * @author Dogukan Unal
 * @date 14.10.2023
 * This program decides whether the given String is palindrome or not.
*/

import java.util.Scanner;

public class PalindromeV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if (palindrome(s) == true) {
      System.out.println(s + " is a palindrome.");
    } else {
      System.out.println(s + " is NOT a palindrome.");
    }
    sc.close();
  }

  static boolean palindrome(String s) {
    int i = 0, j = s.length() - 1;
    while(i <= s.length() / 2 && j >= s.length() / 2){
      if(s.charAt(i) != s.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}