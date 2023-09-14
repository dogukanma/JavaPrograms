/*
 * @author Dogukan Unal
 * @date 14.09.2023
 * This program calculates the entered integer power of entered integer.
*/

import java.util.Scanner;

public class MathPower {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Important note: You can only enter integers as inputs in this program.");
    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();
    double total = 1;

    if(num2 == 0){
      total = 1;
    } else if(num2 < 0){
      for(int i = 0; i > num2; i--){
        total /= num1;
      }
    } else{
      for(int i = 0; i < num2; i++){
        total *= num1;
      }
    }

    System.out.println(total);
    sc.close();
  }
}
