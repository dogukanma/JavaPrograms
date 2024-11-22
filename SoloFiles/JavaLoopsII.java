/*
 * @author Dogukan Unal
 * @date 17.09.2023
 * Hackerrank Java loops II = https://www.hackerrank.com/challenges/java-loops/problem
*/

import java.util.Scanner;

public class JavaLoopsII {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      int result = a;
      for(int j = 0; j < n; j++){
        result += Math.pow(2, j) * b;
        System.out.print(result);
        System.out.print(" ");
        // for(int k = 0; k < n; k++){
        //     System.out.print(" ");
        // }
      }
      System.out.println();
    }
    in.close();
  }
}
