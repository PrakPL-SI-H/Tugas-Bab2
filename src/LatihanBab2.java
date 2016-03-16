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