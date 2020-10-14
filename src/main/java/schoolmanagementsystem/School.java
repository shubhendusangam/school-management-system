package schoolmanagementsystem;

import java.util.List;

public class School {
   private List<Teacher> teachers;
   private List<Student> students;
   private int totalMoneyEarned;
   private int totalMoneySpend;

   public School(List<Teacher> teachers, List<Student> students) {
      this.teachers = teachers;
      this.students = students;
   }

   public List<Teacher> getTeachers() {
      return teachers;
   }

   public void addTeacher(Teacher teacher) {
      this.teachers.add(teacher);
   }

   public List<Student> getStudents() {
      return students;
   }

   public void addStudents(Student student) {
      this.students.add(student);
   }

   public int getTotalMoneyEarned() {
      return totalMoneyEarned;
   }

   public void updateTotalMoneyEarned(int totalMoneyEarned) {
      this.totalMoneyEarned += totalMoneyEarned;
   }

   public int getTotalMoneySpend() {
      return totalMoneySpend;
   }

   public void updateTotalMoneySpend(int totalMoneySpend) {
      this.totalMoneySpend -= totalMoneySpend;
   }
}
