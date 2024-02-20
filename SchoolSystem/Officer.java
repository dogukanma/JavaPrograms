package SchoolSystem;

public class Officer extends Employee {
  private String department;
  private String workHours;

  Officer(String name, String email, String mpno, String department, String workHours) {
    super(name, email, mpno);
    this.department = department;
    this.workHours = workHours;
  }

  public void work() {
    System.out.println(this.getName() + " started working in " + department + ". Work hours is " + workHours);
  }
}
