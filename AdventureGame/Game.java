package AdventureGame;
import java.util.Scanner;

public class Game {
  Player player = new Player();
  private Scanner sc = new Scanner(System.in);

  public void start() {
    player.selectChar();
    System.out.println("Welcome to your adventure " + player.getName());
    int menuChoice = 10;
    while(menuChoice != 9){
      System.out.println("1 - Status");
      System.out.println("2 - Inventory");
      System.out.println("3 - Go to Safe House");
      System.out.println("4 - Go to Forest");
      System.out.println("5 - Go to Cave");
      System.out.println("6 - Go to Dungeon");
      System.out.println("9 - Exit Game");
      menuChoice = sc.nextInt();
      switch(menuChoice){
        case 1:
          statusInfo();
          break;
      }
    }
  }

  public void statusInfo(){
    System.out.println("Your name: " + player.getName());
    System.out.println("Your class: " + player.getCharClass());
    System.out.println("Your damage: " + player.getDamage());
    System.out.println("Your health point: " + player.getHealth());
    System.out.println("Your money: " + player.getMoney());
  }

}
