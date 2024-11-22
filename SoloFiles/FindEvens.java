/*
 * @author Dogukan Unal
 * @date 13.09.2023
 * This program calculates the average of numbers that can be divided 
 * by 3 and numbers that can be divided by 4 starting from zero to entered number.
*/

import java.util.Scanner;

public class FindEvens {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if(num < 0){
      System.out.println("Enter a number greater than 0");
      sc.close();
      return;
    } else if(num < 3){
      System.out.println(0);
      sc.close();
      return;
    }
    double sum = 0;
    int totalTimes = 0;
    for(int i = 1; i <= num; i++){
      if(i % 3 != 0 && i % 4 != 0){
        continue;
      }
      sum += i;
      totalTimes++;
    }
    double average = sum / totalTimes;
    System.out.println("totalTimes = " + totalTimes + "; sum = " + sum + "; Average = " + average);
    sc.close();
  }
}
