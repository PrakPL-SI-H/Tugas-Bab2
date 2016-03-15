
package soalATM;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class MainATM {

    
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        ATM mesin= new ATM("Tegar","123");
        int s=2;
        for (int i = 0; i < 1; i++) {
            if (mesin.cekPassword()){
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
                }
            }
        }
    }
}
}

 