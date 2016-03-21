
import java.util.Scanner;

public class LatihanBab2 {

    public static void main(String[] args) {
        String batas = ("----------------------------------------------------");
        Scanner in = new Scanner(System.in);
        Nasabah user = new Nasabah();
        boolean usr = false;
        int plh;
        int transfer = 0;
        String rektujuan = "";
        do {
            System.out.println("===== Anjungan Tunai Jomblo =====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            plh = in.nextInt();
            switch (plh) {
                case 1:
                    do {
                        System.out.println("===== Anjungan Tunai Jomblo =====");
                        System.out.print("No. Rekening = ");
                        String norek = in.next();
                        System.out.print("Pin          = ");
                        String pin = in.next();
                        for (int i = 0; i < user.nasabah.length; i++) {
                            if ((norek.equals(user.nasabah[i][0]) && pin.equals(user.nasabah[i][1]))) {
                                System.out.println("=================================");
                                if (i == 1) {
                                    user = new Nasabah(1);
                                    if (rektujuan.equalsIgnoreCase(norek))
                                        user.saldoTamah(transfer);
                                }
                                user.showData(i);
                                usr = true;
                            }
                        }
                        if (usr == false) {
                            System.out.println("Data Tidak Ditemukan");
                            System.out.printf("%.33s\n", batas);
                        }
                    } while (usr != true);
                    int pilihan;
                    do {
                        System.out.printf("%.40s\n", batas);
                        System.out.println("1. Cek Saldo");
                        System.out.println("2. Tarik Tunai");
                        System.out.println("3. Transfer");
                        System.out.println("0. Keluar");
                        System.out.print("Masukkan Pilihan Anda : ");
                        pilihan = in.nextInt();
                        System.out.printf("%.40s\n", batas);
                        switch (pilihan) {
                            case 1:
                                System.out.println("Saldo Anda Saat ini");
                                user.showSaldo();
                                break;
                            case 2:
                                System.out.println("\tTARIK TUNAI");
                                System.out.print("Masukan Jumlah Penarikan = ");
                                user.saldoKurang(in.nextInt());
                                System.out.println("Penarikan berhasil");
                                break;
                            case 3:
                                System.out.println("\tTRANSFER");
                                System.out.print("No.Rekening Tujuan = ");
                                rektujuan = in.next();
                                System.out.print("Jumlah Transfer    = ");
                                transfer = in.nextInt();
                                System.out.printf("%.40s\n", batas);
                                System.out.println("\tTujuan");
                                System.out.println("No.Rekening     = " + rektujuan);
                                System.out.println("Jumlah Transfer = " + transfer);
                                System.out.print("Lanjutkan ? (y/n)");
                                String pilih = in.next();
                                if (pilih.equalsIgnoreCase("y")) {
                                    user.saldoKurang(transfer);
                                    System.out.println("Transfer Berhasil");
                                } else {
                                    System.out.println("Transfer Dibatalkan");
                                }
                                break;
                            default:
                                if (pilihan == 0) {
                                    break;
                                } else {
                                    System.out.println("Maaf, Pilihan Tidak Tersedia");
                                }
                        }
                    } while (pilihan != 0);
            }
        } while (plh != 2);
        System.out.println("\tTerima Kasih");
    }
}
