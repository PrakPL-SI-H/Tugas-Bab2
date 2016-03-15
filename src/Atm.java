package javaapplication10;

import java.util.Scanner;

public class Atm {

    private int firstsaldo = 10000000;
    private String nama;
    private int password;
    int userinput1;
    int userinput2;
    int penarikan;
    int nomtransfer;
    double rek;
    public int stop = 0;
    String namaBank;
    Scanner input = new Scanner(System.in);

    public Atm() {
        String nm = "BRI";
        int pass = 264069;
        password = pass;
        nama = nm;
    }

    void cekPassword() {

        int i = 0;
        do {
            System.out.print("Masukan password anda : ");
            userinput1 = input.nextInt();
            if (i > 1) {
                System.out.println("Maaf, transaksi anda dibatalkan");
                System.exit(0);
            }
            i++;
        } while (userinput1 != password);
    }

    void infoSaldo() {
        System.out.println("Saldo anda sekarang adalah : " + firstsaldo);
    }

    int penarikan() {
        int i = 0;
        do {
            System.out.print("Masukan nominal penarikan    : ");
            penarikan = input.nextInt();
            if (penarikan > firstsaldo) {
                System.out.println("Maaf, saldo anda tidak mencukupi");
                System.out.println("Silahkan masukan nominal yang lebih kecil");
            }

            if (penarikan < 0) {
                System.out.println("Maaf anda tidak memasukkan nominal yang benar");
                System.out.println("Silahkan masukkan nominal yang benar");
                penarikan();
            } else {
                System.out.println("Penarikan berhasil, sebanyak : " + penarikan);
                System.out.println("Silahkan ambil uang anda ...");
                firstsaldo = firstsaldo - penarikan;
            }
            i++;
        } while (penarikan > firstsaldo);
        return firstsaldo;
    }

}
