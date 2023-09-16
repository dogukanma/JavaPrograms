/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program calculates the given power of given number.
*/

import java.util.Scanner;

public class RecursivePower {

  static int recPower(int base, int power){
    if(power == 0){
      return 1;
    } else if(power == 1){
      return base;
    } else{
      return base * recPower(base, power - 1);
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please only enter integers greater than or equal to 0");
    System.out.print("Base: ");
    int base = sc.nextInt();
    System.out.print("Power: ");
    int power = sc.nextInt();
    System.out.println(recPower(base, power));
    sc.close();
  }
}
