package MesinAtm;
import java.util.Scanner;
public class MainAtm {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassAtm data = new ClassAtm();
        int u;
        System.out.println("==========================================");
        System.out.println("|        **** ATM Bank AMBAR ****        |");
        System.out.println("==========================================");
        data.CekSandi();
        do {
            System.out.println("\n========Menu Pilihan========");
            System.out.println("=>1.Informasi Saldo");
            System.out.println("=>2.Tarik Tunai");
            System.out.println("=>3.Transfer");
            System.out.println("-----------------------------");
            System.out.print("Masukan pilihan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\n=== INFORMASI SALDO ===");
                    data.InformasiSaldo();
                    break;
                case 2:
                    System.out.println("\n=== TARIK TUNAI ===");
                    data.PenarikanATM();
                    break;
                case 3:
                    System.out.println("\n=== TRANSFER ===");
                    System.out.println("1.Transfer Antar Bank");
                    System.out.println("2.Transfer ke Bank lain");
                    System.out.println("-----------------------------");
                    System.out.print("Masukan pilihan : ");
                    int pil = input.nextInt();
                    switch (pil) {
                        case 1:
                            data.TransferBank();
                            break;
                        case 2:
                            data.TransferBankLain();
                            break;
                    }
            }
            System.out.print("===========================================\n");
            System.out.print("Ingin melakukan transaksi lagi 1.Ya 2.Tidak :");
            u = input.nextInt();
            System.out.print("----------------------------------------------\n");

        } while (u != 2);
System.out.println("Terima kasih, silakan mengambil kartu ATM anda");
    }
}
