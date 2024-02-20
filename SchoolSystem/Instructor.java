package SchoolSystem;

public abstract class Instructor extends Employee {
  private String department;
  private String title;

  Instructor(String name, String email, String mpno, String department, String title){
    super(name, email, mpno);
    this.department = department;
    this.title = title;
  }

  public String getDepartment() {
    return department;
  }

  public String getTitle() {
    return title;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public abstract void giveLecture(String hours);
}
