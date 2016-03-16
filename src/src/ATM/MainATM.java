package ATM;

import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM org1 = new ATM("Avip Cahyo", 231214, 500000, 123456789);
        ATM org2 = new ATM("Nanda Fiesta Farada", 261097, 1000000, 987654321);
        int a, b = 0, c, d;
        String balik = "y";
        System.out.println("Terimakasih Anda Telah Memasukkan Kartu ATM");
        System.out.println("-------------------------------------------");
        for (;;) {
            System.out.print("Masukkan Password Anda = ");
            a = in.nextInt();
            c = a;
            b += 1;
            if (a == org1.pass || a == org2.pass) {
                break;
            } else if (b == 3) {
                System.out.println("Maaf Anda Sudah Salah Memasukkan Password 3x");
                System.out.println("        Mohon Hubungi Kantor Pusat          ");
                System.out.println("    Anda Akan Keluar Dari Program ATM       ");
                break;
            } else {
                System.out.println("Password Salah Ulangi Lagi");
                continue;
            }
        }
        if (a == 231214 || a == 261097) {
            while (balik.equals("y") || balik.equals("Y")) {
                System.out.println("=====Pilihan Menu=====");
                System.out.println("1. Melihat Saldo");
                System.out.println("2. Menarik Saldo");
                System.out.println("3. Menstranfer Rekening");
                System.out.print("Masukan Pilhan Anda = ");
                b = in.nextInt();
                switch (b) {
                    case 1:
                        if (c == 231214) {
                            org1.infoSaldo();
                        } else {
                            org2.infoSaldo();
                        }
                        break;
                    case 2:
                        if (c == 231214) {
                            System.out.print("Berapa Jumlah Uang Yang Akan Anda Tarik Kelipatan (50.000) = Rp.");
                            a = in.nextInt();
                            org1.penarikan(a);
                            int sisa = (500000 - a);
                            System.out.println("Sisa saldo anda adalah Rp." + sisa);
                            System.out.println("       Tarik Tunai Berhasil ");
                            System.out.println("            Terimakasih     ");
                        } else {
                            System.out.print("Berapa Jumlah Uang Yang Akan Anda Tarik Kelipatan (50.000) = Rp.");
                            a = in.nextInt();
                            org2.penarikan(a);
                            int sisa = (1000000 - a);
                            System.out.println("Sisa Saldo Anda Adalah Rp." + sisa);
                            System.out.println("       Tarik Tunai Berhasil ");
                            System.out.println("            Terimakasih     ");
                        }
                        break;
                    case 3:
                        System.out.print("Masukan Rekening Yang Dituju = ");
                        a = in.nextInt();
                        if (a == org2.rekening) {
                            System.out.println("Rekening Yang Anda Tuju Bernama");
                            System.out.println("=========");
                            System.out.println(org2.nama);
                            System.out.println("=========");
                            System.out.print("Masukan Nominal Yang Anda Tranfer = Rp.");
                            b = in.nextInt();
                            org1.penarikan(b);
                            if (a == org2.rekening) {
                                org2.penarikan(b);
                                org2.transfer(b);
                            } else {
                                org1.transfer(b);
                            }
                        } else if (a == org1.rekening) {
                            System.out.println("Rekening Yang Anda Tuju Bernama");
                            System.out.println("=========");
                            System.out.println(org1.nama);
                            System.out.println("=========");
                            System.out.print("Masukan Nominal Yang Anda Tranfer = Rp.");
                            d = in.nextInt();
                            org2.penarikan(d);
                            if (a == org1.rekening) {
                                org1.penarikan(b);
                                org1.transfer(b);

                            } else {
                                org2.transfer(b);
                            }
                            System.out.println("        Transfer Anda SUKSES");
                            System.out.println("            Terimakasih     ");
                        } else {
                            System.out.println("Rekening Tidak Terdaftar");

                        }
                }
                System.out.print("Anda Ingin Mencoba Menu Lain (Y/N) : ");
                balik = in.next();
            }
            System.out.println("    Terimah kasih Atas kunjungan anda");
        } else {
            System.out.println("    Terimah kasih Atas kunjungan anda");
        }
    }

}
