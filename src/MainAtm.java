package tugas1.pkg2;

import java.util.Scanner;

public class MainAtm{

    public static void main(String[] args) {
        int password, pilih;
        Atm atm = new Atm();
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan password : ");
        password = in.nextInt();
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
                        break;
                    case 2:
                        atm.tarikUang();
                        break;
                    case 3:
                        atm.transferUang();
                        break;
                }
            } while (pilih != 0);
        } else {
            System.out.println("Password anda salah");
        }

    }

}
