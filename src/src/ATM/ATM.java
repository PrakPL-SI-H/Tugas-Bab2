package ATM;

public class ATM {

    String nama;
    int pass;
    int uang;
    int rekening;

    public ATM(String a, int b, int c, int d) {
        nama = a;
        pass = b;
        uang = c;
        rekening = d;
    }

    public void infoSaldo() {
        System.out.println("Saldo Anda Saat Ini Adalah Rp." + uang);

    }

    public void penarikan(int a) {
        uang = uang - a;
    }

    public void transfer(int a) {
        uang = uang + a;
    }
}
