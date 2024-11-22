/*
 * @author Dogukan Unal
 * @date 10.10.2023
 * This program outputs the transpose of the given matrix (array).
 * [1, 2, 5, 8, 24]
 * [9, 4, 3, -4, -2]
 * [0, 4, 7, 8, 3]
 * 
 * [1, 9, 0]
 * [2, 4, 4]
 * [5, 3, 7]
 * [8, -4, 8]
 * [24, -2, 3]
*/

import java.util.Arrays;

public class MatrixTranspose {
  public static void main(String[] args) {
    int[][] arr = new int[5][10];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int) (Math.random() * 10 + 1);
      }
    }
    int[][] arrCopy = Arrays.copyOf(arr, arr.length);
    printArr2D(arr);
    System.out.println("============================");
    int[][] arrTranspose = new int[arr[0].length][arr.length];
    for(int i = 0; i < arrCopy.length; i++){
      for(int j = 0; j < arrCopy[i].length; j++){
        arrTranspose[j][i] = arrCopy[i][j];
      }
    }
    printArr2D(arrTranspose);
  }

  static void printArr2D(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.println(Arrays.toString(arr[i]));
    }
  }
}
