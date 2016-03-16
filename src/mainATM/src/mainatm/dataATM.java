/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainatm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class dataATM {
    Scanner in = new Scanner (System.in);
    ATM atm = new ATM();
    MainATM main = new MainATM();
    double minSaldo = 50000;
    int pil;
    
    public void asal(){
    atm.setSaldo(5000000);
    login();
    }
    public void login(){
       int pin;
        System.out.println("====================================");
        System.out.println("|   Selamat datang di ATM bank JFE  |");
        System.out.println("");
        System.out.println("====================================");
        System.out.print("Masukkan PIN anda : ");
        pin = in.nextInt();
        if (atm.getPin()==pin) {
            menu();}
        else {System.out.println("Pin salah, ulangi lagi");
        login();}
            
        }
    public void menu(){
        System.out.println("=====================================");
        System.out.println("|   >> Pilih Transaksi <<   |");
        System.out.println("");
        System.out.println("|   (1).Cek Saldo       (2).Transfer    |");
        System.out.println("");
        System.out.println("|   (3).Tarik Tunai     (4).Keluar      |");
        System.out.println("");
        System.out.println("=====================================");
        System.out.print("        Masukkan Pilihan Anda : ");
        pil = in.nextInt();
        switch (pil) {
            case 1 : lihatSaldo();break;
            case 2 : transfer();break;
            case 3 : tarik();break;
            case 4 : System.out.println("=============================");
                System.out.println("Terima Kasih telah menggunakan layanan kami \n Silahkan ambil kartu ATM anda");
                break;
            default : System.out.println("Pilihan angka yang anda masukkan tidak sesuai silahkan login kembali");
                      login();break;
        }              
        
                      
    }
    public void lihatSaldo(){
    dataATM data = new dataATM();
        System.out.println("============================");
        System.out.println("|        Cek Saldo         |");
        System.out.println("============================");
        System.out.println("Sisa Saldo anda sebesar Rp. "+ atm.getSaldo());
        transaksiLagi();
    
    }
    public void transfer(){
        int norek;
        double nom;
        System.out.println("============================");
        System.out.println("|         Transfer         |");
        System.out.println("============================");
        System.out.print("    Masukkan Nomor Rekening : ");
        norek = in.nextInt();
        System.out.print("    Masukkan Nominal Transfer : ");
        nom = in.nextDouble();
        transferNominal(nom,norek);
        
    }
    public void transferNominal(double nom,int norek){
        double saldo = atm.getSaldo();
        if (atm.getSaldo()<=50000){
            System.out.println("Saldo anda tidak mencukupi");        
        }
        else{saldo -= nom;
        if (saldo < minSaldo){
            System.out.println("    Jumlah transfer melebihi batas saldo");
            System.out.println("    Sisa saldo tidak mencukupi");}
        else{atm.setSaldo(saldo);
            System.out.println("    Anda berhasil melakukan transfer sebesar : "+nom);
            System.out.println("    Ke nomer rekening : "+norek);
            System.out.println("    Sisa Saldo anda sekarang : "+saldo);}
        }transaksiLagi();
    }
    public void tarik(){
        double penarikan;
        System.out.println("=================================");
        System.out.println("|       Penarikan Tunai         |");
        System.out.println("=================================");
        System.out.println("|       >> Pilih Nominal <<     |");
        System.out.println("|   (1).Rp. 100.000     (2).Rp.200.000    |");
        System.out.println("|   (3).Rp. 500.000     (4).Rp.1.000.000  |");
        System.out.println("|   (5).Rp. 1.500.000   (6).Rp.2.000.000  |");
        System.out.println("=================================");
        System.out.print("    Masukkan pilihan anda :   ");
        pil = in.nextInt();
        System.out.println("=================================");
        switch (pil){
            case 1:tarikNominal(100000);break;
            case 2:tarikNominal(200000);break;
            case 3:tarikNominal(500000);break;
            case 4:tarikNominal(1000000);break;
            case 5:tarikNominal(1500000);break;
            case 6:tarikNominal(2000000);break;
            default : System.out.println("  Pilihan yang anda masukkan salah    ");
            tarik();    
        }
    }
    public void tarikNominal (double nominal){
        double saldo = atm.getSaldo();
        if (atm.getSaldo()<50000){
            System.out.println("    Penarikan terlalu besar\n"
                    + "Maaf saldo anda tidak mencukupi     ");          
        }
        else {saldo -= nominal;
        if (saldo<minSaldo){
            System.out.println("    Maaf, jumlah penarikan terlalu besar\n"
                    + "    Sisa saldo tidak mencukupi");
        }else{
        atm.setSaldo(saldo);
            System.out.println("    Anda telah melakukan penarikan sebesar : "+ nominal);
            System.out.println("    Sisa saldo anda adalah : "+saldo);
            }
        }
        transaksiLagi();
    }
    public void transaksiLagi(){
        String peringatan;
        System.out.println("=======================================");
        System.out.println("Apakan anda ingin melakukan transaksi lagi ? (Y)/(N) ");
        peringatan = in.nextLine();
        System.out.println("");
        if (peringatan.equalsIgnoreCase("Y")){
        login();}
        else if(peringatan.equalsIgnoreCase("N")){
            System.out.println("======================================");
            System.out.println("    Terimakasih telah menggunakan layanan kami  ");
            System.out.println("    Silahkan ambil kartu anda kembali   ");
        }
    }
}

