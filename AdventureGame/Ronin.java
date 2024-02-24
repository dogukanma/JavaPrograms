package AdventureGame;

public abstract class Ronin {
  private static int id = 3;
  private static int damage = 11;
  private static int health = 8;
  private static int money = 0;

  Ronin() {

  }

  public static int getDamage() {
    return damage;
  }

  public static int getHealth() {
    return health;
  }

  public static int getId() {
    return id;
  }

  public static int getMoney() {
    return money;
  }
}
