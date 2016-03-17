import java.util.Scanner;
public class atm {
    Scanner in = new Scanner(System.in);
    private int pass;
    private final String nama;
    private int saldo = 5000000;
    public atm(String n, int p) {
        nama = n;
        pass = p;
    }
    public void inputPass(int p) {
        boolean valid;
        do {
            System.out.println("Masukkan PIN (6 digit)");
            int pin = in.nextInt();
            if (pin >= 100000 && pin <= 999999) {
                displayMenuATM();
                valid = false;
            } else {
                System.err.println("PIN tidak terdaftar");
                valid = true;
            }
            System.out.println("Ulang");
        } while (valid);
    }
    public void cekSaldo() {
        System.out.println("Sisa Saldo : RP." + this.saldo);
    }
    public void tarik() {
        int tarik;
        boolean valid;
        do {
            System.out.println("Masukkan Jumlah Nominal");
            System.out.println("(kelipatan 50.000)");
            tarik = in.nextInt();
            if (tarik % 50000 == 0) {
                if (tarik <= saldo) {
                    System.out.println("Anda telah melakukan penarikana dengan nominal RP." + tarik);
                    System.out.println("Sisa Saldo Anda : Rp." + (saldo - tarik));
                    valid = false;
                } else {
                    System.err.println("Saldo tidak mencukupi");
                    valid = true;
                }
            } else {
                System.out.println("Nominal Salah");
                valid = true;
            }
        } while (valid);
    }
    public void transfer() {
        boolean valid = false;
        do {
            System.out.println("Masukkan Nomor Rekening Tujuan");
            int rek = in.nextInt();
            System.out.print("Masukkan Jumlah Nominal ");
            int nominal = in.nextInt();
            if (nominal > 0) {
                if (nominal < this.saldo) {
                    System.out.println("\tTransfer Berhasil");
                    this.saldo -= nominal;
                } else {
                    System.out.println("Saldo tidak mencukupi");
                    valid = true;
                }
            } else {
                System.out.println("Nominal transfer uang harus lebih dari Rp0.");
                valid = true;
            }
        } while (valid);
    }
    private void displayMenuATM() {
        System.out.println(this.nama);
        System.out.println("   Menu");
        System.out.println("1. Informasi Saldo");
        System.out.println("2. Penarikan Tunai");
        System.out.println("3. Transfer");
        System.out.println("4. Keluar");
        boolean valid;
        do {
            System.out.print("Masukkan pilihan anda ");
            int pilihan = in.nextInt();
            if ((pilihan <= 4) & (pilihan > 0)) {
                valid = false;
                switch (pilihan) {
                    case 1:
                        cekSaldo();
                        break;
                    case 2:
                        tarik();
                        break;
                    case 3:
                        transfer();
                        break;
                    default:
                        System.out.println("TERIMA KASIH");
                        System.exit(0);
                        break;
                }
                System.out.println("");
                System.out.println("Apa anda ingin melakukan transaksi lagi?");
                System.out.println("[1].Yes ");
                System.out.println("[2].NO");
                String transaksi = in.next();
                if (transaksi.equalsIgnoreCase("1")) {
                    displayMenuATM();
                } else {
                    System.out.println("TERIMA KASIH");
                    System.exit(0);
                }
            } else {
                System.out.println("Pilihan tidak tersedia");
                valid = true;
            }
        } while (valid);
    }
}
