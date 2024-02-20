package SchoolSystem;

public class Course{
  public static void main(String[] args){
    Instructor ins_1 = new Instructor("Jake", "jake@company.com", "1111111111", "physics", "professor");
    Officer off_1 = new Officer("Amy", "amy@company.com", "2222222222", "security", "09:00 - 18:00");

    ins_1.login();
    ins_1.cafeteria();
    ins_1.setName("Raymond");
    ins_1.logout();

    off_1.login();
    off_1.cafeteria();
    off_1.setName("Kevin");
    off_1.logout();
  }
}