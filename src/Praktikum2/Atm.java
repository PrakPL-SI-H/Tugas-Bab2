
package Praktikum2;
public class Atm {
    private int password;
    private int saldo = 1000000000;
    private int tarik = 0;
    private int transfer;
    private String rek;
    
    public Atm(){
        
    }
    public int password(){
        return password = 123456;
    }
    public void cekSaldo(){
        int sisa = saldo - tarik - transfer;
        System.out.println("saldo anda saat ini = "+sisa);
    }
    public void setTarik(int berapa){
        tarik = berapa;
    }
    
    public void doTransfer(int berapa){
        transfer = berapa;
    }
    
    public void rekTransfer(String rek){
        this.rek = rek;
    }
}
