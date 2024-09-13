import Java.J1Tutorial.T1Home.Home;

public class Main {
   public static void main(String[] args) {
      Main coba = new Main();
      Home home = new Home();
      home.printMessage();
      coba.coba("Faqih");
   }

   public void coba(String nama) {
      System.out.println("nama saya " + nama);
   }
}
