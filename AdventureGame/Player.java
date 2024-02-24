package AdventureGame;

import java.util.Scanner;

public class Player {
  private Inventory inventory = new Inventory();
  private int damage;
  private int health;
  private int money;
  private String name;
  private String charClass;

  public void selectChar() {
    System.out.println("");
    System.out.println("Press 1 to choose Knight \t Press 2 to choose Hunter \t Press 3 to choose Ronin\n");
    System.out.println("Character\tID\tDamage\tHealth Point\tStarting Money");
    System.out.println("Knight\t\t1\t5\t20\t\t15");
    System.out.println("Hunter\t\t2\t7\t11\t\t5");
    System.out.println("Ronin\t\t3\t11\t8\t\t0");
    System.out.print("Choose your character: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    switch (num) {
      case 1:
        this.damage = Knight.getDamage();
        this.health = Knight.getHealth();
        this.money = Knight.getMoney();
        this.charClass = "Knight";
        break;
      case 2:
        this.damage = Hunter.getDamage();
        this.health = Hunter.getHealth();
        this.money = Hunter.getMoney();
        this.charClass = "Hunter";
        break;
      case 3:
        this.damage = Ronin.getDamage();
        this.health = Ronin.getHealth();
        this.money = Ronin.getMoney();
        this.charClass = "Ronin";
        break;
      default:
        this.damage = Ronin.getDamage();
        this.health = Ronin.getHealth();
        this.money = Ronin.getMoney();
        this.charClass = "Ronin";
    }
    System.out.print("Please enter your name: ");
    this.name = sc.nextLine();
    sc.close();
  }

  public int getDamage() {
    return damage;
  }

  public int getHealth() {
    return health;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public int getMoney() {
    return money;
  }

  public String getCharClass() {
    return charClass;
  }

  public void setCharClass(String charClass) {
    this.charClass = charClass;
  }

  public String getName() {
    return name;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void setName(String name) {
    this.name = name;
  }
}
