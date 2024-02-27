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
    BattleLocation forest = new BattleLocation("Forest", false, null);
    forest.setEnemies(forest.createEnemiesArray(forest.createBear(), 3));
    BattleLocation cave = new BattleLocation("Cave", false, null);
    forest.setEnemies(cave.createEnemiesArray(cave.createZombie(), 3));
    BattleLocation dungeon = new BattleLocation("Dungeon", false, null);
    forest.setEnemies(dungeon.createEnemiesArray(dungeon.createBear(), 3));
    this.battleLocation = new BattleLocation[3];
    battleLocation[0] = forest;
    battleLocation[1] = cave;
    battleLocation[2] = dungeon;
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
          System.out.println("Entering the Forest...");
          combat(battleLocation[0].getEnemies());
          if (gameCheck())
            return;
          break;
        case 6:
          System.out.println("Entering the Cave...");
          combat(battleLocation[1].getEnemies());
          if (gameCheck())
            return;
          break;
        case 7:
          System.out.println("Entering the Dungeon...");
          combat(battleLocation[2].getEnemies());
          if (gameCheck())
            return;
          break;
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
          gameMenu();
      }
    }
  }

  public void combat(Enemy[] enemies) {
    System.out.println("1 - Attack\n2 - Drink Potion\n3 - Run to Safe House");
    System.out.print("Enter your choice: ");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        Enemy enemy = enemies[monsterOrder];
        playerAttack(enemy);
        if (enemy.getHealth() <= 0) {
          System.out.println("Well done. You killed a " + (enemy.getIsBoss() ? "Boss " : "" + enemy.getName()));
          System.out.println("You got " + (3 + enemy.getCurrentFightOrder()) + " golds.");
          player.setMoney(player.getMoney() + (3 + enemy.getCurrentFightOrder()));
          if (enemy.getCurrentFightOrder() >= 3) {
            if (enemy.getName() == "bear") {
              System.out.println("You got the wood essence!");
              inventory.setWoodEssence(true);
            } else if (enemy.getName() == "zombie") {
              System.out.println("You got the rock essence!");
            } else if (enemy.getName() == "minotaurus") {
              System.out.println("You got the dark essence!");
            }
            monsterOrder = 0;
            gameMenu();
          } else {
            monsterOrder++;
            combat(enemies);
          }
        }
      case 2:
        if (player.getHealth() < player.getMaxHealth()) {
          player.setHealth(player.getHealth() + 5);
          if (player.getHealth() > player.getMaxHealth()) {
            player.setHealth(player.getMaxHealth());
          }
        }
        combat(enemies);
        break;
      case 3:
        safeHouse.rest();
        BattleLocation forest = new BattleLocation("Forest", false, null);
        forest.setEnemies(forest.createEnemiesArray(forest.createBear(), 3));
        BattleLocation cave = new BattleLocation("Cave", false, null);
        forest.setEnemies(cave.createEnemiesArray(cave.createZombie(), 3));
        BattleLocation dungeon = new BattleLocation("Dungeon", false, null);
        forest.setEnemies(dungeon.createEnemiesArray(dungeon.createBear(), 3));
        this.battleLocation = new BattleLocation[3];
        battleLocation[0] = forest;
        battleLocation[1] = cave;
        battleLocation[2] = dungeon;
        gameMenu();
        break;
      default:
        combat(enemies);
    }
  }

  public void playerAttack(Enemy enemy) {
    enemy.setHealth(enemy.getHealth() - (player.getDamage() + player.getInventory().getWeaponDamage()));
    System.out.println((enemy.getIsBoss() ? "Boss " : "") + enemy.getName() + " HP: " + enemy.getHealth());
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
    System.out.println("Your damage: " + player.getDamage() + player.getInventory().getWeaponDamage());
    System.out.println("Your defence: " + player.getInventory().getArmorDefence());
    System.out.println("Your health point: " + player.getHealth());
    System.out.println("Your money: " + player.getMoney());
    System.out.println("Total kills: " + Enemy.getStaticOrder());
  }

  public void enemyAttack(Enemy enemy) {
    player.setHealth(player.getHealth() - (enemy.getDamage() - player.getInventory().getArmorDefence()));
    System.out.println(player.getName() + " HP: " + player.getHealth());
    if (player.getHealth() <= 0) {
      System.out.println("You died to a" + (enemy.getIsBoss() ? "Boss" : "") + enemy.getName());
      System.out.println("Press F5 to start again.");
      return;
    }
  }
}
