/*
 * @author Dogukan Unal
 * @date 14.09.2023
 * This program outputs a diamond pattern on terminal.
*/

import java.util.Scanner;

public class DiamondPattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How large do you want your diamond to be? => ");
    int line = sc.nextInt();
    int temp = line;
    for(int i = 1; i <= line; i++){
      for(int k = 0; k < temp - 1; k++){
        System.out.print(" ");
      }
      temp--;
      for(int j = 0; j < (i * 2 - 1); j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 1; i <= (line - 1); i++){
      for(int k = 0; k < i; k++){
        System.out.print(" ");
      }
      for(int j = 0; j < ((line - i) * 2 - 1); j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();

  }
}

/*              *
 *             ***
 *            *****
 *           *******
 *            *****  (n - 1)*2 - 1   |   n - 3
 *             ***   (n - 2)*2 - 1   |   n - 2
 *              *    (n - 3)*2 - 1   |   n - 1
*/              

// ((line - 1) * 2 - 1)
// line - i