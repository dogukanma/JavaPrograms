class InvalidAuthenticationException extends Exception{
  
  InvalidAuthenticationException(){
    super("Invalid credentials.");
  }
}
