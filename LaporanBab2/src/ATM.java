
public class ATM {
    private String nama;
    private long norek;
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
    public void setNorek(long norrek){
        norek = norrek;
    }
    public long getNorek (){
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
     public void setJumlahTarik (int JT){
         jumlahTarik = JT;
     }
     public int getJumlahTarik (){
         return jumlahTarik;
     }
     public void tarikSaldo(){
         if (saldo > 50000){
             if ((saldo - 50000)>=jumlahTarik){
                 if (jumlahTarik % 50000 == 0){
                     saldo -= jumlahTarik;
                     System.out.println("Transaksi Anda Berhasil, Sisa Saldo Anda Adalah Rp. "+saldo);
                 }else { System.out.println("Maad Anda Gagal Melakakukan Transaksi, Silahkan Coba Lagi Dengan Kelipatan Rp. 50000");
             }
         }else { System.out.println("Saldo Anda Kurang Untuk Melakukan Transaksi Ini");
             }
     }else { System.out.println("Saldo Anda Kurang Untuk Melakukan Transaksi Ini");
             }    
       }
     public void setJumlahTransfer (int JTR){
         jumlahTransfer = JTR;
     }
     public int jumlahTransfer(){
         return jumlahTransfer;
     }
     public void transferUang(){
         if (saldo > 500000){
             if ((saldo-50000)>= jumlahTransfer){
                 saldo -= jumlahTransfer;
                 System.out.println("Uang Anda Berhasil Dikirim");
                 System.out.println("Jumlah Saldo Anda Saat Ini Adalah : Rp. "+saldo);
             } else {System.out.println("Saldo Anda Kurang Untuk Melakukan Transaksi Ini");
             }
         }else {System.out.println("Saldo Anda Kurang Untuk Melakukan Transaksi Ini");}
     }
     public void menuPertama (){
         System.out.println("\nPILIH JUMLAH PAKET TUNAI\n");
         System.out.printf("%s %30s\n","1. <= 50.000 ","500.000 => 5.");
         System.out.printf("%s %30s\n","2. <= 100.000","750.000 => 6.");
         System.out.printf("%s %30s\n","3. <= 200.000","1000.000 => 7.");
         System.out.printf("%s %30s\n","4. <= 300.000","TRANSAKSI LAIN => 8.");
         
     }
     public void menuKedua (){
         System.out.println("\nPILIH JENIS TRANSAKSI\n");
         System.out.printf("%s %30s\n","1.<= INFO SALDO", "TRANSFER =>3.");
         System.out.printf("%s %30s\n","2.<= PENARIKAN ", "KELUAR =>4.");
         
     }
     public boolean seleksiLagi (int kodelagi){
         return (kodelagi==1);
     }
     public void seleksimenuPertama (int pil1){
         switch (pil1){
             case 1 : jumlahTarik = 50000;
                 tarikSaldo();
                 break;
             case 2 : jumlahTarik = 100000;
                 tarikSaldo();
                 break;
             case 3 : jumlahTarik = 200000;
                 tarikSaldo();
                 break;
             case 4 : jumlahTarik = 300000;
                 tarikSaldo();
                 break;
             case 5 : jumlahTarik = 500000;
                 tarikSaldo();
                 break;
             case 6 : jumlahTarik = 750000;
                 tarikSaldo();
                 break;
             case 7 : jumlahTarik = 1000000;
                 tarikSaldo();
                 break;
             default : System.out.println("PILIHAN YANG ANDA MASUKKAN SALAH");
                 break;
         }
     }
            
    
}
