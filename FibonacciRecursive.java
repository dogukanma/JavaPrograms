/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program contains a recursive method that returns the n. element of the fibonacci series.
*/

import java.util.Scanner;

public class FibonacciRecursive {

  static int fiboRec(int n){
    if(n == 0) {
      return 0;
    } else if(n == 1){
      return 1;
    } else{
      return fiboRec(n - 1) + fiboRec(n - 2);
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fiboRec(n));
    // 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55

    sc.close();
  }
}
