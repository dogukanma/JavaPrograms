package AdventureGame;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Player player = new Player(sc);
    Inventory inventory = new Inventory();
    Shop shop = new Shop(inventory, sc, player);
    SafeHouse safeHouse = new SafeHouse(player);
    Game game = new Game(player, shop, inventory, safeHouse, sc);
    game.start();
    sc.close();
  }
}
