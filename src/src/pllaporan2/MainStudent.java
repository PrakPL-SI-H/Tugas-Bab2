package pllaporan2;
import java.util.Scanner;
public class MainStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Student murid = new Student ();
        
        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = input.nextInt();
        int jarak[] = new int[jumlah];
        for (int i = 0 ; i < jarak.length ; i++){
            System.out.println("========== Siswa ke-" + (i+1)+"==========");
            System.out.print("Masukkan nama     = ");
            String nama = input.next();
            murid.setName(nama);
            System.out.print("Masukkan alamat   = ");
            String alamat = input.next();
            murid.setAddress(alamat);
            System.out.print("Masukkan umur     = ");
            int umur = input.nextInt();
            murid.setAge(umur);
            System.out.print("Masukkan nilai Matematika = ");
            int MM = input.nextInt();
            murid.setMath(MM);
            System.out.print("Masukkan nilai Science    = ");
            int science = input.nextInt();
            murid.setScience(science);
            System.out.print("Masukkan nilai B.Inggris  = ");
            int bing = input.nextInt();
            murid.setEnglish(bing);
            System.out.println("======================OUTPUT======================");
            murid.displayMessage();
            System.out.println("Banyaknya objek yang dibuat : "+ Student.hitung);
            System.out.println("");
        }   
    }
}
//Student anna = new Student(99, 80, 97);
//anna.setName("Anna");
//anna.setAddress("Malang");
//anna.setAge(20);
// anna.setMath(100);
// anna.setScience(89);
// anna.setEnglish(80);
//anna.displayMessage();
//menggunakan constructor lain    
//System.out.println("===================");
//Student chris = new Student(60, 99, 87);
//chris.setName("Anna");
//chris.setAddress("Malang");
//chris.setAge(21);
//chris.setMath(70);
//chris.setScience(60);
//chris.setEnglish(90);
//chris.displayMessage();
//siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor    
//System.out.println("===================");
//anna = new Student("anna", "Batu", 18);
//anna.displayMessage();
//siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method   
//System.out.println("===================");
//chris.setAddress("Surabaya");
//chris.setAge(22);
//chris.displayMessage();
//}
//}
