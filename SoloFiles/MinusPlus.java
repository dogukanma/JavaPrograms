/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program outputs a pattern decreasing by given number and when it hits an integer less than or equal to zero the pattern changes oppositely.
*/

import java.util.Scanner;

public class MinusPlus {

  static void pattern(int ref, int temp, int change, boolean direction){
    if(temp == ref){
      if(direction){
        System.out.print(temp + " ");
        pattern(ref, temp + change, change, direction);
      } else{
        System.out.print(temp + " ");
        pattern(ref, temp - change, change, direction);
      }
    } else if(temp <= 0){
      System.out.print(temp + " ");
      direction = true;
      pattern(ref, temp + change, change, direction);
    } else if(temp > ref){
      return;
    } else{
      if(direction){
        System.out.print(temp + " ");
        pattern(ref, temp + change, change, direction);
      } else{
        System.out.print(temp + " ");
        pattern(ref, temp - change, change, direction);
      }
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Enter a number to create a pattern: ");
    int min = sc.nextInt();
    pattern(n, n, min, false);
    sc.close();
  }
}
