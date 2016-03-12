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
        Scanner in = new Scanner(System.in);
        ATM atm = new ATM("Nofry Arman","1234",5000000,"098765");
        ATM atm2 = new ATM("Rakha","2343",4500000,"123456");
        System.out.print("Masukan PIN anda: "); 
        String pin = in.next();
        if(pin.equals(atm.pin) || pin.equals(atm2.pin)){
        System.out.println("=============ATM BCA================");
        System.out.println("1. Penarikan Tunai ");
        System.out.println("2. Informasi Saldo ");
        System.out.println("3. Transfer Bank");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda: ");
        int pilih = in.nextInt();
        switch (pilih){
            case 1:
                System.out.println("====Penarikan Tunai====");
                System.out.print("Masukkan Nominal Tarik Tunai: Rp. ");
                if(pin.equals(atm.pin)){
                    atm.getUang(in.nextInt());
                }
                else{
                    atm2.getUang(in.nextInt());
                }
                break;
            case 2:
                if(pin.equals(atm.pin)){
                    atm.getSaldo();
                }
                else{
                    atm2.getSaldo();
                }
                break;
            case 3:
                System.out.println("=====Transfer=====");
                System.out.print("Masukkan Nama Bank       : ");
                String namaBank = in.next();
                if(pin.equals(atm.pin)){
                    System.out.print("Masukkan No.Rek Tujuan   : ");
                    String noRek = in.next();
                    if(noRek.equals(atm2.noRek)){
                        atm2.dataTransfer();
                        System.out.print("Masukkan Nominal Transfer: Rp. ");
                        atm.setTransfer(in.nextInt());
                        atm.Transfer(atm2);}
                    else{
                        System.out.println("TidakValid");
                    }
                }
                else{
                    System.out.print("Masukkan No.Rek Tujuan   : ");
                    String noRek = in.next();
                    if(noRek.equals(atm.noRek)){
                        atm.dataTransfer();
                        System.out.print("Masukkan Nominal Transfer: Rp. ");
                        atm2.setTransfer(in.nextInt());
                        atm2.Transfer(atm);}
                    else{
                        System.out.println("TidakValid");
                    }
                }
                break;
            case 4: 
                System.out.println("===Terimakasih===");
                break;
            default:
                System.out.println("Mohon Maaf, Pilihan anda Tidak Valid");      
        }
        }
        else{
            System.out.println("Pin Tidak Valid");
        }    
    }
    
}
