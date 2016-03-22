package RevisiBab2;

import java.util.Scanner;

public class AtmMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        AtmClass atm = new AtmClass("AmbangMan", "1234", 5000000, "789010");
        AtmClass atm2 = new AtmClass("IqbalAmbang", "2343", 4500000, "123456");
        do {
            System.out.print("Masukan PIN anda: ");
            String pin = in.next();
            if (pin.equals(atm.pin) || pin.equals(atm2.pin)) {
                System.out.println("===========ATM Ambang===============");
                System.out.print("[1] Penarikan          [2] Cek Saldo           ");
                System.out.println();
             
                System.out.print("[3] Transfer           [4] Keluar             ");
                System.out.println();
                System.out.println("====================================");
                System.out.print("Pilihan Anda: ");
                int pilih = in.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("====Penarikan Tunai====");
                        System.out.print("Masukkan Nominal Tarik Tunai: Rp. ");
                        if (pin.equals(atm.pin)) {
                            atm.getUang(in.nextInt());
                        } else {
                            atm2.getUang(in.nextInt());
                        }
                        break;
                    case 2:
                        if (pin.equals(atm.pin)) {
                            atm.getSaldo();
                        } else {
                            atm2.getSaldo();
                        }
                        break;
                    case 3:
                        System.out.println("=====Transfer=====");
                        System.out.print("Masukkan Nama Bank       : ");
                        String namaBank = in.next();
                        if (pin.equals(atm.pin)) {
                            System.out.print("Masukkan No.Rek Tujuan   : ");
                            String norek = in.next();
                            if (norek.equals(atm2.norek)) {
                                atm2.dataTransfer();
                                System.out.print("Masukkan Nominal Transfer: Rp. ");
                                atm.setTransfer(in.nextInt());
                                atm.Transfer(atm2);
                            } else {
                                System.out.println("TidakValid");
                            }
                        } else {
                            System.out.print("Masukkan No.Rek Tujuan   : ");
                            String norek = in.next();
                            if (norek.equals(atm.norek)) {
                                atm.dataTransfer();
                                System.out.print("Masukkan Nominal Transfer: Rp. ");
                                atm2.setTransfer(in.nextInt());
                                atm2.Transfer(atm);
                            } else {
                                System.out.println("TidakValid");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("===Terimakasih===");
                        break;
                    default:
                        System.out.println("Mohon Maaf, Pilihan anda Tidak Valid");
                }
            } else {
                System.out.println("Pin Tidak Valid");
            }
            System.out.print("Melanjutkan Transaksi? (Y/N) ");
            answer = in.next();
        } while (answer.equalsIgnoreCase("Y"));
    }
}
