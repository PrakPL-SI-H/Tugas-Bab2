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
    
    public void setMenuATM(){
        switch (pilihan){
            case 1 :
                cekSaldo();
            case 2 :
                penarikan();
            case 3 :
                transfer();
    }
    }
    
    public void cekSaldo(){
        System.out.println("Saldo anda tersisa : "+saldo);
    }
    
    public void penarikan(){
        System.out.println("Penarikan uang yang ingin anda lakukan : ");
        System.out.println("1. Rp250.000,-");
        System.out.println("2. Rp500.000,-");
        System.out.println("3. Rp750.000,-");
        System.out.println("4. Rp1.000.000,-");
        System.out.println("5. Penarikan dalam jumlah lain");
            if (penarikan = "1"){
                System.out.println("Saldo anda tersisa : "+(saldo-250000));
            }
            else if (penarikan = "2"){
                System.out.println("Saldo anda tersisa : "+(saldo-500000));
            }
            else if (penarikan = "3"){
                System.out.println("Saldo anda tersisa : "+(saldo-750000));
            }
            else if (penarikan = "4"){
                System.out.println("Saldo anda tersisa : "+(saldo-1000000));
            }
            else if (penarikan = "5"){
                System.out.println("Saldo anda tersisa : "+(saldo-penarikan1));
            }
    }
    
    public void transfer(){
        System.out.println("Anda memilih transfer. Pilih menu");
        System.out.println("1. Transfer Sesama Bank");
        System.out.println("2. Transfer Antar Bank");
    }
}
