package AdventureGame;

public class Enemy {
  private static int staticOrder = 1;
  private int damage;
  private int health;
  private String name;
  private boolean isBoss;
  private int order = staticOrder;
  private int currentFightOrder;

  Enemy(int damage, int health, String name, boolean isBoss) {
    this.damage = damage;
    this.health = health;
    this.name = name;
    this.isBoss = isBoss;
    this.order = staticOrder;
    staticOrder++;
  }

  public int getCurrentFightOrder() {
    return currentFightOrder;
  }

  public static int getStaticOrder() {
    return staticOrder;
  }

  public void setCurrentFightOrder(int currentFightOrder) {
    this.currentFightOrder = currentFightOrder;
  }

  public static void setStaticOrder(int staticOrder) {
    Enemy.staticOrder = staticOrder;
  }

  public int getDamage() {
    return damage;
  }

  public int getOrder() {
    return order;
  }

  public int getHealth() {
    return health;
  }

  public String getName() {
    return name;
  }

  public boolean getIsBoss() {
    return isBoss;
  }

  public void setIsBoss(boolean isBoss) {
    this.isBoss = isBoss;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void setName(String name) {
    this.name = name;
  }
}
