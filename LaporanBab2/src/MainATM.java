
import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
   Scanner input = new Scanner (System.in);
   
   int pil1,pil2,i=0;
   char pil;
   int pilihan,saldo;
   ATM nasabah []= new ATM [100];
   String nip;
   
   do {
       nasabah [i] = new ATM();
       System.out.println("==========Daftar Disini==========");
       System.out.print("Masukkan Nama\t\t: ");
       nasabah[i].setNama(in.nextLine());
       System.out.print("Masukkan Nomor Rekening \t: ");
       nasabah[i].setNorek(in.nextLine());
       System.out.print("Masukkan PIN\t\t: ");
       nasabah[i].setPin(in.nextLine());
       System.out.print("Masukkan Saldo Awal Anda: Rp ");
       nasabah[i].setSaldo(in.nextInt());
       i++;
       System.out.print("Apakah Anda ingin mendaftar lagi? (y/t)");
       pil = in.next().toUpperCase().charAt(0);
       in.nextLine();
       System.out.print("");
   }while (pil != 'T');
        System.out.println("");
        System.out.println("SELAMAT DATANG DI LAYANAN ATM BANK FORZA\n");
        System.out.println("CALL CENTER BANK FORZA : (021) 320111");
        System.out.println("DIMOHON TIDAK MENGHUBUNGI NOMOR LAIN SELAIN NOMOR DI ATAS");
        System.out.printf("%75s","LANJUTKAN ==> ENTER");
        input.nextLine();
        
        int x = 0;
        System.out.print("MASUKKAN PIN ANDA\t : ");
        nip = in.nextLine();
        for (x=0;x<1;x++){
            if (nip.equals(nasabah[x].pin)){
                nasabah[x].menuPertama();
                System.out.print("Masukkan Pilihan Anda : ");
                pil1 = in.nextInt();
               
            }
        }
   
   
   
}
}
