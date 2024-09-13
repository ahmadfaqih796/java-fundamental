import JavaTutorial.T3Variables.Variables;

public class Main {
   public static void main(String[] args) {
      Main coba = new Main();
      Variables variables = new Variables();
      variables.iniInteger();
      coba.coba("Faqih");
   }

   public void coba(String nama) {
      System.out.println("nama saya " + nama);
   }
}
