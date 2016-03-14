package pl_praktikum_lap2;

public class AtmClass {

    int pin;
    double saldo;

    public void setPin(int password) {
        this.pin = password;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }
}
