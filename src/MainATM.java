package pratikum2;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int menu, pin, trk, pinn2, trans;
        System.out.println("Masukkan pin anda: ");
        pin = in.nextInt();
        ATM x1 = new ATM(11000000);
        do{
            System.out.println(====Menu ATM====);
            System.out.println(1. Cek Saldo);
            System.out.println(2. Tarik Tunai);
            System.out.println(3. Tranfer);
            System.out.println(0. Keluar)
        }
    }
    
}
