
package atm;

import java.util.Scanner;


public class Atm {
    private double saldo=1000000;
    private String nama;
    private String pwd;
    
        Atm(String nm, String pas) {
        nama=nm;
        pwd=pas;
    }   
     private Boolean cekPwd(){
            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan nama :");
            String namai=input.next();
            System.out.print("Masukkan password :");
            String pwdi=input.next();
            Boolean o=false;
                if (nama.equals(namai)){
                    if (pwd.equals(pwdi)){
                        o= true;
    }
        }
                        else{
                        o= false;
         }
                        return o;
    }   




   
       
    }
    

