/*
 * @author Dogukan Unal
 * @date 23.09.2023
*/

package GradeSystem;

public class Main {
  public static void main(String[] args){
    Teacher t1 = new Teacher("Jacob", "English", "5055055050");
    Teacher t2 = new Teacher("Angela", "Physics", "3033033030");
    Teacher t3 = new Teacher("Mike", "Blockchain", "4044044040");
    // Teacher t4 = new Teacher("Rachel", "Physics", "2022022020");

    Course english = new Course(t1, "English", "101", "ENG");
    english.addTeacher(t1);
    Course physics = new Course(t1, "Physics", "101", "PHY");
    physics.addTeacher(t2);
    Course blockchain = new Course(t1, "Blockchain", "101", "BCH");
    blockchain.addTeacher(t3);

    Student s1 = new Student("Angela", 555, english, physics, blockchain);
    Student s2 = new Student("Christina", 444, english, physics, blockchain);
    Student s3 = new Student("Michael", 333, english, physics, blockchain);

    s1.addBulkExamNote(50, 60, 35);
    s1.printInfo();
    s2.addBulkExamNote(80, 60, 100);
    s2.printInfo();
    s3.addBulkExamNote(75, 90, 20);
    s3.printInfo();
  }
}
