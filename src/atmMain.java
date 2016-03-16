
import java.util.Scanner;

public class atmMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        atm trans = new atm (5500000);
        int pass = 170797;
        int pilihan;
        System.out.println(">>>>>=======WELCOME TO ATM=======<<<<<");
        System.out.print("Masukkan pin anda : ");
        int pin = in.nextInt();
        if (pin == pass) {
            System.out.println("MENU");
            System.out.println("1. Cek Saldo ");
            System.out.println("2. Penarikan Saldo ");
            System.out.println("3. Transfer ");
            System.out.println("4. Keluar ");
            System.out.println("-----------------------------");

            do {
                System.out.print("Masukkan pilihan anda : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1:
                        trans.ceksaldo();
                        break;
                    case 2:
                        trans.penarikan();
                        break;
                    case 3:
                        trans.transfer();
                        break;
                    case 4:
                        System.exit(0);
                }
            } while (pilihan != 4);
        } else {
            System.err.println("Maaf pin yg anda masukkan salah!");
        }
        System.out.println("-----------------------------");
    }
}
