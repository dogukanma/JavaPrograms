package AdventureGame;

public class Inventory {
  private boolean rockEssence = false;
  private boolean woodEssence = false;
  private boolean darkEssence = false;
  private int potion = 0;
  private String weapon = "none";
  private String armor = "none";
  private int weaponDamage = 0;
  private int armorDefence = 0;

  public String getArmor() {
    return armor;
  }

  public int getArmorDefence() {
    return armorDefence;
  }

  public int getPotion() {
    return potion;
  }

  public String getWeapon() {
    return weapon;
  }

  public int getWeaponDamage() {
    return weaponDamage;
  }

  public boolean getRockEssence(){
    return this.rockEssence;
  }

  public boolean getWoodEssence(){
    return this.woodEssence;
  }

  public boolean getDarkEssence(){
    return this.darkEssence;
  }

  public void setArmor(String armor) {
    this.armor = armor;
  }

  public void setArmorDefence(int armorDefence) {
    this.armorDefence = armorDefence;
  }

  public void setDarkEssence(boolean darkEssence) {
    this.darkEssence = darkEssence;
  }

  public void setPotion(int potion) {
    this.potion = potion;
  }

  public void setRockEssence(boolean rockEssence) {
    this.rockEssence = rockEssence;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void setWeaponDamage(int weaponDamage) {
    this.weaponDamage = weaponDamage;
  }

  public void setWoodEssence(boolean woodEssence) {
    this.woodEssence = woodEssence;
  }
}