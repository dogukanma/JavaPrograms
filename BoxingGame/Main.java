/*
 * @author Dogukan Unal
 * @date 24.09.2023
*/

package BoxingGame;

public class Main {
  public static void main(String[] args){
    Fighter mike = new Fighter("Mike", 40, 95, 190, 95);
    Fighter floyd = new Fighter("Floyd", 20, 85, -5, 85);
    Match match = new Match(mike, floyd);
    match.run();
  }
  
}
