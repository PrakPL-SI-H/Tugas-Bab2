package prakpl;
import java.util.Scanner;
public class Atm {
    int noReg;
    int Saldo = 100000000;
    int akSaldo;
    int Jumlah;
    int ambilUang;
    int cekSaldo;
    int Transfer;
    int pin;
    int pil;
    Scanner ni = new Scanner(System.in);
    
    public int Jumlah(){
        return Jumlah;
    }
    public void ambilUang(){
        System.out.println("============***===============");
        System.out.println(" Pilih Uang yang akan diambil");
        System.out.println("==============================");
        System.out.println("1.Rp 50.000");
        System.out.println("2.Rp 100.000");
        System.out.println("3.Rp 500.000");
        System.out.println("4.Rp 1.000.000");
        System.out.println("5.Rp 5.000.000");
        System.out.println("6.Rp 10.000.000");
        System.out.println("==============================");
        System.out.print("Masukkan Pilihan anda = ");
        int uang= ni.nextInt();
        System.out.println("==============================");
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
            System.out.println("==============================");
            }
        }
        public void akSaldo(){
            System.out.println("============***===============");
            System.out.println("        Cek Saldo");
            System.out.println("==============================");
            System.out.println("Saldo awal anda tinggal  = "+ Saldo);
            System.out.println("Saldo akhir anda tinggal = "+ Jumlah);
            System.out.println("==============================");
        }
        public void Transfer(){
            System.out.println("============***===============");
            System.out.println("          Transfer");
            System.out.println("==============================");
            System.out.println("1.Bank Yang Sama");
            System.out.println("2.Bank Lainnya");
            System.out.println("==============================");
            System.out.print("Masukkan Pilihan Anda = ");
            int pilih =ni.nextInt();
            System.out.println("==============================");
            if (pilih == 1){
                System.out.print("Masukkan Pin = ");
                pin = ni.nextInt();
                if (pin == 1111){
                    System.out.println("No Rekening  : "+pin);
                    System.out.println("An Nama      : Pak dhe Qu");
                    System.out.print("Masukkan uang : ");
                    int no =ni.nextInt();
                    Jumlah = Saldo - no;
                    System.out.println("Transfer Sukses !!!");
                }else{ 
                    System.out.println("Pin Tidak tersedia ");      
                    System.out.println("Transfer Gagal !!!");
                }
            }
            else if(pilih == 2){
                System.out.println("Bank");
                System.out.println("No Nama Bank   Kode");
                System.out.println("1. Bank ini     01");
                System.out.println("2. Bank mu      02");
                System.out.println("3. Bank Negara  03");
                System.out.print("Masukkan urutan kode bank = ");
                pil = ni.nextInt();
                if (pil == 1){
                    System.out.print("No Rekening (kode_No Rekening) : 01");
                    int rek =ni.nextInt();
                    System.out.println("An Nama                        : Bpk Qu");
                    System.out.print("Masukkan Nominalnya            : ");
                    int nom = ni.nextInt();
                    Jumlah=Saldo - nom;
                    System.out.println("Transfer Sukses !!!");
                }else if(pil == 2){
                    System.out.print("No Rekening (kode_No Rekening) : 02");
                    int rek =ni.nextInt();
                    System.out.println("An Nama                        : Ibu Qu");
                    System.out.print("Masukkan Nominalnya            : ");
                    int nom = ni.nextInt();
                    Jumlah=Saldo - nom;
                    System.out.println("Transfer Sukses !!!");
                }else if(pil == 3){
                    System.out.print("No Rekening (kode_No Rekening) : 03");
                    int rek =ni.nextInt();
                    System.out.println("An Nama                        : Adik Qu");
                    System.out.print("Masukkan Nominalnya            : ");
                    int nom = ni.nextInt();
                    Jumlah=Saldo - nom;
                    System.out.println("Transfer Sukses !!!");
                }else{
                    System.out.println("Pilihan Anda Tidak Tersedia !!!");
                    System.out.println("Transfer Gagal !!!");
            }
        }
    }
}           