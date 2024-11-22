/*
 * @author Dogukan Unal
 * @date 15.09.2023
 * This program outputs the least number amongst the given.
*/

import java.util.Scanner;

public class FindMinMax {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Kaç sayı gireceksiniz? => ");
    int n = sc.nextInt();
    int least = 0;
    int greatest = 0;
    for(int i = 1; i <= n; i++){
      System.out.print(i + ". Sayıyı giriniz: ");
      int num = sc.nextInt();
      if(num < least){
        least = num;
      }
      if(num > greatest){
        greatest = num;
      }
    }
    System.out.println("Least = " + least + "\nGreatest = " + greatest);
    sc.close();
  }
}
