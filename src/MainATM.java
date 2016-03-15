package prakproglan;
import java.util.Scanner;
public class MainATM {
    
    Scanner in = new Scanner(System.in);
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
        pilihan = in.nextInt();
    }
    
    public void setMenuATM(){
        switch (pilihan){
            case 1 :
                cekSaldo();
            case 2 :
                penarikan();
            case 3 :
                transfer();
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
            if (penarikan = "1"){
                System.out.println("Saldo anda tersisa : "+(saldo-250000));
            }
            else if (penarikan = "2"){
                System.out.println("Saldo anda tersisa : "+(saldo-500000));
            }
            else if (penarikan = "3"){
                System.out.println("Saldo anda tersisa : "+(saldo-750000));
            }
            else if (penarikan = "4"){
                System.out.println("Saldo anda tersisa : "+(saldo-1000000));
            }
            else if (penarikan = "5"){
                System.out.println("Saldo anda tersisa : "+(saldo-penarikan1));
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