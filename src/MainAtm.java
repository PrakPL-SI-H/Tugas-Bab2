
package ATM;

import java.util.Scanner;

public class MainAtm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==Selamat datang di Bank KALAN==\n");
        System.out.println("Form Pendaftaran ATM : ");
        System.out.print("Masukkan Nama      : ");
        String nama = input.nextLine();
        System.out.print("Masukkan No Rek    : ");
        String rek = input.nextLine();
        System.out.print("Masukkan Password  : ");
        String pass = input.nextLine();
        System.out.print("Masukkan Saldo Rek : ");
        double saldo = input.nextDouble();
        System.out.println("");

        Atm atm1 = new Atm(nama, rek, pass, saldo);

        int a = 0, b = 0;
        int cek = 0;

        System.out.println(" ATM Bank KALAN ");
        while (a == 0) {
            System.out.print("Masukkan Password anda : ");
            String pass2 = input.next();
            atm1.cekpassword(pass2, true);
            if (atm1.cekpassword(pass2, true)==true) {
                a = 1;
                while (b == 0) {
                    System.out.println("");
                    System.out.println("Menu :");
                    System.out.println("1. Cek Saldo");
                    System.out.println("2. Penarikan");
                    System.out.println("3. Transfer");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan anda : ");
                    int menu = input.nextInt();
                    if (menu == 1) {
                        atm1.cekSaldo();
                    }
                    else if (menu == 2) {
                        System.out.println("=> Penarikan");
                        System.out.print("Jumlah pengambilan : Rp.");
                        double ambil = input.nextDouble();
                        atm1.tarikUang(ambil);
                    }
                    else if (menu == 3) {
                        System.out.println("=> Transfer");
                        System.out.print("No tujuan : ");
                        String norekTuju = input.next();
                        System.out.print("Jumlah yang ingin ditransfer : Rp.");
                        Double transf = input.nextDouble();
                        atm1.transfer(norekTuju, transf);
                    } else if (menu==4) {
                        System.out.println("Terima kasih telah bertransaksi bersama kami ... ");
                        System.out.println("... Salam Bank INI ...");
                        b = 1;
                    }
                    else{
                        System.out.println("Menu tidak tersedia!");
                    }
                }

            } else {
                cek++;
                if (cek < 3) {
                    System.out.println("Password yang anda masukkan salah! Masukkan kembali !");
                    System.out.println("Ingat batas memasukkan password hanya 3 kali");
                    System.out.println("Kesempatan memasukkan password kurang " + (3 - cek)+" kali");
                } else if (cek == 3) {
                    b = 1;
                    System.out.println("ATM anda terblokir!");
                    System.out.println("Silahkan hubungi Customer Service terdekat!");
                    break;
                }
            }

        }

    }
}
