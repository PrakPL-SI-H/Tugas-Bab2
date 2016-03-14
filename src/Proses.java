
public class Proses {
    Nasabah nsbh = new Nasabah();
    
    public void showSaldo(){
        System.out.println("Saldo saat ini = " + nsbh.saldo);
    }
    
    public void saldoKurang(int saldokurang){
        nsbh.saldo -= saldokurang;
    }
    
    public void transfer(int transfer){
        saldoKurang(transfer);
    }
}
