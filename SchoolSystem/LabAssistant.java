package SchoolSystem;

public class LabAssistant extends Assistant{
  LabAssistant(String name, String email, String mpno, String department, String title, String officeHours){
    super(name, email, mpno, department, title, officeHours);
  }

  @Override
  public void giveLecture(String hours){
    System.out.println("Lab assistant " + this.getName() + " started the lecture at " + hours);
  }

  public void labSession(String hours){
    System.out.println("Lab assistant " + this.getName() + " started the lab session at " + hours);
  }
}
