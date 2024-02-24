package AdventureGame;

public abstract class Hunter {
  private static int id = 2;
  private static int damage = 7;
  private static int health = 11;
  private static int money = 5;

  Hunter() {

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
