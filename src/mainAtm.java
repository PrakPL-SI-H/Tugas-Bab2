package javaapplication10;

import java.util.Scanner;

class mainAtm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih;
        int pilihbank;
        int nomerr = 0;
        int duit = 0;
        String jenengb = "";
        String back;

        System.out.println("== Selamat datang di ATM FRDHS ==");
        System.out.println("== ATM ini menggunakan uang pecahan Rp. 50.000,- ==");

        Atm Modul2 = new Atm();

        Modul2.cekPassword();

        int i = 0;
        do {
            System.out.println("=== Pilihan Menu ===");
            System.out.println("1. Penarikan ");
            System.out.println("2. Informasi saldo");
            System.out.println("3. Transfer");
            System.out.println("4. Keluar");

            System.out.print("Masukan pilihan anda       : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                Modul2.penarikan();
            } else if (pilih == 2) {
                Modul2.infoSaldo();
            } else if (pilih == 3) {
                System.out.println("=== Pilih Bank ===");
                System.out.println("1. Bank yang sama");
                System.out.println("2. Bank yang berbeda");
                System.out.print("Masukan pilihan anda      : ");
                pilihbank = input.nextInt();
                if (pilihbank == 1) {
                    Modul2.transfer(nomerr, duit);
                }
                if (pilihbank == 2) {
                    Modul2.transfer(nomerr, duit, jenengb);
                } else {
                    System.out.println("Maaf inputan salah");
                }
            } else if (pilih == 4) {
                System.out.println("====Terimakasih atas kunjungan anda====");
                break;
            } else {
                System.out.println("Maaf menu tidak tersedia");
            }
            System.out.print("Apakah anda ingin bertransaksi lagi [y/t] : ");
            back = input.next();
            i++;
        } while (back.equals("y") || back.equals("Y"));
        System.out.println("====Terimakasih atas kunjungan anda====");
    }
}
