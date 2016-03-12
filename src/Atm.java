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
    int pin2;
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
        public void Transfer(){
            System.out.println("Transfer");
            System.out.println("1.Bank Yang Sama");
            System.out.println("2.Bank Lainnya");
            System.out.println("Masukkan Pilihan Anda = ");
            int pilih =ni.nextInt();
            if (pilih==1){
                System.out.println("Masukkan Pin = ");
                pin = ni.nextInt();
                System.out.println("Masukkan uang = ");
                int no =ni.nextInt();
                if (pin==1234){
                    System.out.println("No Rekening : "+pin);
                    System.out.println("An Nama     : Pak dhe Qu");
                    System.out.println("Nominal     : "+no);
                    System.out.println("Transfer Sukses !!!");
                }else 
                    System.out.println("Pin Tidak tersedia ");      
                    System.out.println("Transfer Gagal !!!");
            }else if(pilih==2){
                System.out.println("Masukkan Nominalnya = ");
                int nom = ni.nextInt();
                Jumlah=Saldo - nom;
                System.out.println("Kode Bank");
                System.out.println("01 Bank ini");
                System.out.println("02 Bank mu");
                System.out.println("03 Bank Negara");
                System.out.println("Masukkan kode bank diikuti nomer rekening = ");
                pin2 = ni.nextInt();
                if (pin2 == 01222){
                    System.out.println("No Rekening : "+pin2);
                    System.out.println("An Nama     : Bpk Qu");
                    System.out.println("Nominal     : "+nom);
                    System.out.println("Transfer Sukses !!!");
                }else if(pin2 == 02333){
                    System.out.println("No Rekening : "+pin2);
                    System.out.println("An Nama     : Ibu Qu");
                    System.out.println("Nominal     : "+nom);
                    System.out.println("Transfer Sukses !!!");
                }else if(pin2 == 03444){
                    System.out.println("No Rekening : "+pin2);
                    System.out.println("An Nama     : Adik Qu");
                    System.out.println("Nominal     : "+nom);
                    System.out.println("Transfer Sukses !!!");
                }else{
                    System.out.println("Pilihan Anda Tidak Tersedia !!!");
                    System.out.println("Transfer Gagal !!!");
            }
        }
    }
}           