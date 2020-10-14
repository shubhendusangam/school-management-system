package schoolmanagementsystem;

public class Student {

   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

   /**
    *
    * @param id
    * @param name
    * @param grade
    * Fees paid initially is Zero
    * Total fees need to pay 30000
    */
   public Student(int id, String name, int grade){
      this.id = id;
      this.name = name;
      this.grade = grade;
      this.feesPaid = 0;
      this.feesTotal = 30000;
   }

   // Not going to alter Student ID and Name

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getGrade() {
      return grade;
   }

   public int getFeesTotal() {
      return feesTotal;
   }

   //Updating the Students Grade
   public void setGrade(int grade) {
      this.grade = grade;
   }


   //Updating the Fees paid
   public void updateFeesPaid(int fees) {
      this.feesPaid = this.getFeesPaid() + fees;
   }

   public int getFeesPaid() {
      return feesPaid;
   }
}
