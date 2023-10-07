/*
 * @author Dogukan Unal
 * @date 07.10.2023
 * This program outputs how many times did the elements of an array reoccurred.
*/

import java.util.Arrays;

public class RecurringTime {
  public static void main(String[] args){
    int[] arr = new int[20];
    for(int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random() * 10 + 1);
    }
    System.out.println("============= ARRAY =============");
    System.out.println(Arrays.toString(arr));
    System.out.println("============= RESULT =============");
    for(int i = 0; i < arr.length; i++){
      int times = 1;  // occurrence counter
      boolean flag = false;
      for(int j = i - 1; j >= 0; j--){
        if(arr[j] == arr[i]){
          flag = true;  // if we processed the same number before, flag = true;
          break;
        }
      }
      if(flag == false){
        for(int k = i + 1; k < arr.length; k++){
          if(arr[i] == arr[k]){
            times++;
          }
        }
        System.out.println(arr[i] + ": occurred " + times + " times");
      }
    }
  }
}
