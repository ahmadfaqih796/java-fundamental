package JavaTutorial.T3Variables;

public class Variables {

   public void printMessage() {
      // Variable
      int myNum;
      myNum = 15;
      System.out.println(myNum);

      // Print Variable
      String firstName = "John ";
      String lastName = "Doe";
      String fullName = firstName + lastName;
      System.out.println(fullName);

      // Declare Mulitiple Variables
      int x = 5, y = 6, z = 50;
      System.out.println(x + y + z);

      // Identifiers
      // int minutesPerHour = 60; // Good
      // int m = 60; // OK, but not so easy to understand what m actually is
   }

   public void iniString() {
      String name = "Faqih";
      System.out.println(name);
   }

   public void iniInteger() {
      int age = 20;
      System.out.println(age);
   }

}
