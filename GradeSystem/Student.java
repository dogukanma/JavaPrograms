/*
 * @author Dogukan Unal
 * @date 23.09.2023
*/

package GradeSystem;

class Student {
  Course c1;
  Course c2;
  Course c3;
  String name;
  int studentNo;
  double average;
  boolean isPass;

  Student(String name, int studentNo, Course course1, Course course2, Course course3) {
    this.name = name;
    this.studentNo = studentNo;
    this.c1 = course1;
    this.c2 = course2;
    this.c3 = course3;
  }

  void addBulkExamNote(int note1, int note2, int note3) {
    if (note1 < 0 || note1 > 100) {
      this.c1.note = 0;
    } else {
      this.c1.note = note1;
    }
    if (note2 < 0 || note2 > 100) {
      this.c2.note = 0;
    } else {
      this.c2.note = note2;
    }
    if (note3 < 0 || note3 > 100) {
      this.c3.note = 0;
    } else {
      this.c3.note = note3;
    }
  }

  void calcAverage(int note1, int note2, int note3) {
    this.average = (note1 + note2 + note3) / 3;
  }

  void passOrFail(double average) {
    if (average < 50) {
      this.isPass = false;
    } else {
      this.isPass = true;
    }
  }

  void printInfo() {
    calcAverage(this.c1.note, this.c2.note, this.c3.note);
    passOrFail(this.average);
    System.out.println("========================================");
    System.out.println(this.c1.name + "\t\t: " + this.c1.note);
    System.out.println(this.c2.name + "\t\t: " + this.c2.note);
    System.out.println(this.c3.name + "\t: " + this.c3.note);
    System.out.println("Your average\t: " + this.average);
    if (this.isPass) {
      System.out.println("You have passed.");
    } else {
      System.out.println("You have failed.");
    }
    System.out.println("========================================");
    System.out.println("Teachers' Contact Informations");
    System.out.println(this.c1.name + "\t\t=> " + "Name: " + this.c1.teacher.name + " - Phone: " + this.c1.teacher.telNo);
    System.out.println(this.c2.name + "\t\t=> " + "Name: " + this.c2.teacher.name + " - Phone: " + this.c2.teacher.telNo);
    System.out.println(this.c3.name + "\t=> " + "Name: " + this.c3.teacher.name + " - Phone: " + this.c3.teacher.telNo);
  }
}
