/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */
public class LatihanBab2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        TugasPraktikum2 satu = new TugasPraktikum2();
        System.out.println("ATM BDA (Tarikan Tunai 100.000)");
        System.out.print("Masukkan Nomer PIN anda : ");
        String pin = input.nextLine();
        if (pin == satu.pin()) {
            System.out.println("PIN anda salah. Program berhenti..");
            System.exit(0);
        } else {
            int num;
            do {
                System.out.println("Menu ATM");
                System.out.println("1. Melihat Saldo");
                System.out.println("2. Transfer Uang");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Hentikan Program");
                System.out.print("Masukkan Pilihan Anda : ");
                num = input.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Sisa Saldo Anda adalah : " + satu.saldo());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Masukkan nomer rekening : ");
                        satu.rek= input.next();
                        System.out.print("Masukkan jumlah Nominal : ");
                        satu.nom = input.nextInt();
                        satu.transferRekening();
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Masukkan Jumlah Tarikan :  ");
                        satu.salkel=input.nextInt();
                        satu.tarikUang();
                        System.out.println();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Nomor yang anda pilih tidak ada dalam pilihan.");
                }
            } while (num != 4);
        }
    }    
        
    public class TugasPraktikum2 {
    String pin;
    int saldo, nom, salkel;
    String rek;
    public TugasPraktikum2() {
        pin = "000111";
        saldo = 5000000;
    }
    String pin() {
        return pin;
    }
    int saldo() {
        return saldo;
    }
    void tarikUang() {
        if (saldo < salkel) {
            System.out.println("Maaf, Saldo anda tidak cukup. Saldo Anda saat ini sebanyak " + saldo);
        } else {
            System.out.println("Silahkan Mengambil Uang.");
            System.out.println("Saldo anda sekarang " + (saldo=saldo-salkel));
        }
    }
    void transferRekening() {
        if (saldo < nom) {
            System.out.println("Saldo Anda tidak mencukupi. Saldo anda saat ini adalah " + saldo);
        } else {
            System.out.println("Anda telah transfer uang sebanyak " + nom + " kepada rekening " + rek);
            System.out.println("Saldo Anda Sekarang "+(saldo=saldo-nom));
        }
    }
}    
    
    
}
