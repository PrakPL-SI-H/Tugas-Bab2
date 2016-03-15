
package soalATM;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class ATM {
    private double saldo=1000000;
    private String nama;
    private String password;

    ATM(String nm, String pas) {
        nama=nm;
        password=pas;
    }
    
    Boolean cekPassword(){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama :");
        String namai=input.next();
        input.next();
        System.out.print("Masukkan password :");
        String passwordi=input.next();
        Boolean o=false;
        if (nama.equals(namai)){
            if (password.equals(passwordi)){
                o= true;
            }
        }else{
            o= false;
        }
        return o;
    }
    
}