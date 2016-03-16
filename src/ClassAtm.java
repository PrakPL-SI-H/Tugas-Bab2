package MesinAtm;
import java.util.Scanner;
public class ClassAtm {
    int SaldoAwal;
    int Sandi;
    String User;
    int PenarikanATM, JumlahTransfer;
    long rekening;
    String atmAkun[][] = new String[2][2];
    Scanner input = new Scanner(System.in);

    ClassAtm() {
        atmAkun[0][0] = "AMBAR";
        atmAkun[0][1] = "190197";
        atmAkun[1][0] = "COKS";
        atmAkun[1][1] = "090794";
    }

    void CekSandi() {

        int i = 0;
        do {
            System.out.print("Masukan PIN anda : ");
            User = input.next();
            if (i > 1) {
                System.out.println("Maaf, Kartu anda diblokir");
                System.exit(0);
            }
            if (User.equalsIgnoreCase(atmAkun[0][1])) {
                SaldoAwal = 50000000;
                break;
            }
            if (User.equalsIgnoreCase(atmAkun[1][1])) {
                SaldoAwal = 60000000;
                break;
            }
            i++;
        } while (i != 0);

    }

    void InformasiSaldo() {
        System.out.println("Saldo anda sekarang adalah : " + SaldoAwal);
    }

    int PenarikanATM() {
        int i = 0;
        boolean berhasil = false;
        do {
            System.out.print("Masukan nominal: ");
            PenarikanATM = input.nextInt();
if (PenarikanATM >= 50000 && PenarikanATM <= 5000000) {
                if (PenarikanATM % 50000 == 0) {
                    berhasil = false;
                    SaldoAwal = SaldoAwal - PenarikanATM;
                    System.out.println("Transaksi anda berhasil,Silahkan ambil uang anda");
                } else {
                    berhasil = true;
                    System.out.println("Penarikan harus berkelipatan Rp50000");
                }
                if (PenarikanATM > SaldoAwal) {
                    System.out.println("Maaf nominal penarikan melebihi saldo anda");
                }
            } else {
                berhasil = false;
                System.out.println("Penarikan minimal Rp50.000 dan maksimal Rp5000.000");
            }

            i++;
        } while (berhasil);
        return SaldoAwal;
    }

    public void TransferBank() {
        int i = 0;
        do {
            System.out.print("Masukan nomer rekening     : ");
            rekening = input.nextLong();
            System.out.print("Masukan nominal transfer   : ");
            JumlahTransfer = input.nextInt();
            if (JumlahTransfer > SaldoAwal) {
                System.out.println("maaf, saldo anda tidak mencukupi");
                System.out.println("silahkan masukan nominal yang lebih kecil");
            } else {
                System.out.println("transfer berhasil, sebesar : " + JumlahTransfer);
                SaldoAwal = SaldoAwal - JumlahTransfer;
            }
            i++;

        } while (JumlahTransfer > SaldoAwal);
    }

    public void TransferBankLain() {
        int nomertransfer;
        String bankname;

        int i = 0;
        do {
            System.out.print("Masukan nomer rekening     : ");
            rekening = input.nextLong();
            System.out.print("Masukan nama bank          : ");
            bankname = input.next();
            System.out.print("Masukan nominal transfer   : ");
            nomertransfer = input.nextInt();
            if (nomertransfer > SaldoAwal) {
                System.out.println("Maaf, saldo anda tidak mencukupi");
                System.out.println("Silahkan masukan nominal yang lebih kecil");
            } else {
                System.out.println("transfer berhasil, sebesar : " + nomertransfer);
                SaldoAwal = SaldoAwal - nomertransfer;
            }
            i++;
        } while (nomertransfer > SaldoAwal);
    }
}

