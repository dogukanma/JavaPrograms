import java.util.Arrays;

public class L01 {
  public static void main(String[] args) {
    Student s1 = new Student("harley", 100);
    Student s2 = new Student("neil", 45);
    Student s3 = new Student("Frank", 23);
    Student s4 = new Student("Yelena", 95);
    StudentGrades sg = new StudentGrades(4);
    sg.addStudent(s2);
    sg.addStudent(s1);
    sg.addStudent(s3);
    sg.removeStudent(2);
    sg.addStudent(s4);

    System.out.println(Arrays.toString(sg.getStudents()));
  }
}

interface IStudent {
  double getGrade();

  String getName();
}

interface IStudentGrades {
  boolean addStudent(IStudent student);

  boolean removeStudent(int index);

  int getCurrentSize();

  IStudent[] getStudents();
}

class Student {
  private double grade;
  private String name;

  Student(String name, double grade) {
    this.setGrade(grade);
    this.setName(name);
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGrade() {
    return grade;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "{name: " + name + ", grade: " + grade + "}";
  }
}

class StudentGrades {
  private Student[] students;

  StudentGrades(int size) {
    this.students = new Student[size];
  }

  public boolean addStudent(Student student) {
    if (this.getCurrentSize() == students.length) {
      return false;
    }
    boolean flag = false;
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = student;
        flag = true;
        break;
      }
      if (student.getGrade() > students[i].getGrade() && !flag) {
        for (int j = students.length - 1; j > i; j--) {
          students[j] = students[j - 1];
        }
        students[i] = student;
        flag = true;
        break;
      }
    }
    return flag;
  }

  public boolean removeStudent(int index) {
    if (index < students.length && index >= 0) {
      for (int i = index; i < students.length - 1; i++) {
        students[index] = students[i + 1];
      }
      students[students.length - 1] = null;
      return true;
    } else {
      return false;
    }
  }

  public int getCurrentSize() {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        return i;
      }
    }
    return students.length;
  }

  public Student[] getStudents() {
    return students;
  }
}