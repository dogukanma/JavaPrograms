/*
 * @author Dogukan Unal
 * @date 14.09.2023
 * This program decides whether the given number is an Armstrong number or not.
*/

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if(num < 0){
      System.out.print("Enter zero or a positive number.");
      sc.close();
      return;
    } else if(num == 0){
      System.out.println(num + " is an Armstrong number.");
      sc.close();
      return;
    }
    if(decider(num)){
      System.out.println(num + " is an Armstrong number.");
    } else{
      System.out.println(num + " is not an Armstrong number.");
    }
    sc.close();

  }

  public static boolean decider(int num){
    int counter = 0;
    double total = 0;
    int digit = 0;
    int temp = num;
    int forTemp = num;
    while(temp != 0){
      temp /= 10;
      counter++;
    }
    for(int i = 0; i < counter; i++){
      digit = forTemp % 10;
      forTemp /= 10;
      total += Math.pow(digit, counter);
    }
    if(total == num){
      return true;
    } else{
      return false;
    }
  }
}
