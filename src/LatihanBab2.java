import java.util.Scanner;

class ATM{
    String nama;
    String pin;
    String transfer;
    double saldo, nominal;
    
    
 public ATM (String Nama,String Pin,String Transfer,double Saldo){
     nama = Nama;
     pin = Pin;
     transfer = Transfer;
     saldo = Saldo;
     
     nominal =0;
 }
 public void NrSaldo(){
     System.out.println("Check Saldo");
     System.out.println("Jumlah Saldo Anda: Rp."+saldo);
     System.out.println("Transaksi Berakhir");
 }
 
 public void NrNominal ( double Nominal){
     nominal = Nominal;
     if (saldo > Nominal){
     saldo = saldo - nominal;
     System.out.println("Penarikan uang anda:"+Nominal);
     System.out.println("Sisa Saldo Anda:"+saldo);
     }else System.out.println("Saldo Tidak Mencukupi, Transaksi Berakhir");
 
 }
    
 public void NrTransfer1 (){
     System.out.println("");
 }    
 public void NrTransfer2(double Nominal){
     nominal = Nominal;
     if (saldo > Nominal){
     saldo = saldo-Nominal;
     System.out.println("Transfer Uang");
     System.out.println("Dengan Nomer Rekening: "+transfer);
     System.out.println("Transfer Sebesar : "+transfer);
     System.out.println("Informasi Saldo Anda : Rp."+saldo);
     System.out.println("Transaksi Berhasil Dilakukan");
     }
     else{
     System.out.println("Saldo Tidak Mencukupi, Transaksi Berakhir");
     }      
   }  
 }

public class LatihanBab2 {
    
  
    public static void main(String[] args) {
        
    }
}