package Praktikum2;

import java.util.Scanner;

public class LatihanBab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm mandiri = new Atm();
        int pilih;
        System.out.print("Masukkan password anda= ");
        int pass = in.nextInt();
        if (pass != mandiri.password()) {
            System.out.println("Maaf, password anda salah");
            System.out.println("kartu anda kami telan");
        } else {
            do {
                System.out.println("Menu");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Penarikan Uang");
                System.out.println("3. Transfer Ke Bank Lain");
                System.out.println("4. Exit");
                System.out.print("Masukkan menu= ");
                pilih = in.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("Menu cek Saldo");
                        mandiri.cekSaldo();
                        break;
                    case 2:
                        System.out.println("Menu Penarikan");
                        System.out.print("Masukkan nominal yang akan diambil= ");
                        mandiri.setTarik(in.nextInt());
                        break;
                    case 3:
                        System.out.println("Menu Transfer Ke Bank Lain");
                        System.out.print("Masukkan no. rekening yang dituju   = ");
                        mandiri.rekTransfer(in.next());
                        System.out.print("Masukkan nominal yang akan ditransfer = ");
                        mandiri.doTransfer(in.nextInt());
                        System.out.println("Transfer anda berhasil!");
                        break;
                }
            } while (pilih != 4);
        }
    }
}
