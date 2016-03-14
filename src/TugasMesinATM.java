package tugasmesinatm;

import java.util.Scanner;

class Data {

    int pin, norek;
    Double saldo, transfer;
    String agenda;

    public Data(int pass) {
        pin = pass;

    }

//meng-set nilai pada pin dan saldo
    public void setPin(int password) {
        this.pin = password;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

// untuk memunculkan nilai pin dan Saldo
    public int getPin(Data A) { //meng instance method ke variabel A
        return A.pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public double transfer(double x) {
        return transfer = x;
    }

    public int norek(int x) {
        return norek = x;
    }

    public String agendaTransfer(String x) {
        return agenda = x;
    }

    public void penarikan() {
        System.out.println("|=======================================================|");
        System.out.print("|               > PILIH NOMINAL PENARIKAN <             |");
        System.out.println();
        System.out.print("|   [1] Rp.50.000               [2] Rp.1.000.000        |");
        System.out.println();
        System.out.print("|   [3] Rp.1500.000             [4] Rp.5.000.000        |");
        System.out.println();
        System.out.println("|                     [5] Keluar                        |");
        System.out.println("|=======================================================|");

    }

    public void tampilanTransfer() {
        System.out.println("Nomer Rekening tujuan : " + norek);
        System.out.println("Nominal Transfer      : Rp." + transfer + "0");
        System.out.println("Agenda Transfer       : " + agenda);
    }

    public void tampilansaldo() {
        System.out.println("        ====================================");
        System.out.println("        =============LIHAT SALDO============");
        System.out.println("        ====================================");
        System.out.println("Sisa Saldo Yang Anda Miliki Adalah Sebesar : Rp." + getSaldo() + "0");
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
        masuk.setSaldo(9000000);
        System.out.println("    =====ATM BAHTIAR JAYA ABADI=====");
        System.out.println();

        System.out.print("Masukkan PIN Anda  :");
        int pin = in.nextInt();
        if (masuk.getPin(masuk) == pin) { //memanggil instance method pada class Data dipanggil oleh objek masuk
            tampilanMenu();
            int pil;
            do {
                System.out.println("");
                System.out.print("Masukan Pilihan Anda : ");
                pil = in.nextInt();
                switch (pil) {
                    case 1:
                        System.out.println("");
                        masuk.tampilansaldo();
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("        ====================================");
                        System.out.println("        =============TRANSFER UANG==========");
                        System.out.println("        ====================================");
                        System.out.print("Masukkan Nomer Rekening Tujuan Anda   : ");
                        int norek = in.nextInt();
                        masuk.norek(norek);
                        System.out.print("Masukkan Jumlah Nominal Transfer Anda : ");
                        double transfer = in.nextInt();
                        masuk.transfer(transfer);
                        System.out.print("Masukkan Agenda Transfer Anda         : ");
                        String agenda = in.next();
                        masuk.agendaTransfer(agenda);
                        System.out.println("=============================================");
                        System.out.println("Proses sedang berlangsung Silahkan tunggu....");
                        masuk.tampilanTransfer();
                        System.out.println("TRANSAKSI TELAH BERHASIL.");
                        break;

                    case 3:
                        System.out.println("");
                        masuk.penarikan();
                        System.out.print("Masukkan Pilihan Anda : ");
                        int uang = in.nextInt();
                        if (uang == 1) {
                            System.out.println("Uang Yang Anda Ambil Sebesar Rp.50.000");
                            System.out.println("Dengan Sisa Saldo           :Rp." + (masuk.getSaldo() - 50000));
                        } else if (uang == 2) {
                            System.out.println("Uang Yang Anda Ambil Sebesar Rp.1000.000");
                            System.out.println("Dengan Sisa Saldo           :Rp." + (masuk.getSaldo() - 1000000));
                        } else if (uang == 3) {
                            System.out.println("Uang Yang Anda Ambil Sebesar Rp.1500.000");
                            System.out.println("Dengan Sisa Saldo           :Rp." + (masuk.getSaldo() - 1500000));
                        } else if (uang == 4) {
                            System.out.println("Uang Yang Anda Ambil Sebesar Rp.5000.000");
                            System.out.println("Dengan Sisa Saldo           :Rp." + (masuk.getSaldo() - 5000000));
                        }
                        break;

                    case 4:
                        System.out.println("");
                        System.out.println("        ====================================");
                        System.out.println("        ==========TRANSFER LAIN LAIN========");
                        System.out.println("        ====================================");
                        System.out.print("Masukkan Nomer Rekening INSTANSI              : ");
                        norek = in.nextInt();
                        masuk.norek(norek);
                        System.out.print("Masukkan Jumlah Nominal Transfer Anda         : ");
                        transfer = in.nextInt();
                        masuk.transfer(transfer);
                        System.out.print("Masukkan Agenda Transfer Anda Kepada INSTANSI : ");
                        agenda = in.next();
                        masuk.agendaTransfer(agenda);
                        System.out.println("=============================================");
                        System.out.println("Proses sedang berlangsung Silahkan tunggu....");
                        masuk.tampilanTransfer();
                        System.out.println("TRANSAKSI TELAH BERHASIL.");
                        System.out.println("SEGERA HUBUNGI INSTANSI YANG TERKAIT UNTUK KONFIRMASI");
                        break;

                    case 5:
                        System.out.println("    TERIMA KASIH SUDAH MENGGUNAKAN ATM KAMI");
                        System.out.println("    =============PROGRAM CLOSED============");
                        break;

                }
            } while (pil != 5);
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
