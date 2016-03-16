package ATM;
import java.util.Scanner;
public class mesinATM {
    Scanner sc = new Scanner(System.in);
    public byte pil;
    String nama;
    String id;
    int pin;
    long saldo;
    int inPin;
    String inID;
    public mesinATM(String inNama, String inID, int inPin, long inSaldo) {
        this.nama = inNama;
        this.id = inID;
        this.pin = inPin;
        this.saldo = inSaldo;
    }
    public long setSaldo() {
        return this.saldo;
    }
    public boolean periksaPin(int inPin) {
        if (inPin == this.pin) {
            return true;
        } else {
            return false;
        }
    }
    public void kataPenutup() {
        System.out.println("****************************");
        System.out.println("TERIMA KASIH TELAH MELAKUKAN");
        System.out.println("   TRANSAKSI\n"  );
        System.out.println(" SILAHKAN AMBIL KARTU ANDA");
        System.out.println("****************************");
    }
    public void transaksiUlang() {
        System.out.println("Mau Transaksi lagi? ");
        System.out.println("[y] Ya    [n] Tidak");
        System.out.print("=> ");
        String pil = sc.next();
        System.out.println(" ");
        if (pil.equalsIgnoreCase("y")) {
            this.setMenu();
        } else {
            this.kataPenutup();
        }
    }
    public void tarikTunai(long nominal) {
        System.out.println("=== Info Saldo ===");
        if (nominal < this.setSaldo()) {
            saldo = this.setSaldo();
            saldo -= nominal;
            System.out.println("Penarikan berhasil! Sisa saldo anda atas nama" + this.nama + " adalah Rp " + saldo);
        } else {
            System.out.println("Saldo anda tidak mencukupi!");
        }
    }
    public void tarikTunaiNominal() {
        byte pil;
        System.out.println("=== Tarik Tunai ===");
        System.out.println("1.  50.000     4.   500.000");
        System.out.println("2. 100.000     5. 1.000.000");
        System.out.println("3. 200.000     6. 2.000.000");
        System.out.println("               7. Nominal lain\n");
        System.out.print("Pilihan anda: ");
        pil = sc.nextByte();
        switch (pil) {
            case 1:
                this.tarikTunai(50000);
                break;
            case 2:
                this.tarikTunai(100000);
                break;
            case 3:
                this.tarikTunai(200000);
                break;
            case 4:
                this.tarikTunai(500000);
                break;
            case 5:
                this.tarikTunai(1000000);
                break;
            case 6:
                this.tarikTunai(2000000);
                break;
            case 7:
                System.out.print("Masukkan nominal: ");
                long nominal = sc.nextLong();
                this.tarikTunai(nominal);
                break;
            default:
                System.out.println("Transaksi anda gagal!");
        }
    }
    public long transfer() {
        System.out.println("=== Transfer ===");
        System.out.println("Masukkan nomor rekening tujuan. *(7 digit)");
        System.out.print("=> ");
        long rekTujuan = sc.nextLong();
        if (rekTujuan <= 9999999) {
            System.out.print("Masukkan nominal: ");
            long nominal = sc.nextLong();
            saldo = this.setSaldo();
            if (saldo > nominal) {
                saldo -= nominal;
                System.out.println("Transfer ke rekening " + rekTujuan + " berhasil! Saldo anda Rp " + saldo);
                return saldo;
            } else {
                System.out.println("Saldo anda tidak mencukupi untuk melakukan transaksi!");
            }
        } else {
            System.out.println("Rekening yang anda masukkan salah!");
        }
        System.out.println("************************************");
        return saldo;
    }
    public void setMenu() {
System.out.println("************************************");
        System.out.println("1. Info saldo");
        System.out.println("2. Tarik tunai");
        System.out.println("3. Transfer");
        System.out.println("4. Keluar");
        System.out.print("Pilihan anda: ");
        pil = sc.nextByte();
        switch (pil) {
            case 1:
                System.out.print("Masukkan ID anda: ");
                inID = sc.next();
                System.out.print("Masukkan PIN anda: ");
                inPin = sc.nextInt();
                if (inID.equalsIgnoreCase(this.id)) {
                    if (true == this.periksaPin(inPin)) {
                        System.out.println("Saldo anda Rp " + this.setSaldo());
                    } else {
                        System.out.println("PIN anda salah!\n");
                    }
                } else {
                    System.out.println("ID anda salah!\n");
                }
                this.transaksiUlang();
                break;
            case 2:
                System.out.print("Masukkan ID anda: ");
                inID = sc.next();
                System.out.print("Masukkan PIN anda: ");
                inPin = sc.nextInt();
                if (inID.equalsIgnoreCase(this.id)) {
                    if (true == this.periksaPin(inPin)) {
                        this.tarikTunaiNominal();
                    } else {
                        System.out.println("PIN anda salah!\n");
                    }
                } else {
                    System.out.println("ID anda salah!\n");
                }
                this.transaksiUlang();
                break;
            case 3:
                System.out.print("Masukkan ID anda: ");
                inID = sc.next();
                System.out.print("Masukkan PIN anda: ");
                inPin = sc.nextInt();
                if (inID.equalsIgnoreCase(this.id)) {
                    if (this.periksaPin(inPin) == true) {
                        this.transfer();
                    } else {
                        System.out.println("PIN anda salah!\n");
                    }
                } else {
                    System.out.println("ID anda salah!\n");
                }
                this.transaksiUlang();
                break;
            case 4:
                System.out.println("Terima kasih. Silahkan ambil kartu anda!");
                break;
            default:
          System.out.println("Pilihan yang anda masukkan salah!");
        }
    }

}
