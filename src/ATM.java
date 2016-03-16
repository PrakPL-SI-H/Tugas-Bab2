package PraktikumSIH;
public class ATM {
    private String nama;
    private String password;
    private double saldo;
    private static int jumlah;
    public ATM() {
        nama = "default";
        password = "default";
        saldo = 0;
    }
    public ATM(String n, String p, Double s) {
        nama = n;
        password = p;
        saldo = s;
    }
    public void simpan(double s) {
        saldo = saldo + s;
        System.out.println("Saldo Anda saat ini : " + saldo);
    }
    public void ambil(double s) {
        if (saldo > s) {
            saldo = saldo - s;
            System.out.println("Penarikan berhasil. Silahkan ambil uang Anda.");
            System.out.println("Saldo Anda saat ini " + saldo);
        } else {
            System.out.println("Maaf saldo Anda tidak mencukupi");
        }
    }
    public String getNama() {
        return nama;
    }
    public String getPassword() {
        return password;
    }
    public double getSaldo() {
        return saldo;
    }
    public void transfer(double t) {
        if (saldo < t) {
            System.out.println("Maaf saldo tidak mencukupi");
        } else {
            saldo = saldo - t;
            System.out.println("Transfer berhasil. Saldo Anda saat ini " + saldo);
        }
    }
    public void info() {
        System.out.println("Nama " + nama);
        System.out.println("Saldo " + saldo);
    }
}