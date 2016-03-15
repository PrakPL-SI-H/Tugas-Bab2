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

    }
}
