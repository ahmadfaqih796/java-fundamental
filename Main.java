import Java.J2Classes.C1Class.Classes;

public class Main {
   public static void main(String[] args) {
      Main coba = new Main();
      coba.coba("Faqih 1");

      CobaEntity vvv = new CobaEntity(1L, "Faqih", 20);
      System.out.println(vvv.getAge());

      Classes cccc = new Classes();
      cccc.printMessage();
      System.out.println("xxxxxxxxxxx");
   }

   public void coba(String nama) {
      System.out.println("nama saya " + nama);
   }

   public void xxx() {
      String nama = "Faqih";
      System.out.println(nama);
      return;
   }
}
