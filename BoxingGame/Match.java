/*
 * @author Dogukan Unal
 * @date 24.09.2023
*/

package BoxingGame;

class Match {
  Fighter f1;
  Fighter f2;

  Match(Fighter f1, Fighter f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  void run() {
    int count = 1;
    if (this.f1.weight - this.f2.weight > 10 || this.f2.weight - this.f1.weight > 10) {
      System.out.println("These fighters' weight classes are not the same. Fight cancelled.");
      return;
    }
    System.out.println("========== ROUND " + count + " ==========");
    count++;
    if (firstHit() == 1) {
      System.out.println(this.f1.name + " starts!");
      if (!this.f2.isDodge()) {
        this.f1.hit(this.f2);
      } else {
        System.out.println(this.f2.name + " has dodged the punch!");
      }
      if (isWin()) {
        return;
      }
      System.out.println(this.f1.name + ": " + f1.health + " HP");
      System.out.println(this.f2.name + ": " + f2.health + " HP");
      while (this.f1.health > 0 && this.f2.health > 0) {
        System.out.println("========== ROUND " + count + " ==========");
        if (!this.f1.isDodge()) {
          this.f2.hit(this.f1);
        } else {
          System.out.println(this.f1.name + " has dodged the punch!");
        }
        if (isWin()) {
          break;
        }
        if (!this.f2.isDodge()) {
          this.f1.hit(this.f2);
        } else {
          System.out.println(this.f2.name + " has dodged the punch!");
        }
        if (isWin()) {
          break;
        }
        System.out.println(this.f1.name + ": " + f1.health + " HP");
        System.out.println(this.f2.name + ": " + f2.health + " HP");
        count++;
      }
    } else {
      System.out.println(this.f2.name + " starts!");
      if (!f1.isDodge()) {
        this.f2.hit(this.f1);
      } else {
        System.out.println(this.f1.name + " has dodged the punch!");
      }
      if (isWin()) {
        return;
      }
      while (this.f1.health > 0 && this.f2.health > 0) {
        System.out.println("========== ROUND " + count + " ==========");
        if (!f2.isDodge()) {
          this.f1.hit(this.f2);
        } else {
          System.out.println(this.f2.name + " has dodged the punch!");
        }
        if (isWin()) {
          break;
        }
        if (!f1.isDodge()) {
          this.f2.hit(this.f1);
        } else {
          System.out.println(this.f1.name + " has dodged the punch!");
        }
        if (isWin()) {
          break;
        }
        System.out.println(this.f1.name + ": " + f1.health + " HP");
        System.out.println(this.f2.name + ": " + f2.health + " HP");
        count++;
      }
    }
  }

  boolean isWin() {
    if (this.f1.health <= 0) {
      System.out.println(this.f2.name + ": " + this.f2.health + " HP");
      System.out.println(this.f1.name + ": " + this.f1.health + " HP");
      System.out.println(this.f2.name + " has won the match!");
      return true;
    } else if (this.f2.health <= 0) {
      System.out.println(this.f1.name + ": " + this.f1.health + " HP");
      System.out.println(this.f2.name + ": " + this.f2.health + " HP");
      System.out.println(this.f1.name + " has won the match!");
      return true;
    } else {
      return false;
    }
  }

  int firstHit() {
    int total = this.f1.agility + this.f2.agility;
    int random = (int) (Math.random() * total + 1);
    if (random <= this.f1.agility) {
      return 1;
    } else {
      return 2;
    }
  }
}