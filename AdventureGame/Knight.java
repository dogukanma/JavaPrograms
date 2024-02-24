package AdventureGame;

public abstract class Knight {
  private static int id = 1;
  private static int damage = 5;
  private static int health = 20;
  private static int money = 15;

  Knight() {

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
