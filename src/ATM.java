package prakproglan;
public class ATM {
    
    int psword = 12345;
    int pilihan;
    int saldo;
    int saldo1;
    int saldo2;
    String penarikan;
    int penarikan1;
    
    public void setPassword(int p){
        if (psword!=this.psword){
            System.out.println("Password yang anda masukkan salah");
            System.out.println("Sistem berhenti....");
        }
        else 
            System.out.println();            
    }
}
