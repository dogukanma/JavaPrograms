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
    int chance = (int)(Math.random() * 5);
    Enemy bear = new Enemy(5, 10, "Bear", false);
    if(chance < 4){
      bear.setIsBoss(false);
    } else{
      bear.setIsBoss(true);
      bear.setDamage(bear.getDamage() * 2);
      bear.setHealth(bear.getHealth() * 2);
    }
    return bear;
  }

  public Enemy createZombie(){
    int chance = (int)(Math.random() * 5);
    Enemy zombie = new Enemy(7, 15, "Zombie", false);
    if(chance < 4){
      zombie.setIsBoss(false);
    } else{
      zombie.setIsBoss(true);
      zombie.setDamage(zombie.getDamage() * 2);
      zombie.setHealth(zombie.getHealth() * 2);
    }
    return zombie;
  }

  public Enemy createMinotaurus(){
    int chance = (int)(Math.random() * 5);
    Enemy minotaurus = new Enemy(7, 15, "Minotaurus", false);
    if(chance < 4){
      minotaurus.setIsBoss(false);
    } else{
      minotaurus.setIsBoss(true);
      minotaurus.setDamage(minotaurus.getDamage() * 2);
      minotaurus.setHealth(minotaurus.getHealth() * 2);
    }
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
