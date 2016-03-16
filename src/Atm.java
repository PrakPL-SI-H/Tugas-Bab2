import java.util.Scanner;

public class Atm {

    String nama, norek;
    int pin;
    private int saldo = 2000000;
    Scanner in = new Scanner(System.in);

    public Atm(String nama, String norek, int pin) {
        this.nama = nama;
        this.norek = norek;
        this.pin = pin;
    }

    public void setPIN() {
        this.pin = pin;
    }

    public int getPIN() {
        return pin;
    }

    public void tarikTunai() {
        boolean valid;
        int tarik;
        do {
            System.out.println("==========PENARIKAN TUNAI==========");
            System.out.print("\nMasukkan jumlah uang : ");
            tarik = in.nextInt();
            if (tarik <= 200000) {
                if (saldo > tarik) {
                    saldo -= tarik;
                    System.out.println("Penarikan uang tunai sebesar Rp. " + tarik + " berhasil dilakukan.");
                    valid = false;
                } else {
                    System.out.println("Maaf, saldo tidak mencukupi untuk penarikan tunai.");
                    valid = true;
                }
            } else {
                System.out.println("Batas sekali penarikan adalah Rp. 100000");
                valid = true;
            }
        } while (valid);
    }

    public void cekSaldo() {
        System.out.println("Sisa saldo Anda : Rp. " + saldo);
    }

    public void transferUang() {
        boolean valid = false;
        System.out.println("========== Transfer Uang ==========");
        System.out.print("Masukkan nomor rekening tujuan : ");
        int rek = in.nextInt();
        do {
            System.out.print("Masukkan jumlah uang : ");
            int jlh = in.nextInt();
            if (jlh < saldo) {
                System.out.println("Transfer berhasil dilakukan.");
                System.out.println("No. Rekening : " + rek);
                System.out.println("Jumlah uang : Rp. " + jlh);
                this.saldo -= jlh;
            } else {
                System.err.println("Maaf, saldo tidak mencukupi untuk melakukan transaksi.");
                valid = true;
            }
        } while (valid);
    }

    public void Menu() {
        System.out.println("\nNama nasabah : " + this.nama);
        System.out.println("No. Rekening : " + this.norek);
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Penarikan Tunai");
        System.out.println("3. Transfer Uang");
        System.out.println("4. Keluar");
        boolean valid;
        do {
            System.out.print("Masukkan pilihan menu : ");
            int pil = in.nextInt();
            valid = false;
            switch (pil) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikTunai();
                    break;
                case 3:
                    transferUang();
                    break;
                default:
                    System.out.println("\n\nTerima kasih telah menggunakan ATM BAHAGIA.");
                    System.exit(0);
                    break;
            }
            System.out.print("\nApakah Anda ingin melanjutkan ? [Y/T] ");
            String validasi = in.next();
            if (validasi.equalsIgnoreCase("Y")) {
                Menu();
            } else {
                System.out.println("\n\nTerima kasih telah menggunakan ATM BAHAGIA.");
                System.exit(0);
            }
        } while (valid);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm mesin = new Atm("Dorothy", "123456789", 1697);
        System.out.println("|||\tSelamat datang di ATM BAHAGIA\t|||\n");
        boolean valid = false;
        int tes = 1;
        do {
            System.out.print("Masukkan PIN : ");
            int pin = in.nextInt();
            if (tes < 3) {
                if (pin == mesin.getPIN()) {
                    mesin.Menu();
                } else {
                    System.err.println("Maaf, password yang Anda masukkan salah.");
                    int i = 3 - tes;
                    System.out.println("Silahkan masukkan PIN kembali (" + i + "kali)\n");
                    valid = true;
                }
            } else {
                System.out.println("Maaf, Anda telah melebihi batas memasukkan PIN.");
                System.err.println("Kartu ATM Anda telah diblokir\n");
                System.exit(0);
            }
            tes++;
        } while (valid);
        System.out.println("\n\nTerima kasih telah menggunakan ATM BAHAGIA");
    }
}