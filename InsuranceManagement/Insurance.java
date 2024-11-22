import java.util.Date;

abstract class Insurance {
  private String name;
  private double price;
  private Date start_date;
  private Date end_date;

  abstract void calculate();
}
