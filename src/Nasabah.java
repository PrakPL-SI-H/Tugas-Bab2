
public class Nasabah {
    final String nasabah [][] = {{"1234510","1234","Jason Mraz"},{"1234511","1010","Muh. Asdar"}};
    int saldo;
    
    //saldo jason mraz
    public Nasabah(){
        saldo = 5000000;
    }
    
    //saldo Muh. Asdar
    public Nasabah(int x){
        saldo = 7000000;
    }
    
    public void showData(int i){
        System.out.println("No. Rekening = " + nasabah[i][0]);
        System.out.println("Nama         = " + nasabah[i][2]);
    }
    
    public void showSaldo(){
        System.out.println("Saldo saat ini = " + saldo);
    }
    
    public void saldoKurang(int saldokurang){
        saldo -= saldokurang;
    }
    
    public void transfer(int transfer){
        saldoKurang(transfer);
    }
    
}   
