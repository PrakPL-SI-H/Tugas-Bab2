package Praktikum2;

public class Atm {

    private int pin;
    private int saldo;
    private int nominal;
    private String rek;
    private String name;
    private String garis = "=========================================================";
    
    public Atm(int pin, String name, String rek, int saldo) {
        this.pin = pin;
        this.name = name;
        this.rek = rek;
        this.saldo = saldo;
    }
    
    public int getPin(){
        return pin;
    }
    
    public String getRek(){
        return rek;
    }
    
    public void cekSaldo() {
        System.out.println(garis);
        System.out.println("INFORMASI SALDO");
        System.out.println("Rp " + saldo + ",00");
        System.out.println(garis);
    }

    public void penarikan(int nominal) {
        this.nominal = nominal;
        if (nominal > saldo) {
            System.out.println(garis);
            System.out.println("Maaf, Transaksi tidak dapat diproses");
            System.out.println("Saldo anda tidak mencukupi");
            System.out.println(garis);
        } else {
            saldo -= nominal;
            System.out.println(garis);
            System.out.println("Transaksi anda berhasil");
            System.out.println(garis);
        }
    }
    public void transferDetail(int nominal){
        this.nominal = nominal;
        if (nominal > saldo) {
            System.out.println(garis);
            System.out.println("Maaf, Transaksi tidak dapat diproses");
            System.out.println("Saldo anda tidak mencukupi");
            System.out.println(garis);
        } else {
            saldo -= nominal;
            System.out.println(garis);
            System.out.println("Nama            = "+name);
            System.out.println("No. Rekening    = "+rek);
            System.out.println("Nominal         = "+nominal);
            System.out.println("Transaksi anda berhasil");
            System.out.println(garis);
        }
    }
    public void terimaTransfer(Atm lain){
        lain.saldo += nominal;
    }
}
