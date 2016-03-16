package PraktikumSIH;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("    SELAMAT DATANG DI ATM    ");
        System.out.println("-----------------------------");
        System.out.println("Tahap I. Buat Account.");
        System.out.print("Masukan Nama      : ");
        String nama = in.nextLine();
        System.out.print("Masukan Password  : ");
        String password = in.nextLine();

        ATM r1 = new ATM(nama, password, 1000000.00);
        System.out.println("");
        System.out.println("Tahap II. Login.");
        System.out.print("Masukan Nama  : ");
        String n = in.nextLine();
        System.out.print("Password      : ");
        String p = in.nextLine();

        if (r1.getNama().equals(n)) {
            if (r1.getPassword().equals(p)) {
                System.out.println("Login Berhasil");
                System.out.println("-----------------------------");
                System.out.println("Apakah Anda ingin tarik tunai? 1==YA,2==TIDAK");
                int yatidak = in.nextInt();
                if (yatidak == 1) {
                    System.out.print("Jumlah uang yang ingin anda ambil : ");
                    int ambil = in.nextInt();
                    r1.ambil(ambil);
                } else {
                    System.out.println("----------MENU SELANJUTNYA----------");
                }

                System.out.println("Apakah Anda ingin menyimpan uang? 1==YA,2==TIDAK");
                int q = in.nextInt();
                if (q == 1) {
                    System.out.print("Jumlah uang yang ingin anda simpan : ");
                    int simpan = in.nextInt();
                    r1.simpan(simpan);
                } else {
                    System.out.println("----------MENU SELANJUTNYA----------");
                }

                System.out.println("Apakah Anda ingin transfer tunai? 1==YA, 2=TIDAK");
                int r = in.nextInt();
                if (r == 1) {
                    System.out.print("Jumlah uang yang ingin anda transfer : ");
                    int tf = in.nextInt();
                    r1.transfer(tf);
                } else {
                    System.out.println();
                }
            }
        }
        System.out.println("Terima Kasih Sudah Melakukan Transaksi");
    }
}