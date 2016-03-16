import java.util.Scanner;

public class MesinATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ATM bank = new ATM();
        System.out.println("========SELAMAT DATANG DI ATM BANK ATIKAH========\n");
        System.out.print("Masukkan password: ");
        bank.setPassword(in.nextInt());
        System.out.println("No rekening: 1100 7854 8944 9009"+"\nAtas nama  : Atikah Febrianti Nastiti");

        do {
            System.out.println("\n=======================");
            System.out.println("      MENU UTAMA");
            System.out.println("=======================");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan anda: ");
            int pil = in.nextInt();

            switch (pil) {
                case 1: {
                    bank.setSaldo("Rp. " , 9500000);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan nominal angka: Rp. ");
                    int tunai = in.nextInt();
                    bank.tarikTunai(tunai);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan rekening tujuan: ");
                    String rek = in.nextLine();in.nextLine();
                    System.out.print("Masukkan nominal angka: Rp. ");
                    double t = in.nextDouble();
                    System.out.println("\nTransfer berhasil");
                    System.out.println("Saldo anda saat ini: "+bank.transfer(t));
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }

            }
        } while (true);
    }
}
