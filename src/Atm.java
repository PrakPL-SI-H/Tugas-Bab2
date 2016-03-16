package Praktikum2;

//NAMA  : Arif Ramadhan
//NIM   : 155150401111139
//Kelas : SI-H

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
