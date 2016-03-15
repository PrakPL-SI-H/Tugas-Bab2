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
    
public class LatihanBab1 {
    public static void main(String[] args) {
        
        
        
    }
    
}
