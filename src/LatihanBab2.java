import java.util.Scanner;

public class MesinATM {

    String nama, pin, noRek;
    int saldo, uang;

    public MesinATM(String nama, String pin, String noRek, int saldo) {
        this.nama = nama;
        this.pin = pin;
        this.noRek = noRek;
        this.saldo = saldo;
        uang = 0;
    }

public void getSaldo() {
        System.out.println("Saldo di Rekening anda : " + saldo);

    }

    public void getUang(int uang) {
        this.uang = uang;
        if (saldo > uang) {
            saldo = saldo - uang;
            System.out.println("===========================");
            System.out.println("Penarikan Sebesar : " + uang);
            System.out.println("Sisa Saldo anda saat ini : " + saldo);
        } else {
            System.out.println("Transaksi Di Batalkan, Saldo anda Tidak Cukup");
        }
    }

public void dataTransfer() {
        System.out.println("Nomer Rekening Atas nama " + nama);
    }

    public void setTransfer(int uang) {
        this.uang = uang;
        if (saldo > uang) {
            saldo = saldo - uang;
            System.out.println("Dengan Nomer Rekening: " + noRek);
            System.out.println("Transfer Sebesar : " + uang);
            System.out.println("Saldo Anda saat ini : " + saldo);
        } else {
            System.out.println("Proses Di Batalkan Saldo anda Tidak Cukup");
        }
    }

    public void Transfer(MesinATM a) {
        a.saldo = a.saldo + uang;
    }

}

class mainATM {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String jawab, noRek;
        MesinATM atm = new MesinATM("Rodhi", "301197", "1234567", 1000000);
        MesinATM atm1 = new MesinATM("Anonymous", "150796", "7654321", 2000000);