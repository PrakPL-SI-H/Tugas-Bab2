package Praktikum2;

import java.util.Scanner;

public class LatihanBab2 {

    public static void main(String[] args) {
        Atm mandiri = new Atm(1234, "Ayas", "11223344", 50000000);
        Atm bri = new Atm(4321, "iad", "44332211", 30000000);
        Scanner in = new Scanner(System.in);
        int pin, pilih;
        String rek, lanjut;
        String line = "=========================================================";
        do {
            System.out.println(line);
            System.out.println("Selamat datang di Mesin ATM Bersama");
            System.out.println(line);
            System.out.println("Masukkan PIN anda (4 digit)");
            pin = in.nextInt();
            if (pin != mandiri.getPin() && pin != bri.getPin()) {
                System.out.println(line);
                System.out.println("Pin yang anda masukkan salah");
                System.out.println("Transaksi tidak dapat dilanjutkan");
                System.out.println(line);
            } else {
                do {
                    System.out.println(line);
                    System.out.println("ATM Bersama");
                    System.out.println("Pecahan Uang Rp 50.000");
                    System.out.println(line);
                    System.out.println("1. Informasi Saldo");
                    System.out.println("2. Penarikan");
                    System.out.println("3. Transfer");
                    System.out.println("0. Keluar");
                    System.out.println(line);
                    System.out.print("Pilihan anda: ");
                    pilih = in.nextInt();
                    switch (pilih) {
                        case 1:
                            if (pin == mandiri.getPin()) {
                                mandiri.cekSaldo();
                            } else {
                                bri.cekSaldo();
                            }
                            break;
                        case 2:
                            System.out.println(line);
                            System.out.println("PENARIKAN TUNAI");
                            System.out.println("Pecahan Rp 50.000");
                            System.out.println(line);
                            System.out.print("Nominal: ");
                            if (pin == mandiri.getPin()) {
                                mandiri.penarikan(in.nextInt());
                            } else {
                                bri.penarikan(in.nextInt());
                            }
                            break;
                        case 3:
                            System.out.println(line);
                            System.out.println("TRANSFER");
                            System.out.println(line);
                            if (pin == mandiri.getPin()) {
                                System.out.print("Rekening tujuan: ");
                                rek = in.next();
                                if (rek.equals(bri.getRek())) {
                                    System.out.print("Nominal: ");
                                    mandiri.transferDetail(in.nextInt());
                                    mandiri.terimaTransfer(bri);
                                } else {
                                    System.out.println("Rekening tidak terdaftar");
                                }
                            } else {
                                System.out.print("Rekening tujuan: ");
                                rek = in.next();
                                if (rek.equals(mandiri.getRek())) {
                                    System.out.print("Nominal: ");
                                    bri.transferDetail(in.nextInt());
                                    bri.terimaTransfer(mandiri);
                                } else {
                                    System.out.println("Rekening tidak terdaftar");
                                }
                            }
                            break;
                    }
                    System.out.print("Apakah anda ingin melanjutkan transaksi?(Y/N)");
                    lanjut = in.next();
                } while (lanjut.equalsIgnoreCase("Y") && pilih != 0);
                System.out.println(line);
                System.out.println("Terima kasih telah menggunakan ATM Bersama");
                System.out.println(line);
            }
            System.out.print("Apakah anda ingin ganti kartu ATM yang lain?(Y/N)");
            lanjut = in.next();
        } while (lanjut.equalsIgnoreCase("Y"));
    }
}
