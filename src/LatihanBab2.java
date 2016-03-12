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
}
public class LatihanBab2 {
    public static void main(String[] args) {
        
        
        
    }
    
}
