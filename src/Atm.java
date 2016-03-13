package Praktikum2;

public class Atm {

    int saldo, pin, tarik, transfer, rekening;

    public Atm(int sld) {
        saldo = sld;
    }

    public void tarik() {
        saldo = saldo - tarik;
    }

    public void transfer() {
        saldo=saldo-transfer;
    }
}
