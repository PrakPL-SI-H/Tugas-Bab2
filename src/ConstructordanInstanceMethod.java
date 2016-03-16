
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
                    System.out.println("Saldo Anda saat ini: Rp " + nasabah.saldo);
                    break;
                case 2:
                    if (nasabah.saldo >= 50000) {
                        System.out.println("Penarikan dengan kelipatan 50000");
                        do {
                            System.out.print("Input nominal: ");
                            nasabah.out = in.nextInt();
                        } while (nasabah.cekKelipatan() == false);
                        System.out.print("Anda yakin? (y/n): ");
                        nasabah.confirm = in.next();
                        nasabah.konfirmasi();
                        break;
                    } else {
                        System.out.println("Saldo Anda tidak mencukupi untuk melakukan penarikan");
                        break;
                    }
                case 3:
                    if (nasabah.saldo > 0) {
                        System.out.println("Transfer ke rekening lain");
                        System.out.print("Input no. rek tujuan: ");
                        nasabah.rekLain = in.nextLong();
                        System.out.print("Input nominal: ");
                        nasabah.out = in.nextInt();
                        nasabah.dataTransfer();
                        System.out.print("Anda yakin? (y/n): ");
                        nasabah.confirm = in.next();
                        nasabah.konfirmasi();
                        break;
                    } else {
                        System.out.println("Saldo Anda tidak mencukupi untuk melakukan transfer");
                    }
                    break;
                default:
                    System.out.println("Wrong Input!");
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
