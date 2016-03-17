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
 
 public void NrNominal ( double Nominal,ATM NTransfer){
     nominal = Nominal;
     if (saldo > Nominal){
     
     NTransfer.saldo = NTransfer.saldo - Nominal;
     System.out.println("Penarikan Berhasil");
     System.out.println("Sisa Saldo Anda:"+saldo);
     System.out.println("Silahkan Ambil Uang Anda.");
     }else{
         System.out.println("Saldo Tidak Mencukupi, Transaksi Berakhir");}
      
 
 }
 public void NrTransfer1(String Rekening){
     if(Rekening.equals(transfer)){
     System.out.println("Atas Nama: "+nama);    
     }else System.out.println("Rekening Tidak Valid");
     
 }
 public void NrTransfer2(double Nominal, ATM NTransfer){
     
     nominal = Nominal;
     if (saldo > Nominal){

      NTransfer.saldo = NTransfer.saldo - Nominal;
     System.out.println("Transfer Uang");
     System.out.println("No Rekening Tujuan: "+transfer);
     System.out.println("Nominal Transfer: "+Nominal);
     System.out.println("Transaksi Berhasil Dilakukan");
     }
     else{
     System.out.println("Saldo Tidak Mencukupi, Transaksi Berakhir");
     }
   
   }  
 }

public class LatihanBab2 {
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String YesNo;
        ATM Rek1 = new ATM ("Rasyid Muhammad", "595321", "7717450", 10000000);
        ATM Rek2 = new ATM ("Ajeng Permata", "123595", "8569734", 20000000);
        
        System.out.print("Masukkan PIN anda:");
        String pin = in.next();
        do{
        if(pin.equals(Rek1.pin)){    
        System.out.println("ATM Bank BCA");    
            System.out.println("1. Penarikan Tunai " );
            System.out.println("2. Transfer Rekening"       );
            System.out.println("3. Check Saldo");
            System.out.println("4. Cancel");
            System.out.print("Masukkan Pilihan: ");
        int Option = in.nextInt();

        switch (Option){
            case 1: 
                System.out.println("-----===Penarikan Tunai Dari Rekening===-----");
                System.out.print("Masukkan Jumlah Penarikan:"                     );
                Rek1.NrNominal(in.nextInt(),Rek1);
                break;
            case 2: 
                System.out.println("-----===Tranfer Rekening===-----");
                
                System.out.print("Masukkan No Rekening Tujuan: ");
                Rek2.NrTransfer1(in.next());
                System.out.print("Masukkan Nominal Transfer  : ");
                Rek2.NrTransfer2(in.nextDouble(),Rek1); break;
            case 3:
                Rek1.NrSaldo();
                break;  
            case 4:
                System.out.println("Transaksi Berakhir");
                break;
            default: 
                System.out.println("Proses Tidak Dapat berjalan, Transaksi Selesai");
                }
        
        }else {
            System.out.println("PIN Tidak Valid");
        }
            System.out.print("Anda ingin Melanjutkan Transaksi (Yes/No)? ");
            YesNo = in.next();
            
        } while(YesNo.equalsIgnoreCase("Yes"));
        System.out.println("Trasaksi Telah Berakhir");
        }
        
}
        
        