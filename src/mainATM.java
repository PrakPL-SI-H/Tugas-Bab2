package praktikum;
import java.util.Scanner;
public class mainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM atm1 = new ATM();
        int pilih; 
        int pilih2; 
        int pilihan;
        System.out.println("selamat datang di ATM BRI");
        System.out.print("Silahkan masukkan pin anda : ");
        int pin = in.nextInt();
        do {
            atm1.tampilanAwal();
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    atm1.cekSaldo();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Masukan nominal yang diinginkan   : ");
                    atm1.tarikTunai = in.nextInt();
                    atm1.tarikUang();
                    break;
                case 3:
                    
}
