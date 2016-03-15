
public class ATM {
    private String nama;
    private String norek;
    private String pin;
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
            
    
}
