
public class ATM {
    private String nama;
    private String norek;
    public String pin;
    private int saldo;
    public int jumlahTarik;
    public int jumlahTransfer;
    
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama (){
        return nama;
    }
    public void setNorek(String norrek){
        norek = norrek;
    }
    public String getNorek (){
        return norek;
    }
    public void setPin (String p){
        pin = p;
    }
    public String getPin (){
        return pin;
    }
    public void setSaldo (int s){
        saldo =s;
    }
     public int getSaldo (){
         return saldo;
     }       
     public void showSaldo(){
         System.out.println("Saldo Anda Saat Ini Adalah\t: Rp. "+saldo);
     }
     public void menuPertama (){
         System.out.println("\nPILIH JUMLAH PAKET TUNAI\n");
         System.out.printf("%s %30s\n","1. <= 50.000","500.000 => 5.");
         System.out.printf("%s %30s\n","2. <= 100.000","750.000 => 6.");
         System.out.printf("%s %30s\n","3. <= 200.000","1000.000 => 7.");
         System.out.printf("%s %30s\n","4. <= 300.000","TRANSAKSI LAIN => 8.");
         
     }
            
    
}
