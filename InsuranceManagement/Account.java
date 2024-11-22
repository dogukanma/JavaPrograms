import java.util.ArrayList;
import java.util.List;

abstract class Account{
  private User user;
  private ArrayList<Insurance> insuranceList;
  private enum AuthenticationStatus{
    SUCCESS,
    FAIL
  }
  private AuthenticationStatus authStatus;

  final void showUserInfo(){

  }

  boolean login(String email, String password) throws InvalidAuthenticationException{
    if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
      this.authStatus = AuthenticationStatus.SUCCESS;
      return true;
    } else{
      this.authStatus = AuthenticationStatus.FAIL;
      throw new InvalidAuthenticationException();
    }
  }
}