
import java.util.Scanner;

public class LatihanBab2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Nasabah user = new Nasabah();
        boolean usr = false;
        do {
            System.out.println("Anjungan Tunai Jomblo");
            System.out.print("No. Rekening= ");
            String norek = in.next();
            System.out.print("Pin         = ");
            String pin = in.next(); //nim
            for (int i = 0; i < user.nasabah.length; i++) {
                if ((norek.equals(user.nasabah[i][0]) && pin.equals(user.nasabah[i][1]))) {
                    System.out.println("=======================================");
                    if (i == 1) {
                        user = new Nasabah(1)
                    }
                    user.showData(i);
                    usr = true;
                } 
            }
            if (usr = false){
                System.out.println("Data Tidak Ditemukan");
            }
        } while (user != true);
        
        int pilihan;
        String batas = ("----------------------------------------------------");
        do {
            System.out.printf("%.40s\n", batas);
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            System.out.printf("%.40s\n", batas);
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda Saat ini");
                    user.nsbhproses.showSaldo();
                    break;
                case 2:
                    System.out.println("\tTARIK TUNAI");
                    System.out.print("Masukan Jumlah Penarukan = ");
                    user.nsbhproses.saldoKurang(in.nextInt());
                    System.out.println("Penarikan berhasil");
                    break;
                case 3:
                    System.out.println("\Transfer");
            }
            
        }
