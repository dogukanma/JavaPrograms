package SchoolSystem;

public class Security extends Officer{
  private int documentNo;

  Security(String name, String email, String mpno, String department, String workHours, int documentNo){
    super(name, email, mpno, department, workHours);
    this.documentNo = documentNo;
  }

  public int getDocumentNo() {
    return documentNo;
  }

  public void setDocumentNo(int documentNo) {
    this.documentNo = documentNo;
  }

  @Override
  public void work(String hours){
    System.out.println("Security officer " + this.getName() + " started working at the station at " + hours);
  }

  public void startPatrol(){
    System.out.println(this.getName() + " started patrolling work instructed in document number " + documentNo);
  }
}
