package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
      List<Teacher> teachers = new ArrayList<Teacher>();
      List<Student> students = new ArrayList<Student>();
      School GNHS = new School(teachers, students);

      Teacher pragyan = new Teacher(100, "Pragyan", 10000);
      Teacher banita = new Teacher(101, "Banita", 8000);
      Teacher nirakar = new Teacher(102, "Nirakara", 18000);

      teachers.add(pragyan);
      teachers.add(banita);
      teachers.add(nirakar);

      Student bayani = new Student(200, "Bayani", 9);
      Student shubhendu = new Student(201, "Shubhendu", 9);
      Student nihar = new Student(202, "Nihar", 9);

      students.add(bayani);
      students.add(shubhendu);
      students.add(nihar);

      bayani.payFees(200);
      shubhendu.payFees(100);
      nihar.payFees(400);

      System.out.println("Gopinath High school Earned in Rs. " + GNHS.getTotalMoneyEarned());
   }

}
