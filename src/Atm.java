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



}
