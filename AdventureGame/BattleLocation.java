package AdventureGame;

public class BattleLocation extends Location {
  private String name;
  private boolean onLocation;
  private Enemy[] enemies;

  BattleLocation(String name, boolean onLocation, Enemy[] enemies) {
    super(name, onLocation);
    this.enemies = enemies;
  }

  public Enemy createBear(){
    int chance = (int)(Math.random() * 2);
    Enemy bear = new Enemy(5, 10, "Bear", chance == 0 ? false : true);
    return bear;
  }

  public Enemy createZombie(){
    int chance = (int)(Math.random() * 2);
    Enemy zombie = new Enemy(7, 15, "Zombie", chance == 0 ? false : true);
    return zombie;
  }

  public Enemy createMinotaurus(){
    int chance = (int)(Math.random() * 2);
    Enemy minotaurus = new Enemy(7, 15, "Minotaurus", chance == 0 ? false : true);
    return minotaurus;
  }

  public Enemy[] createEnemiesArray(Enemy enemy, int enemyNumber){
    Enemy[] enemies = new Enemy[enemyNumber];
    for(int i = 0; i < enemyNumber; i ++){
      enemies[i] = enemy;
      enemies[i].setCurrentFightOrder(i + 1);
    }
    return enemies;
  }

  public Enemy[] getEnemies() {
    return enemies;
  }

  public boolean getOnLocation() {
    return onLocation;
  }

  public void setOnLocation(boolean onLocation) {
    this.onLocation = onLocation;
  }

  public String getName() {
    return name;
  }

  public void setEnemies(Enemy[] enemies) {
    this.enemies = enemies;
  }

  public void setName(String name) {
    this.name = name;
  }

}
