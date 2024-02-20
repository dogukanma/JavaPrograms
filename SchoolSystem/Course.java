package SchoolSystem;

public class Course {
  public static void main(String[] args) {

    LabAssistant sherry = new LabAssistant("Sherry", "sherry@company.com", "0000000000", "Algebra", "Phd",
        "16:00 - 17:30");

    Professor terry = new Professor("Terry", "terry@company.com", "9999999999", "Computing", "Prof.", 6);

    Security cheddar = new Security("Cheddar", "cheddar@company.com", "8888888888", "Outside Security", "14:00 - 23:30",
        174);

    InformationTechnologies rosa = new InformationTechnologies("Rosa", "rosa@company.com", "7777777777", "Network",
        "11:00 - 20:00",
        "optimization");

    Employee[] loginUsers = {sherry, terry, cheddar, rosa};
    Employee.usersLoggedIn(loginUsers);

    terry.cafeteria();
    terry.setMpno("1234567890");
    System.out.println(terry.getName() + " has changed their mobile phone number to " + terry.getMpno());
    terry.giveLecture("10:30");
    rosa.work("15:20");
    rosa.installNetwork();
    cheddar.startPatrol();
  }
}