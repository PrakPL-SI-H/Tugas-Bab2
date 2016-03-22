package mainatm;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM akun1 = new ATM("Randi Saputra", 311093, 500000, 12345);
        ATM akun2 = new ATM("Weni Gusti Rahayu", 240897, 1000000, 56789);
        int a, b = 0, c, d;
        String jawab = "y";
        System.out.println("\t      Selamat Datang di ATM BNI");
        System.out.println("-------------------------------------------------------");
        for (;;) {
            System.out.print("Masukkan Password Anda = ");
            a = in.nextInt();
            c = a;
            b += 1;
            if (a == akun1.pass || a == akun2.pass) {
                break;
            } else if (b == 3) {
                System.out.println("Maaf Anda Sudah Salah Memasukkan Password 3x");
                System.out.println("        Mohon Hubungi Kantor Pusat          ");
                System.out.println("    Anda Akan Keluar Dari Program ATM       ");
                break;
            } else {
                System.out.println("Password And Salah, Mohon Ulangi Lagi");
                continue;
            }
        }
        if (a == 311093 || a == 240897) {
            while (jawab.equals("y") || jawab.equals("Y")) {
                System.out.println("\t       >> Pilih Transaksi <<                    ");
                System.out.println(" ");
                System.out.println("\t 1. Cek Saldo");
                System.out.println("\t 2. Penarikan");
                System.out.println("\t 3. Transfer");
                System.out.println(" ");
                System.out.println("=======================================================");
                System.out.print("\t         Masukan pilihan Anda : ");
                b = in.nextInt();
                switch (b) {
                    case 1:
                        if (c == 311093) {
                            akun1.cekSaldo();
                        } else {
                            akun2.cekSaldo();
                        }
                        break;
                    case 2:
                        if (c == 311093) {
                            System.out.print("Masukan Jumlah uang dalam Kelipatan(50.000) = Rp.");
                            a = in.nextInt();
                            akun1.penarikan(a);
                            int sisa = (500000 - a);
                            System.out.println("Sisa Saldo Anda sekarang adalah Rp." + sisa);
                            System.out.println(" ");
                            System.out.println("=======================================================");
                            System.out.println("\tPenarikan tunai berhasil.");
                            System.out.println("\t      Terimakasih.");
                            System.out.println("=======================================================");
                        } else {
                            System.out.print("Masukan Jumlah uang dalam Kelipatan(50.000) = Rp.");
                            a = in.nextInt();
                            akun2.penarikan(a);
                            int sisa = (1000000 - a);
                            System.out.println("Sisa Saldo Anda sekarang adalah Rp." + sisa);
                            System.out.println(" ");
                            System.out.println("=======================================================");
                            System.out.println("\tPenarikan tunai berhasil.");
                            System.out.println("\t      Terimakasih.");
                            System.out.println("=======================================================");
                        }
                        break;
                    case 3:
                        System.out.print("Masukan Nomor Rekening Yang Dituju = ");
                        a = in.nextInt();
                        if (a == akun2.rekening) {
                            System.out.println("Nama penerima adalah : " + akun2.nama);
                            System.out.println("=======================================================");
                            System.out.print("Masukan Nominal Yang Anda Tranfer = Rp.");
                            b = in.nextInt();
                            akun1.penarikan(b);
                            if (a == akun2.rekening) {
                                akun2.penarikan(b);
                                akun2.transfer(b);
                            } else {
                                akun1.transfer(b);
                            }
                        } else if (a == akun1.rekening) {
                            System.out.println("Nama penerima adalah : " + akun1.nama);
                            System.out.println("=======================================================");
                            System.out.print("Masukan Nominal Yang Anda Tranfer = Rp.");
                            d = in.nextInt();
                            akun2.penarikan(d);
                            if (a == akun1.rekening) {
                                akun1.penarikan(b);
                                akun1.transfer(b);

                            } else {
                                akun2.transfer(b);
                            }
                            System.out.println("=======================================================");
                            System.out.println("\tTranfer Anda Sukses.");
                            System.out.println("\t      Terimakasih.");
                            System.out.println("=======================================================");
                        } else {
                            System.out.println("Rekening Tidak Terdaftar");

                        }
                }
                System.out.println("Apakah anda ingin melakukan transaksi lainnya ? (y/n)");
                jawab = in.next();
            }
            System.out.println("=======================================================");
            System.out.println("\tTerimakasih telah menggunakan layanan kami.");
            System.out.println("\t      Silahkan Ambil kartu Anda.");
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            System.out.println("\tTerimakasih telah menggunakan layanan kami.");
            System.out.println("\t      Silahkan Ambil kartu Anda.");
            System.out.println("=======================================================");
        }
    }

}
