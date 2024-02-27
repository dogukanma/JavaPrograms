package AdventureGame;

public class SafeHouse{
  private boolean onLocation = false;
  private Player player;

  SafeHouse(Player player){
    this.player = player;
  }

  public boolean getOnLocation(){
    return this.onLocation;
  }

  public void setOnLocation(boolean onLocation) {
    this.onLocation = onLocation;
  }

  public void rest(){
    player.setHealth(player.getMaxHealth());
    System.out.println("You rested for couple hours. Your health is full now. (HP: " + player.getHealth() + ")");
  }
}
