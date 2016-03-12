/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpl;

import java.util.Scanner;

/**
 *
 * @author Prasetyo
 */
public class MainAtm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm ini =new Atm();
        int pin;
        int pilih ;
        System.out.println("Selamat Datang Di ATM Bank PRS");
        System.out.print("Masukkan pin= ");
        pin =in.nextInt();
        if(pin==1996){
            do{
            System.out.println("Menu ATM Bank PRS");
            System.out.println("1.Ambil Uang");
            System.out.println("2.Cek Saldo");
            System.out.println("3.Transfer");
            System.out.println("4.Keluar");
            System.out.println("Masukkan Pilihan Anda = ");
            pilih = in.nextInt();
            switch(pilih){
                case 1 :
                case 2 :
                case 3 :
            }
            }while(pilih   !=4);
        }else{
            System.out.println("pin yang ada masukkan salah");
        }  
    }
}
