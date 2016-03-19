
import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
   Scanner input = new Scanner (System.in);
   
   int pil1,pil2,i=0;
   char pil;
   int pilihan,saldo;
   ATM nasabah []= new ATM [100];
   String nip;
   String noRekTrans;
   
   do {
       nasabah [i] = new ATM();
       System.out.println("==========Daftar Disini==========");
       System.out.print("Masukkan Nama\t\t: ");
       nasabah[i].setNama(in.nextLine());
       System.out.print("Masukkan Nomor Rekening\t: ");
       nasabah[i].setNorek(in.nextLine());
       System.out.print("Masukkan PIN\t\t: ");
       nasabah[i].setPin(in.nextLine());
       System.out.print("Masukkan Saldo Awal Anda: Rp ");
       nasabah[i].setSaldo(in.nextInt());
       i++;
       System.out.print("Apakah Anda ingin mendaftar lagi? (y/t)");
       pil = in.next().toUpperCase().charAt(0);
       in.nextLine();
       System.out.print("");
   }while (pil != 'T');
        System.out.println("");
        System.out.println("SELAMAT DATANG DI LAYANAN ATM BANK FORZA");
        System.out.println("CALL CENTER BANK FORZA : (021) 320111");
        System.out.println("DIMOHON TIDAK MENGHUBUNGI NOMOR LAIN SELAIN NOMOR DI ATAS");
        System.out.printf("%75s","LANJUTKAN ==> ENTER");
        input.nextLine();
        
        int x = 0;
        System.out.print("MASUKKAN PIN ANDA\t : ");
        nip = in.nextLine();
        for (x=0;x<1;x++){
            if (nip.equals(nasabah[x].pin)){
                nasabah[x].menuPertama();
                System.out.print("Masukkan Pilihan Anda : ");
                pil1 = in.nextInt();
                if (pil1==8){
                   do {
                        nasabah[x].menuKedua();
                        pilihan = in.nextInt();
                        switch (pilihan){
                            case 1 : 
                            nasabah[x].showSaldo();
                                break;
                            case 2 : 
                                System.out.print("Masukkan Jumlah Uang Yang Ingin Diambil (Kelipatan RP. 50.000) : Rp. ");
                                nasabah[x].setJumlahTarik(in.nextInt());
                                nasabah[x].tarikSaldo();
                                break;
                            case 3 : 
                                System.out.print("Masukkan Nomor Rekening Yang Dituju\t\t: ");
                                noRekTrans = in.nextLine();
                                in.nextInt();
                                System.out.print("Masukkan Jumlah Uang Yang Akan Ditransfer\t: RP. ");
                                nasabah[x].setJumlahTransfer(in.nextInt());
                                nasabah[x].transferUang();
                                break;
                            case 4 : 
                                System.out.println("TERIMA KASIH TELAH MENGGUNAKAN LAYANAN BANK FORZA");
                                break;
                            default : System.out.println("Maaf Pilihan Yang Anda Masukkan Salah Silahkan Coba Lagi");                     
                        }
                        if (pilihan ==4 ){
                            return;
                        }else {
                            System.out.println("Ingin Melakukan Transaksi Lagi?\n"
                                    + "1. Ya\n"
                                    + "2. Tidak");
                            System.out.print("Pilihan Anda : ");
                            pil2 = in.nextInt();
                            nasabah[x].seleksiLagi(pil2);
                            if (nasabah[x].seleksiLagi(pil2)==false){
                                System.out.println("TERIMA KASIh TELAH MENGGUNAKAN LAYANAN BANK FORZA");
                                return;
                            }else {continue;
                            }
                        }
                   }while (pilihan!=4);
                }else { nasabah[x].seleksimenuPertama(pil1);
                    break;
                }
            }else {if (x==(i-1)){
                System.out.println("PIN YANG ANDA MASUKKAN SALAH, SILAHKAN COBA LAGI");
            }else {continue;
            }
        } 
        }
}
}
