package AdventureGame;

import java.util.Scanner;

public class Shop{
  private boolean onLocation = false;
  private Player player;
  Inventory inventory;
  Scanner sc;

  Shop(Inventory inventory, Scanner sc, Player player){
    this.inventory = inventory;
    this.sc = sc;
    this.player = player;
  }

  public boolean getOnLocation() {
    return this.onLocation;
  }

  public void setOnLocation(boolean onLocation) {
    this.onLocation = onLocation;
  }

  public void menu() {
    System.out.println("Your have: " + player.getMoney() + " golds.");
    System.out.println("1 - Knife: Damage + 2 (5 gold)");
    System.out.println("2 - Sword: Damage + 4 (10 gold)");
    System.out.println("3 - Rifle: Damage + 8 (25 gold)");
    System.out.println("4 - Light Armor: Block + 1 (8 gold)");
    System.out.println("5 - Medium Armor: Block + 2 (12 gold)");
    System.out.println("6 - Heavy Armor: Block + 4 (20 gold)");
    System.out.println("7 - Potion: Restores 5 HP (5 gold)");
    System.out.println("9 - Exit Shop");
    System.out.println("IMPORTANT: IF YOU BUY A BETTER EQUIPMENT, NEVER BUY A WORSE ONE AGAIN.");
    System.out.print("Enter your choice: ");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        if (player.getMoney() >= 5) {
          inventory.setWeapon("Knife");
          inventory.setWeaponDamage(2);
          // player.setDamage(num);
          player.setMoney(player.getMoney() - 5);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 2:
        if (player.getMoney() >= 10) {
          inventory.setWeapon("Sword");
          inventory.setWeaponDamage(4);
          player.setMoney(player.getMoney() - 10);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 3:
        if (player.getMoney() >= 25) {
          inventory.setWeapon("Rifle");
          inventory.setWeaponDamage(8);
          player.setMoney(player.getMoney() - 25);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 4:
        if (player.getMoney() >= 5) {
          inventory.setArmor("Light Armor");
          inventory.setArmorDefence(1);
          player.setMoney(player.getMoney() - 8);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 5:
        if (player.getMoney() >= 12) {
          inventory.setArmor("Medium Armor");
          inventory.setArmorDefence(2);
          player.setMoney(player.getMoney() - 12);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 6:
        if (player.getMoney() >= 20) {
          inventory.setArmor("Heavy Armor");
          inventory.setArmorDefence(4);
          player.setMoney(player.getMoney() - 20);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 7:
        if (player.getMoney() >= 5) {
          inventory.setPotion(inventory.getPotion() + 1);
          player.setMoney(player.getMoney() - 5);
        } else {
          System.out.println("You don't have enough money.");
        }
        break;
      case 9:
        break;
      default:
        while (num == 8 || num < 1 || num > 9) {
          System.out.println("Enter a valid choice:");
          menu();
        }
    }
  }
}
