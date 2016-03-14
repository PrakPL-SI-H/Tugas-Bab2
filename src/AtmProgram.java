package pl_praktikum_lap2;

import java.util.Scanner;

public class AtmProgram {

    int pil;

    public static void main(String[] args) {

        AtmProgram program = new AtmProgram();
        program.initSaldo(5000000);
        program.login();
    }

    public void initSaldo(double saldo) {
        atm.setSaldo(saldo);
    }
    Scanner s = new Scanner(System.in);

    AtmClass atm = new AtmClass();
    double minSaldo = 50000;

    public void menu() {
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\tSelamat Datang di ATM Bank Ambang          |");
        System.out.println();
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\t       > Pilih Transaksi <                    |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[1] Cek Saldo          [2] Transfer           |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[3] Penarikan          [4] Keluar             |");
        System.out.println();
        System.out.print("|");

        System.out.println("=======================================================");
        System.out.print("\t         Masukan pilihan Anda : ");
        pil = s.nextInt();
        switch (pil) {
            case 1:
                lihatSaldo();
                break;
            case 2:
                transfer();
                break;
            case 3:
                tarik();
                break;

            case 4:
                System.out.println("=======================================================");
                System.out.println("\tTerimakasih telah menggunakan layanan kami.");
                System.out.println("\t      Silahkan Ambil kartu Anda.");
                break;
            default:
                System.out.println("Pilihan Yang Anda masukan salah. Silahkan Login kembali.");
                login();
                break;
        }
    }
