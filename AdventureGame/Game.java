package AdventureGame;

import java.util.Scanner;

public class Game {
  Player player;
  Shop shop;
  Inventory inventory;
  SafeHouse safeHouse;
  Scanner sc;

  Game(Player player, Shop shop, Inventory inventory, SafeHouse safeHouse, Scanner sc) {
    this.player = player;
    this.shop = shop;
    this.safeHouse = safeHouse;
    this.sc = sc;
    this.inventory = inventory;
  }

  public void start() {
    player.selectChar();
    System.out.println("Welcome to your adventure " + player.getName());
    gameMenu();
  }

  public void gameMenu() {
    int menuChoice = 10;
    while (menuChoice != 9) {
      System.out.println("1 - Status");
      System.out.println("2 - Inventory");
      System.out.println("3 - Go to Safe House");
      System.out.println("4 - Go to Shop");
      System.out.println("5 - Go to Forest");
      System.out.println("6 - Go to Cave");
      System.out.println("7 - Go to Dungeon");
      System.out.println("9 - Exit Game");
      System.out.print("Enter your choice: ");
      menuChoice = sc.nextInt();
      switch (menuChoice) {
        case 1:
          statusInfo();
          break;
        case 2:
          inventoryInfo();
          break;
        case 3:
          safeHouse.rest();
          break;
        case 4:
          shop.menu();
          break;
        case 5:
        case 6:
        case 7:
        case 9:
          System.out.println("Are you sure? (Type \"Yes\" if you are.)");
          sc.nextLine();
          String str = sc.nextLine();
          if (str.equals("Yes")) {
            return;
          } else {
            System.out.println("Wrong input.");
            gameMenu();
          }
        default:

      }
    }
  }

  public void inventoryInfo() {
    System.out.println("Weapon: " + inventory.getWeapon());
    System.out.println("Weapon damage: " + inventory.getWeaponDamage());
    System.out.println("Armor: " + inventory.getArmor());
    System.out.println("Armor defence: " + inventory.getArmorDefence());
    System.out.println("Potion: " + inventory.getPotion());
    System.out.println("Rock Essence: " + (inventory.getRockEssence() ? "obtained" : "not found yet"));
    System.out.println("Wood Essence: " + (inventory.getWoodEssence() ? "obtained" : "not found yet"));
    System.out.println("Dark Essence: " + (inventory.getDarkEssence() ? "obtained" : "not found yet"));
  }

  public void statusInfo() {
    System.out.println("Your name: " + player.getName());
    System.out.println("Your class: " + player.getCharClass());
    System.out.println("Your damage: " + player.getDamage());
    System.out.println("Your health point: " + player.getHealth());
    System.out.println("Your money: " + player.getMoney());
  }

}
