/*
 * @author Dogukan Unal
 * @date 24.09.2023
*/

package SalaryCalculator;

public class Employee {
  String name;
  double salary;
  double baseSalary;
  int workHours;
  int hireYear;
  int currentYear;
  int difference;

  Employee(String name, double salary, int workHours, int hireYear, int currentYear) {
    this.name = name;
    this.salary = salary;
    this.baseSalary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
    this.currentYear = currentYear;
    this.difference = currentYear - hireYear;
  }

  double raiseSalary() {
    if (this.difference < 10 && this.difference >= 0) {
      this.salary = this.salary * Math.pow(1.05, this.difference);
      return this.salary - this.baseSalary;
    } else if (this.difference >= 10 && this.difference < 20) {
      this.salary = this.salary * Math.pow(1.05, this.difference);
      this.salary = this.salary * Math.pow(1.10, (this.difference - 9));
      return this.salary - this.baseSalary;
    } else if (this.difference >= 20) {
      this.salary = this.salary * Math.pow(1.05, this.difference);
      this.salary = this.salary * Math.pow(1.10, (this.difference - 9));
      this.salary = this.salary * Math.pow(1.15, (this.difference - 19));
      return this.salary - this.baseSalary;
    } else {
      System.out.println("There is a problem with given inputs: hireYear, currentYear ; " + this.hireYear + ", " + this.currentYear);
      return 0;
    }
  }

  int bonus() {
    if (this.workHours > 40) {
      this.salary += 30 * (this.workHours - 40);
      return 30 * (this.workHours - 40);
    } else {
      return 0;
    }
  }

  double taxPrice() {
    double grossSalary = this.salary;
    if (this.salary > 1000) {
      this.salary *= 0.97;
      return grossSalary * 0.03;
    } else {
      return 0.0;
    }
  }

  double calculateSalary() {
    raiseSalary();
    bonus();
    taxPrice();
    return this.salary;
  }

  void print() {
    System.out.println("Name: " + this.name);
    System.out.println("Starting Year: " + this.hireYear);
    System.out.println("Current Year: " + this.currentYear);
    System.out.println("Base salary: " + baseSalary);
    System.out.printf("Salary raise: $%.2f%n", raiseSalary());
    System.out.println("Work Hours: " + this.workHours);
    System.out.println("Bonus: $" + bonus());
    System.out.printf("Tax Price: $%.2f%n", taxPrice());
    System.out.printf("Total Salary: $%.2f%n", this.salary);
  }
}