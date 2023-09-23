/*
 * @author Dogukan Unal
 * @date 23.09.2023
*/

package GradeSystem;

class Course {
  Teacher teacher;
  String name;
  String code;
  String prefix;
  int note;

  Course(Teacher teacher, String name, String code, String prefix){
    this.teacher = teacher;
    this.name = name;
    this.code = code;
    this.prefix = prefix;
  }

  void addTeacher(Teacher teacher){
    if(teacher.branch == this.name){
      this.teacher = teacher;
    }
  }
}
