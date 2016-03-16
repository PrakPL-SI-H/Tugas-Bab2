/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irwin deriyan
 */
import java.util.Scanner;

class atm {

    private double saldo, sisaSaldo, tarik, transfer;
    public String noRek, kartuATM;
    public int pilihan, PIN;
    Scanner input = new Scanner(System.in);

    atm() {
    }

    atm(int pin, double saldo) {
        PIN = pin;
        this.saldo = saldo;
    }

    public void menu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("****************** SELAMAT DATANG ******************");
        System.err.println("                     ATM BERSAMA                    ");
        System.out.println("Silahkan Masukkan Kartu ATM Anda :)) _         ");
        password();
    }

    public void password() {
        System.out.print("Masukkan Nomor PIN Anda : ");
        PIN = input.nextInt();
        if (PIN == 12345 || PIN == 54321) {
            menuOpsi();
        } else {
            System.err.println("Maaf.");
            System.err.println("PIN yang Anda masukkan salah.");
            System.err.println("Silahkan coba lagi.");
            System.err.println("=====================================================");
            System.err.println("");
            password();
        }
    }

    public void menuOpsi() {
        System.out.println("=====================================================");
        System.out.println("1. Informasi Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Transfer");
        System.out.println("0. KELUAR");
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("");
            System.out.println("=====================================================");
            pil1();
        } else if (pilihan == 2) {
            System.out.println("");
            System.out.println("=====================================================");
            pil2();
        } else if (pilihan == 3) {
            System.out.println("");
            System.out.println("=====================================================");
            pil3();
        } else if (pilihan == 0) {
            System.out.println("");
            System.out.println("=====================================================");
            menuKeluar();
        } else {
            System.err.println("Anda Tersesat dan Salah Jalan.");
            System.err.println("ulangi pilihan anda kembali!");
            menuOpsi();
        }
    }

    public void pil1() {
        System.out.println("Saldo Anda : Rp." + saldo);
        menuOpsi();
        System.out.println("=====================================================");
        System.out.println("");
    }

    public void pil2() {
        System.out.print("Masukkan Jumlah Penarikan Rp.");
        tarik = input.nextDouble();
        if (tarik > saldo) {
            System.err.println("Maaf Saldo Anda Tidak Mencukupi.");
            System.err.println("=====================================================");
            pil2();
        } else {
            sisaSaldo = saldo - tarik;
            saldo = sisaSaldo;
            System.out.println("Sisa saldo Anda saat ini Rp." + saldo);
        }
        System.out.println("");
        menuOpsi();
    }

    public void pil3() {
        System.out.print("Masukkan Nomer Rekening tujuan : ");
        noRek = input.next();
        System.out.print("Masukkan Nominal yang akan ditransfer : Rp.");
        transfer = input.nextDouble();
        if (saldo >= transfer) {
            System.out.println("*****************************************************");
            System.out.println("Anda telah melakukan transfer sejumlah uang Rp." + transfer);
            System.out.println("pada Nomor Rekening " + noRek);
            sisaSaldo = saldo - transfer;
            saldo = sisaSaldo;
            System.out.println("Sisa saldo Anda saat ini Rp." + saldo);
            menuOpsi();
        } else {
            System.err.println("Transaksi Anda TIDAK Berhasil :D");
            System.out.println("=====================================================");
            System.out.println("");
            pil3();
        }
    }

    public void menuKeluar() {
        System.out.println("Terima Kasih");
        System.err.println("Silahkan ambil Kartu ATM Anda");
    }
}

class LatihanBab1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kartu ATM yang telah terdaftar :");
        System.out.println("1. Pandu Damar Priambodo");
        System.out.println("2. Wisnu Damar Priambodo");
        System.out.print("Silahkan Masukkan No. Kartu ATM Anda : ");
        int kartuAtm = input.nextInt();

        if (kartuAtm == 1) {
            atm wisnu = new atm();
            wisnu = new atm(12345, 7100000);
            wisnu.menu();
        } else if (kartuAtm == 2) {
            atm pandu = new atm();
            pandu = new atm(54321, 5810000);
            pandu.menu();
        } else {
            System.err.println("Maaf, Kartu ATM Anda belum terdaftar!");
            System.err.println("Silahkan ambil kembali KARTU ATM Anda!");
        }
    }
}
