package SchoolSystem;

public class InformationTechnologies extends Officer {
  private String duty;

  InformationTechnologies(String name, String email, String mpno, String department, String workHours, String duty) {
    super(name, email, mpno, department, workHours);
    this.duty = duty;
  };

  public String getDuty() {
    return duty;
  }

  public void setDuty(String duty) {
    this.duty = duty;
  }

  @Override
  public void work(String hours){
    System.out.println(this.getName() + " started working at " + getDuty() + " at " + hours);
  }

  public void installNetwork(){
    System.out.println(this.getName() + " is installing the new network protocols.");
  }
}
