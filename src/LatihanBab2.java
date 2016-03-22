
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */
class atmData {

    String nama;
    int norek, pin, saldo;

    public atmData(String x, int a, int b, int c) {
        nama = x;
        norek = a;
        pin = b;
        saldo = c;
    }

    public void showSaldo() {

        System.out.println("Maka Saldo Anda Berjumlah = " + saldo);
    }

    public int Transfer(int a) {
        return saldo -= a;
    }

    public int tarikTunai(int x) {
        return saldo -= x;
    }

}

class LatihanBab1 {

    public static void main(String[] args) {

        int pil;
        Scanner in = new Scanner(System.in);
        atmData org1 = new atmData("Pandu Damar Priambodo", 15515040, 1234, 2000000);
        atmData org2 = new atmData("Gunardi Dwi Suseno", 15525030, 4321, 5000000);
        int pin;
        String loop;
        System.err.println("====SELAMAT DATANG DI ATM BERSAMA====");
        System.out.println("");
        System.out.print("Masukkan Pin Anda : ");
        pin = in.nextInt();
        if (pin == org1.pin) {
            System.out.println("====================================");
            System.err.println("=========IDENTITAS NASABAH==========");
            System.out.println("====================================");
            System.out.println("Anda Masuk Sebagai :");
            System.out.println("");
            System.out.println("Nama : " + org1.nama);
            System.out.println("====================================");
            System.out.println("No Rekening : " + org1.norek);
            System.out.println("====================================");
        } else if (pin == org2.pin) {
            System.out.println("Anda Masuk Sebagai :");
            System.out.println("");
            System.out.println("====================================");
            System.out.println("Nama : " + org2.nama);
            System.out.println("====================================");
            System.out.println("No Rekening : " + org2.norek);
            System.out.println("====================================");
        }
        tampilanMenu();
        do {

            System.out.print("Masukkan Pilihan Anda : ");
            pil = in.nextInt();

            switch (pil) {
                case 1:
                    if (pin == org1.pin) {
                        org1.showSaldo();
                    } else if (pin == org2.pin) {
                        org2.showSaldo();
                    }
                    break;
                case 2:
                    if (pin == org1.pin) {
                        System.out.println("Masukkan Nomor Rekening Tujuan Anda : ");
                        int tuju = in.nextInt();
                        if (tuju == org2.norek) {

                            System.out.print("Masukkan banyak nominal : ");
                            int nom = in.nextInt();
                            org1.Transfer(nom);
                            System.out.println("====================================");
                            System.out.println("Anda Melakukan Transfer Ke : ");
                            System.out.println("Nama : " + org2.nama);
                            System.out.println("Nomor Rekening Tujuan : " + org2.norek);
                            System.out.println("Nominal : " + nom);
                            System.out.println("Tunggu Beberapa Saat........");
                            System.out.println("Selamat Transaksi Anda Berhasil");
                            System.out.println("Dengan Sisa Saldo Anda : " + org1.saldo);
                        }

                    } else if (pin == org2.pin) {
                        System.out.println("Masukkan Nomor Rekening Tujuan Anda : ");
                        int tuju = in.nextInt();
                        if (tuju == org1.norek) {
                            System.out.print("Masukkan banyak nominal : ");
                            int nom = in.nextInt();
                            org2.Transfer(nom);
                            System.out.println("====================================");
                            System.out.println("Anda Melakukan Transfer Ke : ");
                            System.out.println("Nama : " + org1.nama);
                            System.out.println("Nomor Rekening Tujuan : " + org1.norek);
                            System.out.println("Nominal : " + nom);
                            System.out.println("Tunggu Beberapa Saat........");
                            System.out.println("Selamat Transaksi Anda Berhasil");
                            System.out.println("Dengan Sisa Saldo Anda : " + org2.saldo);
                        }

                    }
                    break;
                case 3:
                    if (pin == org1.pin) {
                        System.out.print("Masukkan jumlah nominal : ");
                        int nom = in.nextInt();
                        org1.tarikTunai(nom);
                        org1.showSaldo();
                    } else if (pin == org2.pin) {
                        System.out.print("Masukkan jumlah nominal : ");
                        int nom = in.nextInt();
                        org2.tarikTunai(nom);
                        org2.showSaldo();
                    }
                    break;
            }
            System.out.print("Apakah ada transaksi lain? (Y/N) ");
            loop = in.next();
        } while ("Y".equals(loop));
        System.out.println("Terima Kasih");
        System.err.println("Silahkan Ambil Kartu ATM Anda");
    }

    public static void tampilanMenu() {
        System.out.println("======MENU PILIHAN======");
        System.out.println("1.Cek Saldo");
        System.out.println("2.Transfer");
        System.out.println("3.Tarik Tunai");
        System.out.println("4.Keluar");

    }

}
