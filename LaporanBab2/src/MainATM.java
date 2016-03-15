
import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
   Scanner input = new Scanner (System.in);
   
   int pil1,pil2,i=0;
   char pil;
   int pilihan,saldo;
   ATM nasabah []= new ATM [100];
   
   do {
       nasabah [i] = new ATM();
       System.out.println("==========Daftar Disini==========");
       System.out.println("Masukkan Nama\t\t: ");
       nasabah[i].setNama(in.nextLine());
       System.out.println("Masukkan Nomor Rekening \t: ");
       nasabah[i].setNorek(in.nextLine());
       System.out.println("Masukkan PIN\t\t: ");
       nasabah[i].setPin(in.nextLine());
       System.out.println("Masukkan Saldo Awal Anda: Rp ");
       nasabah[i].setSaldo(in.nextInt());
       i++;
       System.out.println("Apakah Anda ingin mendaftar lagi? (y/t)");
       pil = in.next().toUpperCase().charAt(0);
       in.nextLine();
       System.out.println("");
   }while (pil != 'T');
   
   
}
}
