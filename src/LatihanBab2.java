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
     System.out.println("Penarikan Saldo");
     System.out.println("Jumlah Saldo Anda: Rp."+saldo);
     System.out.println("")
 }
 
 public void NrNominal ( double Nominal){
     nominal = Nominal;
     if (saldo > Nominal){
         saldo = saldo - nominal;
         System.out.println("Penarikan uang anda:"+Nominal);
         System.out.println("Sisa Saldo Anda:"+saldo);
     }else System.out.println("Saldo Tidak Mencukupi, Transaksi Berakhir");
 
 }
    
 public void NrTransfer (){
     
 }    
    
}
public class LatihanBab2 {
    
  
    public static void main(String[] args) {
        
