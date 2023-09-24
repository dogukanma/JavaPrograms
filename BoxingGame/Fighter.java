/*
 * @author Dogukan Unal
 * @date 24.09.2023
*/

package BoxingGame;

class Fighter {
  String name;
  int damage;
  int health;
  int agility;
  int weight;

  Fighter(String name, int damage, int health, int agility, int weight) {
    this.name = name;
    this.damage = damage;
    this.health = health;
    if (agility < 100 && agility > 0) {
      this.agility = agility;
    } else if (agility >= 100) {
      this.agility = 99;
    } else {
      this.agility = 1;
    }
    this.weight = weight;
  }

  void hit(Fighter foe) {
    System.out.println(this.name + " hit " + this.damage + " damage!");
    if (foe.health - this.damage < 0) {
      foe.health = 0;
    } else {
      foe.health = foe.health - this.damage;
    }
  }

  boolean isDodge() {
    double random = Math.random() * 100 + 1;
    if (random <= this.agility) {
      return true;
    } else {
      return false;
    }
  }
}
