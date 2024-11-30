package Java.J1Tutorial.T6TypeCasting;

public class TypeCasting {

  public void printMessage() {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble); // Outputs 9.78
    System.out.println(myInt); // Outputs 9
  }
}
