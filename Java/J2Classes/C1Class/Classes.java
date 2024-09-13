package Java.J2Classes.C1Class;

// Create a Main class
public class Classes {

   // ini attribute
   /*
    * istilah "variabel" xdalam contoh (seperti yang ditunjukkan di bawah). Istilah
    * ini sebenarnya adalah atribut dari kelas. Atau bisa juga dikatakan bahwa
    * atribut kelas adalah variabel dalam kelas
    */
   int x = 10; // Create a class attribute
   String y = "Faqih";
   boolean z;

   // Create a class constructor for the Main class
   // membuat class constructor untuk kelas utama
   public Classes() {
      // memanggil atribut kelas di dalam constructor
      z = true; // Set the initial value for the class attribute x

   }

   // ini method
   /*
    * method Java bahwa method dideklarasikan di dalam suatu kelas, dan digunakan
    * untuk melakukan tindakan tertentu
    */
   public void printMessage() {
      System.out.println(x);
      System.out.println(y);
   }
}
