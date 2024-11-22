import java.util.ArrayList;
import java.util.Date;

class User {
  private String name;
  private String surname;
  private String email;
  private String password;
  private String job;
  private int age;
  private ArrayList<Address> addresses;
  private Date last_login;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
