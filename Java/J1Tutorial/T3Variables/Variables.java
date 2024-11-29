package Java.J1Tutorial.T3Variables;

public class Variables {

  public void printMessage() {
    // ini Variable
    Integer myNum;
    myNum = 15;
    System.out.println(myNum);

    // cetak Variable
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    // Deklarasi Multi Variable
    Integer x = 5, y = 6, z = 50;
    System.out.println(x + y + z);
    // Penulisan Identifiers yang Bagus
    // Integer minutesPerHour = 60; // Good
    // Integer m = 60; // OK, tetapi tidak disarankan karena kemungkinan bahwa m memiliki arti yang salah
  }

  public void iniString() {
    String name = "Faqih";
    System.out.println(name);
  }

  public void iniInteger() {
    Integer age = 20;
    System.out.println(age);
  }
}
