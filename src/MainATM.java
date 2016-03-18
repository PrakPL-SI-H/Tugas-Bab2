
import java.util.Scanner;

public class MainATM {

    static Scanner in = new Scanner(System.in);
    static ATM nasabah[] = new ATM[2];

    public static void main(String[] args) {
        int pin, menu, ke = 3, keTF, rekTF;
        boolean pinMatch = false, stop = false;
        String lagi = null;

        nasabah[0] = new ATM("Mirza", 1111111, 12345, 1000000);
        nasabah[1] = new ATM("Emir", 2222222, 54321, 2000000);

        do {
            System.out.println(">>Silahkan Masukkan Kartu ATM Anda<<");
            do {
                System.out.print("Input pin ATM: ");
                pin = in.nextInt();
                for (int i = 0; i < nasabah.length; i++) {
                    if (nasabah[i].pin == pin) {
                        ke = i;
                        pinMatch = true;
                    }
                }
            } while (pinMatch == false);

            System.out.println("Welcome " + nasabah[ke].nama + ",");

            do {
                ATM.showMenu();
                System.out.print("Input pilihan menu: ");
                menu = in.nextInt();
                switch (menu) {
                    case 1:
                        if (nasabah[ke].saldo >= 50000) {
                            System.out.println("Penarikan dengan kelipatan 50000");
                            do {
                                System.out.print("Input nominal: ");
                                nasabah[ke].saldoOUT = in.nextInt();
                            } while (nasabah[ke].cekKelipatan() == false);
                            System.out.print("Anda yakin? (y/n): ");
                            nasabah[ke].konfirmasi(in.next());
                            nasabah[ke].cekSaldo();
                            break;
                        } else {
                            System.out.println("Maaf, saldo Anda tidak mencukupi untuk melakukan tarik tunai");
                            nasabah[ke].cekSaldo();
                            break;
                        }
                    case 2:
                        nasabah[ke].cekSaldo();
                        break;
                    case 3:
                        if (nasabah[ke].saldo > 0) {
                            System.out.println("Transfer ke rekening lain");
                            System.out.print("Input no. rek tujuan: ");
                            rekTF = in.nextInt();
                            System.out.print("Input nominal: ");
                            nasabah[ke].saldoOUT = in.nextInt();

                            for (int i = 0; i < nasabah.length; i++) {
                                if (nasabah[i].rek == rekTF) {
                                    keTF = i;
                                    System.out.println("No. rek tujuan: "+nasabah[keTF].rek);
                                    System.out.println("Nominal transfer: "+nasabah[ke].saldoOUT);
                                    // here 
                                    System.out.print("Anda yakin? (y/n): ");
                                    nasabah[ke].konfirmasi(in.next());
                                    nasabah[keTF].saldo += nasabah[ke].saldoOUT;
                                    nasabah[ke].cekSaldo();
                                    break;                       
                                }
                            }
                            
                        } else {
                            System.out.println("Maaf, Saldo Anda tidak mencukupi untuk melakukan transfer");
                            break;
                        }
                        break;
                    case 4:
                        lagi = "n";
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
                if (menu == 1 || menu == 2 || menu == 3) {
                    System.out.print("Apakah Anda ingin melakukan transaksi lain? (y/n): ");
                    lagi = in.next();
                }
            } while ("y".equalsIgnoreCase(lagi));
            System.out.println("<<Terima kasih... Silahkan ambil kartu ATM Anda.>>");
        } while (stop == false);
    }
}
