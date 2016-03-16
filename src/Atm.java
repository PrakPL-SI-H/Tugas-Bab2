
package mainatm;

import java.util.Scanner;


class Atm {
     private double saldo=1000000;
    private String nama;
    private String pwd;
    
        Atm(String nm, String pas) {
        nama=nm;
        pwd=pas;
    }   
     public Boolean cekPwd(){
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
                        return o; }
     
        public double infoSaldo(){
                System.out.println("Saldo anda : Rp."+saldo);
                return saldo;
    }
        public double penarikan(){
            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan jumlah penarikan : Rp");
            double tarik=input.nextDouble();
            double out=0;
                if (tarik>saldo){
                    System.out.println("saldo tidak mencukupi");
        }
                else{
                    System.out.println("user telah melakukan penarikan sejumlah Rp."+tarik);
                saldo-=tarik;
                out= saldo;
        }
                return out;
    }
    
        void transfer(int norek, double jml){
            if (saldo>jml){
            saldo-=jml;
                System.out.println("user telah melakukan transfer sejumlah Rp."+ jml +" pada nomor rekening "+ norek);
            }
            else{
                System.out.println("saldo tidak mencukupi");
        }
    }
        void transfer(int norek, String nmBank, double jml){ 
            if (saldo>jml){
            saldo-=jml;
                System.out.println("user telah melakukan transfer sejumlah Rp."+ jml +" pada nomor rekening "+ norek +" pada bank "+ nmBank);
    }
            else{
                System.out.println("saldo tidak mencukupi");
                
            }
        }
}
