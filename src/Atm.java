package Mod1Bab2;
import java.util.Scanner;
public class Atm {
    Scanner in = new Scanner(System.in);
    private String nama;
    private int pin, kode, saldo, norekening, rekeningtujuan, jumlahtransfer;
    public Atm(String n, int p, int s) {
        nama = n;
        pin = p;
        saldo = s;
    }
    public void login(int p) {
        System.out.println("------SELAMAT DATANG DI ATM SEDERHANA------");
        if (pin == p) 
            showMenu();
        else {
            System.out.println("PIN yang anda masukkan salah");
            keluar();
        }
    }
    public void showMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Transfer");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = in.nextInt();
        pilihan(pilih);
    }
    public void pilihan(int pilih) {
        kode = pilih;
        if (kode == 1) 
            cekSaldo();
        else if (kode == 2)
            tarikTunai();
        else if (kode == 3)
            transfer();
        else
            keluar();
    }
    public void infoRekening(int pin) {
        if (pin == 2015) {
            System.out.println("Nama : " + nama);
            norekening = 155150400;
            System.out.println("No Rekening : " + norekening);
        }
    }
    public void cekSaldo() {
        infoRekening(pin);
        System.out.println("Saldo anda : Rp. " + saldo);
        System.out.println("Apakah anda ingin melakukan transaksi kembali?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            int tanya = in.nextInt();
            if (tanya == 1) {
                System.out.print("Masukkan PIN : ");
                login(in.nextInt());
            } else 
                keluar();
    }
    public void tarikTunai() {
        System.out.print("Masukkan jumlah uang : ");
        int uang = in.nextInt();
        if (saldo > uang) {
            System.out.println("Transaksi anda sedang diproses");
            System.out.println("Sisa saldo anda : " + (saldo = saldo - uang));
            System.out.println("Apakah anda ingin melakukan transaksi kembali?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            int tanya = in.nextInt();
            if (tanya == 1) {
                System.out.print("Masukkan PIN : ");
                login(in.nextInt());
            } else 
                keluar();
        } else if (saldo < uang) {
            System.out.println("Maaf, saldo anda tidak mencukupi");
            System.out.println("Transaksi tidak dapat diproses");
            System.out.println("Apakah anda ingin melakukan transaksi kembali?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            int tanya = in.nextInt();
            if (tanya == 1) {
                System.out.print("Masukkan PIN : ");
                login(in.nextInt());
            } else 
                keluar();
        }
    }
    public void infoTransfer() {
        System.out.println("Nama : " + nama);
        System.out.println("No rekening : " + norekening);
        System.out.println("Tujuan transfer");
        System.out.println("No rekening tujuan : " + rekeningtujuan);
        System.out.println("Jumlah transfer : Rp " + jumlahtransfer);
    }
    public void transfer() {
        System.out.print("Masukkan jumlah uang : ");
        jumlahtransfer = in.nextInt();
        if (saldo > jumlahtransfer) {
            System.out.print("Masukkan rekening tujuan : ");
            rekeningtujuan = in.nextInt();
            System.out.println("Transaksi anda sedang diproses");
            infoTransfer();
            System.out.println("Transaksi transfer berhasil");
            System.out.println("Sisa saldo anda : " + (saldo = saldo - jumlahtransfer));
            System.out.println("Apakah anda ingin melakukan transaksi kembali?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            int tanya = in.nextInt();
            if (tanya == 1) {
                System.out.print("Masukkan PIN : ");
                login(in.nextInt());
            } else
                keluar();
        } else if (saldo < jumlahtransfer) {
            System.out.println("Maaf, saldo anda tidak mencukupi");
            System.out.println("Transaksi tidak dapat diproses");
            System.out.println("Apakah anda ingin melakukan transaksi kembali?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            int tanya = in.nextInt();
            if (tanya == 1) {
                System.out.print("Masukkan PIN : ");
                login(in.nextInt());
            } else
                keluar();
        }
    }
    public void keluar() {
        System.out.println("Anda keluar dari sistem ATM");
        System.out.println("Silakan ambil kartu anda");
        System.out.println("Terima kasih");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm user = new Atm("Fitri Resdiyani", 2015, 10000000);
        System.out.print("Masukkan PIN Anda : ");
        user.login(in.nextInt());
    }
}