/*
 * @author Dogukan Unal
 * @date 15.09.2023
 * This program outputs fibonacci series depending on the desired length.
*/

import java.util.Scanner;

public class FibonacciLoop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How long do you want the Fibonacci series to be? => ");
    int n = sc.nextInt();
    int now = 1;
    int before = 1;
    if(n < 1){
      System.out.print("Error!");
      sc.close();
      return;
    } else if(n == 1){
      System.out.print(1);
      sc.close();
      return;
    } else if(n == 2){
      System.out.print("1\t1");
      sc.close();
      return;
    } else{
      System.out.print("1\t");
      for(int i = 1; i < n; i++){
        System.out.print(now + "\t");
        int temp = now;
        now = before + now;    // 1 - 1 - 2 - 3 - 5 - 7 - 11 - 13 - 17 - 19
        before = temp;
      }
    }
    sc.close();

  }
}
