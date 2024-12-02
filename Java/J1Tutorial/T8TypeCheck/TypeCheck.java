package Java.J1Tutorial.T8TypeCheck;

public class TypeCheck {

  public void printMessage() {
    Integer myNum = 5;
    String stringNum = myNum.toString(); // Konversi Integer ke String

    // Mengecek apakah stringNum adalah String
    if (stringNum instanceof String) {
      System.out.println("stringNum adalah String! Value: " + stringNum);
    } else {
      System.out.println("stringNum bukan String.");
    }

    // cara lain
    if (stringNum.getClass() == String.class) {
      System.out.println("stringNum adalah String! Value: " + stringNum);
    } else {
      System.out.println("stringNum bukan String.");
    }

    // pakai try-catch
    try {
      String test = (String) stringNum;
      System.out.println("stringNum adalah String! Value: " + test);
    } catch (ClassCastException e) {
      System.out.println("stringNum bukan String.");
    }

    // pakai valueOf
    String check = String.valueOf(stringNum);
    if (check.equals(stringNum)) {
      System.out.println("stringNum bukan String! Value: " + stringNum);
    }
  }
}
