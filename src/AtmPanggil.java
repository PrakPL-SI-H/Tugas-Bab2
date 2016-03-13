package Praktikum2;

import java.util.Scanner;

public class AtmPanggil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 0;
        Atm bos = new Atm(10000000);
        System.out.println("======BANK MAHASISWA BRAWIJAYA======");
        System.out.print("Masukkan Pin    : ");
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
                case 1:
                    System.out.println("Saldo anda saat ini Rp." + bos.saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("==Tarik Tunai==");
                    System.out.print("Masukkan jumlah uang : ");
                    bos.tarik = in.nextInt();
                    if (bos.tarik <= bos.saldo) {
                        bos.setTarik();
                        System.out.println("Sisa saldo anda Rp." + bos.saldo);
                    } else {
                        bos.setTarik();
                        System.out.println("Maaf");
                        System.out.println("Sisa Saldo anda kurang dari Rp." + bos.tarik);
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("==Transfer==");
                    System.out.print("Transfer ke Rekening      : ");
                    bos.rekening = in.nextInt();
                    System.out.print("Jumlah yang di Transfer   : ");
                    bos.transfer = in.nextInt();
                    if (bos.transfer <= bos.saldo) {
                        bos.setTransfer();
                        System.out.println("Sisa saldo anda Rp." + bos.saldo);
                    } else {
                        bos.setTransfer();
                        System.out.println("Maaf");
                        System.out.println("Sisa Saldo anda kurang dari Rp." + bos.transfer);
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia...");
                    System.out.println("");
            }
        }
    }
}
