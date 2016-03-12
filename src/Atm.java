/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpl;

import java.util.Scanner;

/**
 *
 * @author Prasetyo
 */
public class Atm {
    int noReg;
    int Saldo = 100000000;
    int akSaldo;
    int Jumlah;
    int ambilUang;
    int cekSaldo;
    int Transfer;
    Scanner ni = new Scanner(System.in);

    public void ambilUang(){
        System.out.println("Pilih Uang yang akan diambil");
        System.out.println("1.Rp 50.000");
        System.out.println("2.Rp 100.000");
        System.out.println("3.Rp 500.000");
        System.out.println("4.Rp 1.000.000");
        System.out.println("5.Rp 5.000.000");
        System.out.println("6.Rp 10.000.000");
        System.out.println("Masukkan Pilihan anda = ");
        int uang= ni.nextInt();
        switch(uang){
            case 1 :Jumlah = Saldo - 50000;
                    System.out.println("Uang yang diambil Rp 50.000");
                    ;break; 
            case 2 :Jumlah = Saldo - 100000;
                    System.out.println("Uang yang diambil Rp 100.000");
                    ;break;
            case 3 :Jumlah = Saldo - 500000;
                    System.out.println("Uang yang diambil Rp 500.000");
                    ;break;                
            case 4 :Jumlah = Saldo - 5000;
                    System.out.println("Uang yang diambil Rp 1.000.000");
                    ;break;
            case 5 :Jumlah = Saldo - 5000000;
                    System.out.println("Uang yang diambil Rp 5.000.000");
                    ;break;
            case 6 :Jumlah = Saldo - 10000000;
                    System.out.println("Uang yang diambil Rp 10.000.000");
                    ;break;
            default:System.out.println("Pilihan Yang anda Masukkan Tidak Tersedia !!!");
        }
        }
        public void akSaldo(){
            System.out.println("Saldo Awal anda tinggal = "+ Saldo);
            System.out.println("Saldo Akhir anda tinggal = "+ Jumlah);
        }
     
            }