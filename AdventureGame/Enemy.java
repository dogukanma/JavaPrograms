package AdventureGame;

public class Enemy {
  private int damage;
  private int health;
  private String name;
  private boolean isBoss;
  private int currentFightOrder;

  Enemy(int damage, int health, String name, boolean isBoss) {
    this.damage = damage;
    this.health = health;
    this.name = name;
    this.isBoss = isBoss;
  }

  public int getCurrentFightOrder() {
    return currentFightOrder;
  }

  public void setCurrentFightOrder(int currentFightOrder) {
    this.currentFightOrder = currentFightOrder;
  }

  public int getDamage() {
    return damage;
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

  public void setHealth(int health) {
    this.health = health;
  }

  public void setName(String name) {
    this.name = name;
  }
}
