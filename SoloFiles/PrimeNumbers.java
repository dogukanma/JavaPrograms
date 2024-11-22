/*
 * @author Dogukan Unal
 * @date 15.09.2023
 * This program outputs prime numbers starting from 1 to given number with loops.
*/

import java.util.Scanner;

public class PrimeNumbers {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    int counter = 0;
    System.out.println("------ PRIME NUMBERS UP TO " + n + " ------");
    if(n < 1){
      System.out.println("Enter a number greater than 1");
      sc.close();
      return;
    } else if(n == 2){
      System.out.println(n);
      sc.close();
      return;
    } else if(n > 2){
      for(int i = 2; i <= n; i++){
        for(int j = 2; j < i; j++){
          if(i % j == 0){
            counter++;
          }
        }
        if(counter > 0){
          counter = 0;
          continue;
        }
        System.out.printf(i + "\t");
      }
    }
    sc.close();

  }
}
