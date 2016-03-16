import java.util.Scanner;

public class MesinATM {

    String nama, pin, noRek;
    int saldo, uang;

    public MesinATM(String nama, String pin, String noRek, int saldo) {
        this.nama = nama;
        this.pin = pin;
        this.noRek = noRek;
        this.saldo = saldo;
        uang = 0;
    }

public void getSaldo() {
        System.out.println("Saldo di Rekening anda : " + saldo);

    }

    public void getUang(int uang) {
        this.uang = uang;
        if (saldo > uang) {
            saldo = saldo - uang;
            System.out.println("===========================");
            System.out.println("Penarikan Sebesar : " + uang);
            System.out.println("Sisa Saldo anda saat ini : " + saldo);
        } else {
            System.out.println("Transaksi Di Batalkan, Saldo anda Tidak Cukup");
        }
    }

public void dataTransfer() {
        System.out.println("Nomer Rekening Atas nama " + nama);
    }

    public void setTransfer(int uang) {
        this.uang = uang;
        if (saldo > uang) {
            saldo = saldo - uang;
            System.out.println("Dengan Nomer Rekening: " + noRek);
            System.out.println("Transfer Sebesar : " + uang);
            System.out.println("Saldo Anda saat ini : " + saldo);
        } else {
            System.out.println("Proses Di Batalkan Saldo anda Tidak Cukup");
        }
    }

    public void Transfer(MesinATM a) {
        a.saldo = a.saldo + uang;
    }

}

class mainATM {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String jawab, noRek;
        MesinATM atm = new MesinATM("Rodhi", "301197", "1234567", 1000000);
        MesinATM atm1 = new MesinATM("Anonymous", "150796", "7654321", 2000000);

do {
            System.out.print("Masukan PIN anda : ");
            String pin = inp.next();
            if (pin.equals(atm.pin) || pin.equals(atm1.pin)) {
                System.out.println("============= WELCOME ================");
                System.out.println("1. Tarik Tunai ");
                System.out.println("2. Informasi Saldo ");
                System.out.println("3. Transfer ");
                System.out.println("4. Keluar");
                System.out.print("Pilihan Anda: ");
                int pilihan = inp.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("===Tarik Tunai===");
                        System.out.print("Masukkan Nominal Tarik Tunai : ");
                        if (pin.equals(atm.pin)) {
                            atm.getUang(inp.nextInt());
                        } else {
                            atm1.getUang(inp.nextInt());
                        }
                        break;
                    case 2:
                        System.out.println("===Informasi Saldo===");
                        if (pin.equals(atm.pin)) {
                            atm.getSaldo();
                        } else {
                            atm1.getSaldo();
                        }
                        break;
                    case 3:
                        System.out.println("=====Transfer=====");

                        if (pin.equals(atm.pin)) {
                            System.out.print("Masukkan No.Rek Tujuan    : ");
                            noRek = inp.next();
                            if (noRek.equals(atm1.noRek)) {
                                atm1.dataTransfer();
                                System.out.print("Masukkan Nominal Transfer : ");
                                atm.setTransfer(inp.nextInt());
                                atm.Transfer(atm1);
                            } else {
                                System.out.println("Data Salah");
                            }
                        } else {
                            System.out.print("Masukkan No.Rek Tujuan   : ");
                            noRek = inp.next();
                            if (noRek.equals(atm.noRek)) {
                                atm.dataTransfer();
                                System.out.print("Masukkan Nominal Transfer: Rp. ");
                                atm1.setTransfer(inp.nextInt());
                                atm1.Transfer(atm);
                            } else {
                                System.out.println("Data Salah");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Terimakasih telah menggunakan layanan kami, "
                                + "Silahkan ambil kartu anda ");
                        break;
                    default:
                        System.out.println("Pilihan tidak ditemukan");
                }
            } else {
                System.out.println("Pin Salah ");
            }

            System.out.print("Melanjutkan Transaksi? (Yes/No) ");
            jawab = inp.next();
        } while (jawab.equalsIgnoreCase("Yes"));
    }
}