/*
 * @author Dogukan Unal
 * @date 15.09.2023
 * This program calculates the GCD and LCM of given numbers.
*/

import java.util.Scanner;

public class gcdAndLcm {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int less = num1 <= num2 ? num1 : num2;
    // int great = num1 >= num2 ? num1 : num2;
    int GCD = 1;
    // int LCM = num1 * num2;
    while(less >= 1){
      if(num1 % less == 0 && num2 % less == 0){
        GCD = less;
        break;
      }
      less--;
    }
    // while(great % num1 != 0 || great % num2 != 0){
    //   if(great % num1 == 0 && great % num2 == 0){
    //     LCM = great;
    //     break;
    //   }
    //   great++;
    // }
    int LCM = num1 * num2 / GCD;
    System.out.println("GCD = " + GCD + " ; LCM = " + LCM);
    sc.close();
  }
}
