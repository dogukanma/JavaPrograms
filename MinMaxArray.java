/*
 * @author Dogukan Unal
 * @date 26.09.2023
 * This program calculates the minimum and maximum values of given array.
*/

public class MinMaxArray {
  public static void main(String[] args){
    int[] testArr = {1, 7, 3, -6, 9, 0, 2};
    double[] testArr2 = {-5.4, 4.3, 9.0, 1.5, -17.3, 5.1};
    minMax(testArr);
    minMax(testArr2);
  }

  static void minMax(int[] arr){
    int min = arr[0];
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("Minimum: " + min + " | Maximum: " + max);
  }

  static void minMax(double[] arr){
    double min = arr[0];
    double max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("Minimum: " + min + " | Maximum: " + max);
  }
}
