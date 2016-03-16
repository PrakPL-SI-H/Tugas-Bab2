
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
    double infoSaldo(){
        System.out.println("Saldo anda : Rp." +saldo);
        return saldo;
    }
    
    protected double penarikan(){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan : Rp ");
        double tarik=input.nextDouble();
        double out=0;
        if (tarik>saldo){
            System.out.println("saldo tidak mencukupi");
             System.out.println("Sisa saldo anda adalah Rp" +saldo);
        }else{
            System.out.println("user telah melakukan penarikan sejumlah Rp." +tarik);
            saldo-=tarik;
            out= saldo;
             System.out.println("Sisa saldo anda adalah Rp" +saldo);
        }
        return out;
    }
    void transfer(int norek, double jml){
        if (saldo>jml){
            saldo-=jml;
            System.out.println("user telah melakukan transfer sejumlah Rp."+ jml +" pada nomor rekening "+ norek);
            System.out.println("Sisa saldo anda adalah Rp" +saldo);
        }else{
            System.out.println("saldo tidak mencukupi");
            System.out.println("Sisa saldo anda adalah Rp" +saldo);
        }
    }
    
    void transfer(int norek, String nmBank, double jml){
        
        if (saldo>jml){
            saldo-=jml;
            System.out.println("user telah melakukan transfer sejumlah Rp." + jml +" pada nomor rekening "+ norek +" pada bank "+ nmBank);
             System.out.println("Sisa saldo anda adalah Rp" +saldo);
        }else{
            System.out.println("saldo tidak mencukupi"); 
             System.out.println("Sisa saldo anda adalah Rp" +saldo);
}
    }
}
