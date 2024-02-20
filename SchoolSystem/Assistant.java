package SchoolSystem;

public abstract class Assistant extends Instructor{
  private String officeHours;

  Assistant(String name, String email, String mpno, String department, String title, String officeHours){
    super(name, email, mpno, department, title);
    this.officeHours = officeHours;
  }

  public String getOfficeHours(){
    return this.officeHours;
  }

  public void setOfficeHours(String officeHours){
    this.officeHours = officeHours;
  }

  public void startQuiz(){
    System.out.println(this.getName() + " started the quiz.");
  }
}