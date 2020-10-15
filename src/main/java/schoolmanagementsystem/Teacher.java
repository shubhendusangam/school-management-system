package schoolmanagementsystem;

public class Teacher {

   private int id;
   private String name;
   private int salary;
   private int salaryEarned;

   /**
    *
    * @param id
    * @param name
    * @param salary
    */
   public Teacher(int id, String name, int salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
      this.salaryEarned = 0;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public void receiveSalary(int salary) {
      this.salaryEarned += salary;
      School.updateTotalMoneySpend(salary);
   }

   @Override
   public String toString() {
      return "Teacher " +
            "id is" + id +
            " name is " + name +
            " salary Earned so far " + salaryEarned;
   }
}
