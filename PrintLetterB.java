/*
 * @author Dogukan Unal
 * @date 02.10.2023
 * This program outputs the letter "B" with stars (*).

  * * * 
  *     *
  * * * 
  *     *
  * * * 

 */

public class PrintLetterB {
  public static void main(String[] args){
    int[][] letter = new int[5][4];
    for(int i = 0; i < letter.length; i++){
      for(int j = 0; j < letter[0].length; j++){
        if(i == 0 && j < (letter[0].length - 1)){
          System.out.print("* ");
        } else if(i == 1){
          if(j == 0 || j == 3){
            System.out.print("* ");
          } else{
            System.out.printf("%2s", "");
          }
        } else if(i == 2){
          if(j != (letter[i].length - 1)){
            System.out.print("* ");
          }
        } else if(i == 3){
          if(j == 0 || j == 3){
            System.out.print("* ");
          } else{
            System.out.printf("%2s", "");
          }
        } else{
          if(j < (letter[0].length - 1)){
            System.out.print("* ");
          }
        }
      }
      System.out.println();
    }
  }
}
