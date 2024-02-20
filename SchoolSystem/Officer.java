package SchoolSystem;

public abstract class Officer extends Employee {
  private String department;
  private String workHours;

  Officer(String name, String email, String mpno, String department, String workHours) {
    super(name, email, mpno);
    this.department = department;
    this.workHours = workHours;
  }

  public String getDepartment() {
    return department;
  }

  public String getWorkHours() {
    return workHours;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setWorkHours(String workHours) {
    this.workHours = workHours;
  }

  public abstract void work(String time);
}