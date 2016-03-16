
import java.util.Scanner;

public class atm {

    private int saldo;
    private String pin;

    public atm(int saldo) {
        this.pin = pin;
        this.saldo = saldo;
    }

    public int penarikan() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Uang yang ingin di ambil : ");
        int tarik = in.nextInt();
        int uang;
        if (tarik > saldo) {
            System.out.println("Maaf Saldo anda tidak mencukupi");
        } else {
            System.out.println("Anda telah melakukan penarikan uang sebesar : " + tarik);
        }
        saldo -= tarik;
        uang = saldo;
        System.out.println("-----------------------------");
        return uang;
    }

    public void ceksaldo() {
        System.out.println("Saldo anda sekarang sebesar : Rp. " + saldo);
        System.out.println("-----------------------------");
    }

    public void transfer() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bank tujuan anda : ");
        String tujuan = in.nextLine();
        System.out.print("Masukkan rekening tujuan anda : ");
        int rek = in.nextInt();
        System.out.print("Masukkan jumlah uang yang akan di transfer : ");
        int tran = in.nextInt();
        if (saldo > tran) {
            saldo -= tran;
            System.out.println("Anda telah melakukan transfer sebesar " + tran + "kepada nomer rekening : " + rek);
        } else {
            System.out.println("Maaf uang anda tidak mencuupi untuk melakukan transfer");
        }
        System.out.println("-----------------------------");
    }

}
