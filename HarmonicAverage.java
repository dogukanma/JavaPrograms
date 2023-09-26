/*
 * @author Dogukan Unal
 * @date 26.09.2023
 * This program calculates the harmonic mean of given array.
*/

public class HarmonicAverage{
  public static void main(String[] args){
    int[] myArr = {5, 2, 3};
    System.out.printf("%.2f", harmonicAverage(myArr));
  }
  
  static double harmonicAverage(int[] arr){
    int n = arr.length;
    double harmonic = 0;
    for(int i = 0; i < arr.length; i++){
      double temp = 1.0 / arr[i];
      harmonic += temp;
    }
    return n / harmonic;
  }
}