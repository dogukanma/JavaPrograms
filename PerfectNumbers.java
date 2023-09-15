/*
 * @author Dogukan Unal
 * @date 15.09.2023
 * This program decides whether the given number is a perfect number or not.
*/

import java.util.Scanner;

public class PerfectNumbers {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n/2; i++){
      if(n % i == 0){
        sum += i;
      }
    }
    if(sum == n){
      System.out.print("Given number is a perfect number");
    } else{
      System.out.print("Given number is NOT a perfect number");
    }
    sc.close();
  }
}
