import java.util.Set;
import java.util.TreeSet;

public class AccountManager {
  Set<Account> account_set = new TreeSet<>();

  boolean login(String email, String password) {
    try {
      for (Account acc : account_set) {
        if (acc.getUser().getEmail().equals(email)) {
          if (acc.getUser().getPassword().equals(password)) {
            acc.login(email, password);
            return true;
          }
        }
      }
    } catch (Exception e) {
      System.out.println(e);
      return false;
    }
    return false;
  }
}
