package SchoolSystem;

public class Employee {
  private String name;
  private String email;
  private String mpno;

  Employee(String name, String email, String mpno) {
    this.name = name;
    this.email = email;
    this.mpno = mpno;
  }

  public void login() {
    System.out.println(this.name + " logged in.");
  };

  public void logout() {
    System.out.println(this.name + " logged out.");
  };

  public void cafeteria() {
    System.out.println(this.name + " entered cafeteria.");
  };

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getMpno() {
    return mpno;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setMpno(String mpno) {
    this.mpno = mpno;
  }

}