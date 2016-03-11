package pratikum2;

public class ATM {
    int saldo;
    public ATM(int a){
    saldo = a;
    }
    public void tarik(int a){
    saldo = saldo-a;
    }
    public void transfer(int a){
    saldo = saldo-a;
    }
}
