import java.util.Scanner;
class ATM{
    String nama,pin, noRek;
    int saldo ,uang;
  public ATM(String nama,String pin, int saldo, String noRek){
       this.nama = nama;
       this.pin = pin;
       this.noRek = noRek;
       this.saldo = saldo ;
       uang = 0;
   }
  public void getSaldo(){
       System.out.println("=====SALDO=====");
       System.out.println("Saldo di Rekening anda : Rp."+saldo+";");
       System.out.println("Transaksi Berhasil");
   }
  public void getUang(int uang){
       this.uang = uang;
       if (saldo > uang){
         saldo = saldo - uang;
         System.out.println("--------------------------------");
         System.out.println("Penarikan Sebesar: Rp."+uang);
         System.out.println("Sisa Saldo anda saat ini : Rp."+saldo);
       }
       else{
         System.out.println("Transaksi Di Batalkan, Saldo anda Tidak Cukup");
       }
   }
  public void dataTransfer(){
     System.out.println("Nomer Rekening Atas nama "+nama);
   }
   public void setTransfer(int uang){
       this.uang = uang;
       if (saldo > uang){
        saldo = saldo-uang;
         System.out.println("============TRANSFER============");
         System.out.println("Dengan Nomer Rekening: "+noRek);
         System.out.println("Transfer Sebesar : "+uang);
         System.out.println("Informasi Saldo Anda : Rp."+saldo);
         System.out.println("=======Transaksi Berhasil=======");
       }
       else{
         System.out.println("Transaksi Di Batalkan Saldo anda Tidak Cukup");
       }      
   }
    public void Transfer(ATM B){
       B.saldo = B.saldo + uang;
   }
}
public class LatihanBab2 {
    public static void main(String[] args) {
        
        
        
    }
    
}
