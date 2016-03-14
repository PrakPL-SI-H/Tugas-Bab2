package tugasmesinatm;

import java.util.Scanner;

class Data {

    int pin;
    Double saldo;

    public Data(int x) {
        pin = x;

    }

    public void setPin(int password) {
        this.pin = password;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//------------------------------------ getter
    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class TugasMesinATM {

    /**
     * @author Istighfarin Bahtiar AMry
     * @ Nim 155150401111129
     * @ Kelas SI-H
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data masuk = new Data(31081996);
        System.out.println("    =====ATM BAHTIAR JAYA ABADI=====");
        System.out.println();

        System.out.print("Masukkan PIN Anda  :");
        int pin = in.nextInt();
        if (masuk.getPin() == pin) {
            tampilanMenu();
        } else {
            System.out.println();
            System.out.println("           ===LOGIN GAGAL===");
            System.out.println("          MAAF PIN ANDA SALAH");
            System.out.println("            PROGRAM CLOSED");

        }

    }

    public static void tampilanMenu() {
        System.out.println("|=======================================================|");

        System.out.print("|         Selamat Datang di ATM BAHTIAR JAYA ABADI      |");
        System.out.println();
        System.out.println("|=======================================================|");
        System.out.print("|               > PILIH TRANSAKSI ANDA <                |");
        System.out.println();
        System.out.print("|   [1] CEK SALDO               [2] TRANSFER UANG       |");
        System.out.println();
        System.out.print("|   [3] PENARIKAN UANG          [4] PEMBAYARAN LAIN-LAIN|");
        System.out.println();
        System.out.println("|                     [5] Keluar                        |");
        System.out.println("|=======================================================|");
    }

}
