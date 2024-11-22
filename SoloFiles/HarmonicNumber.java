/*
 * @author Dogukan Unal
 * @date 14.09.2023
 * This program calculates the harmonic number according to given number.
*/

import java.util.Scanner;

public class HarmonicNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double total = 0;
    for(int i = 1; i <= n; i++){
      total += (1.0 / i);
    }
    System.out.println(total);
    sc.close();
  }
}
