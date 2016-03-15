package praktikum;
import java.util.Scanner;
public class mainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM atm1 = new ATM();
        int pilih; 
        int pilih2; 
        int pilihan;
        System.out.println("selamat datang di ATM BRI");
        System.out.print("Silahkan masukkan pin anda : ");
        int pin = in.nextInt();
        do {
            atm1.tampilanAwal();
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    atm1.cekSaldo();
                    System.out.println("");
                    pilihan = ulang();
                    break;
                case 2:
                    System.out.print("Masukan nominal yang diinginkan   : ");
                    atm1.tarikTunai = in.nextInt();
                    atm1.tarikUang();
                    pilihan = ulang();
                    break;
                case 3:
                    do {
                        System.out.println("==============Menu Bank==============");
                        System.out.println("1. SYARIAH             4. BTPN");
                        System.out.println("2. BNI             5. BI");
                        System.out.println("3. Mandiri         6. Niaga");                              
                        System.out.println("======================================");
                    System.out.print("Masukka Kode Bank : ");
                        atm1.kode = in.nextInt();
                        System.out.print("Masukan nomor rekening tujuan anda        : ");
                        atm1.norek = in.nextInt();
                        System.out.print("Masukan nama penerima                     : ");
                        in.nextLine();
                        atm1.nama = in.nextLine();
                        System.out.print("Masukan nominal transfer : ");
                        atm1.nominal = in.nextInt();
                        System.out.println("Anda akan mentransfer kepada " + atm1.nama + " dengan nominal " + atm1.nominal + ".");
                        System.out.println("");
                        System.out.println("Apakah data yang diatas sudah benar?");
                        System.out.println("1. Iya");
                        System.out.println("2. Tidak");
                        pilih2 = in.nextInt();
                    } while (pilih2 != 1);
                    atm1.transfer();
                    pilihan = ulang();
                    break;
                case 4:
                    System.out.println("Terimakasih sudah melakukan transaksi");
                    System.out.println("Silahkan ambil kartu ATM anda");
                    System.out.println("**********************************************");
                    break;
                default:
                    System.out.println("Maaf pilihan anda tidak terdaftar");
                    break;
            }
        } while (pilihan != 4);
    }
        private static int ulang() {
        int pilihan = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingin transaksi lagi (Y/N) : ");
        String pilih = in.next();
        if (pilih.equals("N")) {
                        System.out.println("Terima kasih telah melakukan transaksi");
            System.out.println("Silahkan ambil kartu ATM anda");
            pilihan = 4;
        }
        return pilihan;
    }
}

