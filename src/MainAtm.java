/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainatm;

import java.util.Scanner;


public class MainAtm {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Atm mesin= new Atm("toni","123");
        int s=2;
        for (int i = 0; i < 1; i++) {
        if (mesin.cekPwd()){
          for (int u = 0; u < 1; u++) {
            System.out.println("Menu :");
            System.out.println("1. Info saldo");
            System.out.println("2. Penarikan");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");
              int tbl=input.nextInt();
         switch(tbl){
            case 1:
                mesin.infoSaldo();
                u--;
           break;
            case 2:
                mesin.penarikan();
                 u--;
            break;
            case 3:
              System.out.println("1. Bank sama \n2. Luar \n3. Batalkan");
              int ms=input.nextInt();
              int noreki;
              String nmBanki;
              double jmli;
         switch(ms){
             case 1:
               System.out.print("Nomor rekening tujuan : ");
               noreki=input.nextInt();
               System.out.print("Jumlah uang yang akan dikirim : Rp.");
               jmli=input.nextInt();
               mesin.transfer(noreki, jmli);
             break;
             case 2:
               System.out.print("Nomor rekening tujuan : ");
               noreki=input.nextInt();
               System.out.print("Nama bank tujuan : ");
               nmBanki=input.next();
               System.out.print("Jumlah uang yang akan dikirim : Rp");
               jmli=input.nextInt();
               mesin.transfer(noreki, nmBanki, jmli);
              break;
              default:
             break;
      }
                u--;
                break;
                default:
                break;
     }
          }
            }
                else{
                System.out.println("! Paassword salah");
                
            }
        }

    }
    
}
