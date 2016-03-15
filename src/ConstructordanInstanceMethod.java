
import java.util.Scanner;

public class ConstructordanInstanceMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ATM nasabah = new ATM();

        System.out.println("<<Silahkan Masukkan Kartu ATM Anda>>");
        do {
            System.out.print("Input Password ATM: ");
            nasabah.passInput = in.nextInt();
        } while (nasabah.cekPass() == false);

        do {
            nasabah.showMenu();
            System.out.print("Input pilihan menu: ");
            int menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Saldo Anda saat ini: Rp " + nasabah.cekSaldo());
                    break;
                case 2:
                    System.out.print("Input nominal: ");
                    nasabah.out = in.nextInt();
                    nasabah.uangKeluar();
                    break;
                case 3:
                    System.out.print("Input rekening tujuan: ");
                    nasabah.rekLain = in.nextLong();
                    System.out.print("Input nominal: ");
                    nasabah.out = in.nextInt();
                    nasabah.uangKeluar();
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
            do {
                System.out.print("Apakah Anda ingin melakukan transaksi lain? (y/n): ");
                nasabah.again = in.next();
            } while (!"y".equals(nasabah.again) && !"n".equals(nasabah.again));
        } while ("y".equals(nasabah.again));
        System.out.println("<<Silahkan ambil kartu ATM Anda. Terima kasih...>>");
    }
}
