package prakproglan;
import java.util.Scanner;
public class MainATM {
    
    Scanner in = new Scanner(System.in);
    ATM uang = new ATM();
    int pilihan;
    int pilihan1;
    int saldo;
    int saldo1;
    int saldo2;
    String penarikan;
    int penarikan1;
    double transfer;
    
    public static void main(String[]args){

    }

    public void MenuATM(){
        System.out.println("      SELAMAT DATANG     ");
        System.out.println("=========================");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Melihat Saldo");
        System.out.println("2. Penarikan Uang");
        System.out.println("3. Transfer");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = in.nextInt();
        switch (pilihan){
            case 1 :
                cekSaldo();
                break;
            case 2 :
                penarikan();
                break;
            case 3 :
                transfer();
                break;
            case 4 :
                System.out.println("Terima Kasih");
                System.out.println("Silakan Ambil Kartu Anda Kembali");
                break;
            default :
                System.out.println("Pilihan Yang Anda Masukkan Salah");
                break;
        }
    }
    
    public void cekSaldo(){
        System.out.println("Saldo anda tersisa : "+saldo);
    }
    
    public void penarikan(){
        System.out.println("Penarikan uang yang ingin anda lakukan : ");
        System.out.println("1. Rp250.000,-");
        System.out.println("2. Rp500.000,-");
        System.out.println("3. Rp750.000,-");
        System.out.println("4. Rp1.000.000,-");
        System.out.println("5. Penarikan dalam jumlah lain");
        int pilihanpenarikan = in.nextInt();
        switch(pilihanpenarikan){
            case 1 :
                System.out.println("Saldo Anda Tersisa : "+(saldo-250000));
                break;
            case 2 :
                System.out.println("Saldo Anda Tersisa : "+(saldo-500000));
                break;
            case 3 :
                System.out.println("Saldo Anda Tersisa : "+(saldo-750000));
                break;
            case 4 :
                System.out.println("Saldo Anda Tersisa : "+(saldo-1000000));
                break;
            case 5 :
                System.out.println("Saldo Anda Tersisa : "+(saldo-penarikan1));
                break;
            default:
                System.out.println("Pilihan Anda Tidak Tersedia");
                System.out.println("Masukkan Pilihan Penarikan Anda Lagi");
                penarikan();
        }
    }
    
    public void transfer(){
        int rekening;

        System.out.println("Anda memilih transfer. Pilih menu");
        System.out.println("1. Transfer Sesama Bank");
        System.out.println("2. Transfer Antar Bank");
        pilihan1 = in.nextInt();
        switch(pilihan1){
            case 1 :
                System.out.println("Masukkan Nomor Rekening : ");
                rekening = in.nextInt();
                System.out.println("Masukkan Jumlah Transfer : ");
                transfer = in.nextDouble();
                transferSesama(rekening, transfer);
                break;
            case 2 :
                System.out.println("Masukkan Nomor Rekening : ");
                rekening = in.nextInt();
                System.out.println("Masukkan Jumlah Transfer : ");
                transfer = in.nextDouble();
                transferBeda(rekening, transfer);
                break;
        }
    }
    
    public void transferSesama(int r, double t){
        if(saldo<transfer){
            System.out.println("Maaf, Saldo Yang Anda Miliki Tidak Cukup");
        }
        else if(saldo>transfer){
            System.out.println("Anda Melakukan Transfer Ke Nomor Rekening "+r);
            System.out.println("Sisa Saldo Anda Saat ini : ");
            System.out.println("Rp"+(saldo-transfer));
        }
    }
    
    public void transferBeda(int r, double t){
        if(saldo<transfer){
            System.out.println("Maaf, Saldo Yang Anda Miliki Tidak Cukup");
        }
        else if(saldo>transfer){
            System.out.println("Anda Melakukan Transfer Ke Nomor Rekening "+r);
            System.out.println("Sisa Saldo Anda Saat ini : ");
            System.out.println("Rp"+(saldo-transfer));
        }
    }
    
    
}