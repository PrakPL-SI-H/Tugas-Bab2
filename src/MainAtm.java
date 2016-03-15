//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugas1.pkg2;

import java.util.Scanner;

public class MainAtm{

    public static void main(String[] args) {
        int password, pilih;
        
        Atm atm = new Atm();
        Atm atm2 = new Atm();
        
        Scanner in = new Scanner(System.in);
        System.out.println("====SELAMAT DATANG=====");
        System.out.println("====DI BANK FELIX======");
        System.out.print("Masukkan password : ");
        password = in.nextInt();
        System.out.println("");
        if (password == 123456) {
            do {
                System.out.println("MENU");
                System.out.println("1. Melihat Saldo");
                System.out.println("2. Menarik Uang");
                System.out.println("3. Mentransfer ke rekening lain");
                System.out.println("0. Exit");
                System.out.print("Masukkan pilihan : ");
                pilih = in.nextInt();
                
                switch(pilih){
                    case 1:
                        atm.lihatSaldo();
                        System.out.println("");
                        break;
                    case 2:
                        System.out.print("Masukkan uang : ");
                        atm.tarikUang(in.nextInt());
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Masukkan no rek tujuan : ");
                        atm2.rek = in.nextInt();
                        System.out.print("Masukkan jumlah uang : ");
                        atm.kirim = in.nextInt();
                        atm.transferUang(atm2);
                        System.out.println("");
                        break;
                    case 0 :
                        System.out.println("Terima kasih");
                        break;
                    default :
                        System.out.println("Maaf pilihan tidak ada");
                        break;
                }
            } while (pilih != 0);
        } else {
            System.out.println("Password anda salah");
        }

    }

}
