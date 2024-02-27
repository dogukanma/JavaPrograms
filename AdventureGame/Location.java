package AdventureGame;

public abstract class Location {
  private String name;
  private boolean onLocation = false;

  Location(String name, boolean onLocation) {
    this.name = name;
    this.onLocation = onLocation;
  }

  public String getName() {
    return name;
  }

  public boolean getOnLocation() {
    return onLocation;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOnLocation(boolean onLocation) {
    this.onLocation = onLocation;
  }
}
