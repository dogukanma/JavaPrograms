package AdventureGame;

import java.util.Scanner;

public class Game {
  Player player;
  Shop shop;
  Inventory inventory;
  SafeHouse safeHouse;
  Scanner sc;
  BattleLocation[] battleLocation;
  private int monsterOrder = 0;

  Game(Player player, Shop shop, Inventory inventory, SafeHouse safeHouse, Scanner sc) {
    this.player = player;
    this.shop = shop;
    this.safeHouse = safeHouse;
    this.sc = sc;
    this.inventory = inventory;
    restoreLocations();
  }

  public void start() {
    player.selectChar();
    System.out.println("Welcome to your adventure " + player.getName());
    gameMenu();
  }

  public void gameMenu() {
    int menuChoice = 10;
    outerloop: while (menuChoice != 9) {
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
          System.out.println("Entering the Forest...");
          combat(battleLocation[0].getEnemies());
          if (player.getHealth() <= 0 || gameCheck()) {
            break outerloop;
          }
          break;
        case 6:
          System.out.println("Entering the Cave...");
          combat(battleLocation[1].getEnemies());
          if (player.getHealth() <= 0 || gameCheck()) {
            break outerloop;
          }
          break;
        case 7:
          System.out.println("Entering the Dungeon...");
          combat(battleLocation[2].getEnemies());
          if (player.getHealth() <= 0 || gameCheck()) {
            // System.out.println("THE GAME ENDED SOMEHOW, NOW THE GAME MUST END.");
            break outerloop;
          }
          break;
        case 9:
          System.out.println("Are you sure? (Type \"Yes\" if you are.)");
          sc.nextLine();
          String str = sc.nextLine();
          if (str.equals("Yes")) {
            return;
          } else {
            System.out.println("Wrong input.");
          }
          break;
        default:
          break;
      }
    }
  }

  public void combat(Enemy[] enemies) {
    outerloop: while (!gameCheck() || player.getHealth() > 0) {
      if (player.getHealth() <= 0) {
        // System.out.println("------THIS WORKS-------- " + player.getHealth() + " =
        // player.getHealth()");
        return;
      }
      Enemy enemy = enemies[monsterOrder];
      System.out
          .println(player.getName() + ": damage = " + (player.getDamage() + inventory.getWeaponDamage()) + " defence = "
              + inventory.getArmorDefence() + " HP = " + player.getHealth());
      System.out.println((enemy.getIsBoss() ? "Boss " : "") + enemy.getName() + "(" + enemy.getCurrentFightOrder() + ")"
          + ": damage = " + enemy.getDamage() + " HP = "
          + enemy.getHealth());
      System.out.println("1 - Attack\n2 - Drink Potion\n3 - Run to Safe House");
      System.out.print("Enter your choice: ");
      int num = sc.nextInt();
      switch (num) {
        case 1:
          playerAttack(enemy);
          if (enemy.getHealth() <= 0) {
            System.out.println("Well done. You killed a " + (enemy.getIsBoss() ? "Boss " : "" + enemy.getName()));
            System.out.println("You got " + (3 + enemy.getCurrentFightOrder()) + " golds.");
            player.setMoney(player.getMoney() + (3 + enemy.getCurrentFightOrder()));
            if (enemy.getCurrentFightOrder() >= 3) {
              if (enemy.getName().equals("Bear")) {
                System.out.println("You got the wood essence!");
                inventory.setWoodEssence(true);
              } else if (enemy.getName().equals("Zombie")) {
                System.out.println("You got the rock essence!");
                inventory.setRockEssence(true);
              } else if (enemy.getName().equals("Minotaurus")) {
                System.out.println("You got the dark essence!");
                inventory.setDarkEssence(true);
              }
              restoreLocations();
              this.monsterOrder = 0;
              break outerloop;
            } else {
              monsterOrder++;
              break;
            }
          }
          enemyAttack(enemy);
          break;
        case 2:
          if (player.getHealth() < player.getMaxHealth()) {
            player.setHealth(player.getHealth() + 5);
            if (player.getHealth() > player.getMaxHealth()) {
              player.setHealth(player.getMaxHealth());
            }
          }
          break;
        case 3:
          safeHouse.rest();
          restoreLocations();
          this.monsterOrder = 0;
          break outerloop;
        default:
          System.out.println("Wrong choice.");
          break;
      }
    }
  }

  public void playerAttack(Enemy enemy) {
    System.out.println(player.getName() + " attacks!");
    enemy.setHealth(enemy.getHealth() - (player.getDamage() + player.getInventory().getWeaponDamage()));
    System.out.println((enemy.getIsBoss() ? "Boss " : "") + enemy.getName() + " HP: " + enemy.getHealth());
  }

  public void restoreLocations() {
    BattleLocation forest = new BattleLocation("Forest", false, null);
    forest.setEnemies(forest.createBearArray(3));
    BattleLocation cave = new BattleLocation("Cave", false, null);
    cave.setEnemies(cave.createZombieArray(3));
    BattleLocation dungeon = new BattleLocation("Dungeon", false, null);
    dungeon.setEnemies(dungeon.createMinotaurusArray(3));
    BattleLocation[] restoredLocation = new BattleLocation[3];
    restoredLocation[0] = forest;
    restoredLocation[1] = cave;
    restoredLocation[2] = dungeon;
    this.battleLocation = restoredLocation;
  }

  public boolean gameCheck() {
    if (inventory.getWoodEssence() && inventory.getRockEssence() && inventory.getDarkEssence()) {
      System.out.println("Well done, you have completed the game!");
      return true;
    } else {
      return false;
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
    System.out.println("Your damage: " + (player.getDamage() + player.getInventory().getWeaponDamage()));
    System.out.println("Your defence: " + player.getInventory().getArmorDefence());
    System.out.println("Your health point: " + player.getHealth());
    System.out.println("Your money: " + player.getMoney());
  }

  public void enemyAttack(Enemy enemy) {
    System.out.println((enemy.getIsBoss() ? "Boss " : "") + enemy.getName() + " attacks!");
    player.setHealth(player.getHealth() - (enemy.getDamage() - player.getInventory().getArmorDefence()));
    System.out.println(player.getName() + " HP: " + player.getHealth());
    if (player.getHealth() <= 0) {
      System.out.println("You died to a " + (enemy.getIsBoss() ? "Boss" : "") + enemy.getName());
      System.out.println("Press F5 to start again.");
      return;
    }
  }
}
