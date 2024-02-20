package SchoolSystem;

public class Professor extends Instructor{
  private int roomNo;

  Professor(String name, String email, String mpno, String department, String title, int roomNo){
    super(name, email, mpno, department, title);
    this.roomNo = roomNo;
  };

  public int getRoomNo(){
    return this.roomNo;
  }

  public void setRoomNo(int roomNo){
    this.roomNo = roomNo;
  }

  @Override
  public void giveLecture(String hours){
    System.out.println(this.getName() + " started giving lecture in " + getDepartment() + " department at " + hours);
  }

  public void meeting(){
    System.out.println(this.getName() + " attended the meeting.");
  }

  public void startExam(){
    System.out.println(this.getName() + " started the exam.");
  }
}
