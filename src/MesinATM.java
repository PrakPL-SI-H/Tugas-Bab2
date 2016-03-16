package atm;
import java.util.Scanner;
public class MesinATM {
    private int accountNumber;
    private double saldo;
    private int input;
    private int pin;
    Scanner in = new Scanner(System.in);
    public int getPin() {
        return pin;
    }
    public void setSaldo(double a) {
        this.saldo = a;
    }
    public double getSaldo() {
        return saldo;
    }
    public void akun() {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t\tSELAMAT DATANG DI MENU DI KARTU ATM                          ");
        System.out.println("=======================================================");
        System.out.print("Masukan 6 digit nomor pin Anda : ");
        pin = input.nextInt();
        if (this.getPin() == pin && pin == 123456) {
            this.displayMessage();
        } else {
            System.out.println("Pin Anda Salah, Periksa kembali nomor Pin Anda ! ");
            this.akun();
        }
    }
    public void displayMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t              Menu Transaksi                    ");
        System.out.println(" ");
        System.out.print("\t[1]<------ Cek Saldo          Transfer ------>[2]            ");
        System.out.println(" ");
        System.out.print("\t[3]<------ Penarikan          Keluar ------>[4]             ");
        System.out.println(" ");
        System.out.println("=======================================================");
        System.out.print("\t         Masukan pilihan Anda : ");
        int pil = input.nextInt();
        switch (pil) {
            case 1:
                lihatSaldo();
                break;
            case 2:
                transfer();
                break;
            case 3:
                tarik();
                break;
            case 4:
                System.out.println("=======================================================");
                System.out.println("\tTerimakasih telah menggunakan layanan kami.");
                System.out.println("\t      Silahkan Ambil kartu Anda.");
                break;
            default:
                System.out.println("Pilihan Yang Anda masukan salah. Silahkan Login kembali.");
                akun();
                break;
        }
    }
    public void lihatSaldo() {
        System.out.println("=======================================================");
        System.out.println("\tCEK SALDO");
        System.out.println(" ");
        System.out.println("Sisa saldo atm anda adalah : Rp. " + getSaldo());
        this.transaksiAgain();
    }
    public void tarik() {
        double narik;
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("\tPENARIKAN TUNAI");
        System.out.println(" ");
        System.out.println("=======================================================");
        System.out.print("\t            Pilih Jumlah Penarikan                   ");
        System.out.println();
        System.out.print("\t[1]<------ Rp. 100.000          Rp. 200.000 ------>[2]");
        System.out.println();
        System.out.print("\t[3]<------ Rp. 500.000           Rp. 1.000.0000 ------>[4]");
        System.out.println();
        System.out.println("\t[5]<----- Rp. 2000.0000        Penarikan Jumlah Lain ------>[6]");
        System.out.println("=======================================================");
        System.out.print("Masukan pilihan anda : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                tarikNominal(100000);
                break;
            case 2:
                tarikNominal(200000);
                break;
            case 3:
                tarikNominal(500000);
                break;
            case 4:
                tarikNominal(1000000);
                break;
            case 5:
                tarikNominal(2000000);
                break;
            case 6:
                System.out.println("\t         Masukan Nominal : ");
                System.out.println("=======================================================");
                System.out.print("Jumlah Penarikan : Rp. ");
                narik = input.nextDouble();
                this.tarikNominal(narik);
                break;
            default:
                System.out.println("\tPilihan Yang Anda masukan salah");
                this.tarik();
        }
    }
    public void tarikNominal(double nominal) {
        if (getSaldo() < 50000) {
            System.out.println("Maaf saldo anda tidak mencukupi");
        } else {
            saldo -= nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah transfer terlalu besar");
                System.out.println(",saldo anda tidak mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan penarikan sebesar Rp. " + nominal);
                System.out.println("Sisa saldo anda adalah Rp. " + saldo);
            }
            this.transaksiAgain();
        }
    }
    public void transfer() {
        String noRek;
        double nomin;
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("\tTRANSFER");
        System.out.println(" ");
        System.out.print("Masukan no rekening : \t");
        noRek = input.next();
        System.out.print("Masukan nominal yang akan ditransfer : Rp. ");
        nomin = input.nextInt();
        this.nominalTransfer(nomin, noRek);
    }
    public void nominalTransfer(double nominal, String nomer) {
        if (getSaldo() < 50000) {
            System.out.println("Maaf saldo anda tidak mencukupi");
        } else {
            saldo -= nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah transfer terlalu besar");
                System.out.println(",saldo anda tidak mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan transfer sebesar Rp. " + nominal);
                System.out.println("Kepada no. rekening " + nomer);
                System.out.println("Sisa saldo anda adalah Rp. " + saldo);
                System.out.println("=======================================================");
            }
        }
        this.transaksiAgain();
    }
    public void transaksiAgain() {
        String apakah;
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda ingin melakukan transaksi lainnya ? (y/n)");
        apakah = input.next();
        if (apakah.equalsIgnoreCase("y")) {
            this.displayMessage();
        } else if (apakah.equalsIgnoreCase("n")) {
            System.out.println("=======================================================");
            System.out.println("\tTerimakasih telah menggunakan layanan kami.");
            System.out.println("\t      Silahkan Ambil kartu Anda.");
            System.out.println("=======================================================");
        }
    }
}
