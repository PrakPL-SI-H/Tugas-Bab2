
public class ATM {

    int pass, passInput;
    double saldo;
    double out;
    long rekLain;
    String again;

    public ATM() {
        pass = 12345;
        saldo = 1000000;
    }

    public boolean cekPass() {
        return (passInput == pass);
    }

    public void showMenu() {
        System.out.println("1 Cek saldo");
        System.out.println("2 Tarik uang");
        System.out.println("3 Transfer ke rekening lain");
    }

    public double cekSaldo() {
        return saldo;
    }

    public void uangKeluar() {
        saldo = saldo - out;
    }
}
