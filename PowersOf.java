/*
 * @author Dogukan Unal
 * @date 13.09.2023
 * This program writes the powers of 4 and 5 starting from zero to entered number.
*/

import java.util.Scanner;

public class PowersOf {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number => ");
    int num = sc.nextInt();
    if(num <= 0){
      System.out.println("Enter a number greater than 0.");
      sc.close();
      return;
    }
    int powerFour = 0;
    int powerFive = 1;
    for(int i = 0; i <= num; i++){
      if(i == Math.pow(4, powerFour)){
        System.out.println(i);
        powerFour++;
      } else if(i == Math.pow(5, powerFive)){
        powerFive++;
        System.out.println(i);
      }
    }
    sc.close();

  }
}
