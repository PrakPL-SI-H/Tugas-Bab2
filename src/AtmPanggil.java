package Praktikum2;

import java.util.Scanner;

public class AtmPanggil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 0;
        Atm bos = new Atm(10000000);
        System.out.println("======BANK MAHASISWA BRAWIJAYA======");
        System.out.println("Masukkan Pin    : ");
        bos.pin = in.nextInt();
        while (pilih != 4) {
            System.out.println("================MENU================");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Keluar");
            System.out.println("");
            System.out.print("Pilih Menu    : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1 :
            }
        }
    }
}
