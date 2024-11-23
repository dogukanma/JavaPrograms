import java.util.ArrayList;

abstract class Account implements Comparable<Account>{
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

  boolean login_status(){
    if(authStatus == AuthenticationStatus.FAIL){
      return false;
    } else{
      return true;
    }
  }

  void add_address(Address address){
    AddressManager.add_address(user.getAddresses(), address);
  }

  void remove_address(Address address){
    AddressManager.remove_address(user.getAddresses(), address);
  }

  abstract void add_insurance(Insurance insurance);
  public User getUser() {
    return user;
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }
}