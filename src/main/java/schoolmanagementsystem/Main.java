package schoolmanagementsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
      List<Teacher> teachers = new ArrayList<Teacher>();
      List<Student> students = new ArrayList<Student>();
      School GNHS = new School(teachers, students);

      Teacher pragyan = new Teacher(100, "Pragyan parimita", 10000);
      Teacher banita = new Teacher(101, "Banita swain", 8000);
      Teacher nirakar = new Teacher(102, "Nirakara swain", 12000);

      teachers.add(pragyan);
      teachers.add(banita);
      teachers.add(nirakar);

      Student bayani = new Student(200, "Baruna Dalei", 9);
      Student shubhendu = new Student(201, "Shubhendu Sangam", 9);
      Student nihar = new Student(202, "Nihar ranjan", 9);

      students.add(bayani);
      students.add(shubhendu);
      students.add(nihar);

      bayani.payFees(20000);
      shubhendu.payFees(10000);
      nihar.payFees(30000);

      //New Student admitted
      Student mitu = new Student(103, "Nihar Ranhan Rout", 9);
      students.add(mitu);
      mitu.payFees(10000);

      System.out.println("Gopinath High school Earned in Rs. " + GNHS.getTotalMoneyEarned() + "\n");

      //New Teacher Joined
      Teacher kamala = new Teacher(203, "Kamala Lochan", 15000);
      teachers.add(kamala);

      System.out.println("-------------- Gopinath High School spent money -------------------------------------------------\n");

      pragyan.receiveSalary(pragyan.getSalary());
      System.out.println("salary paid to " + pragyan.getName() + " amount of Rs  " + pragyan.getSalary() + " in the date of " + LocalDateTime.now() +
            " and Total money remaining in school is Rs. " + GNHS.getTotalMoneyEarned());


      kamala.receiveSalary(kamala.getSalary());
      System.out.println("salary paid to " + kamala.getName() + " amount of Rs  " + kamala.getSalary() + " in the date of " + LocalDateTime.now()+
            " and Total money remaining in school is Rs. " + GNHS.getTotalMoneyEarned());
   }

}
