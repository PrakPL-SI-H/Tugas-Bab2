package mainmesinatm;

import java.util.Scanner;

public class ATMcard {

    private int accountNumber;
    private double saldo;
    private int input;
    private int pin;
    Scanner in = new Scanner(System.in);

    public void setPin(int pin) {
        this.pin = pin;
    }

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
        Scanner in = new Scanner(System.in);
        this.setPin(24081997);
        System.out.println("=======================================================");
        System.out.println("\t\tSELAMAT DATANG DI ATM BNI !                          ");
        System.out.println("=======================================================");
        System.out.print("Masukan pin anda: ");
        pin = in.nextInt();
        if (this.getPin() == pin && pin == 24081997) {
            this.Tampilkan();
        } else {
            System.out.println("Salah pin");
            this.akun();
        }
    }

    public void Tampilkan() {
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t       >> Pilih Transaksi <<                    ");
        System.out.println(" ");
        System.out.print("\t[1] Cek Saldo          [2] Penarikan           ");
        System.out.println(" ");
        System.out.print("\t[3] Transfer           [4] Keluar             ");
        System.out.println(" ");
        System.out.println("=======================================================");
        System.out.print("\t         Masukan pilihan Anda : ");
        int pil = in.nextInt();
        switch (pil) {
            case 1:
                cekSaldo();
                break;
            case 2:
                Penarikan();
                break;
            case 3:
                Transfer();
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

    public void cekSaldo() {
        System.out.println("=======================================================");
        System.out.println("\tCEK SALDO");
        System.out.println(" ");
        System.out.println("Sisa saldo atm anda adalah : Rp. " + getSaldo());
        this.transaksiLagi();
    }

    public void Penarikan() {
        double Penarikan;
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("\tPENARIKAN TUNAI");
        System.out.println(" ");
        System.out.println("=======================================================");
        System.out.print("\t           >> Pilih Nominal <<                  ");
        System.out.println();
        System.out.print("\t[1] Rp. 100.000          [2] Rp. 200.000      ");
        System.out.println();
        System.out.print("\t[3] Rp. 300.000          [4] Rp. 500.0000    ");
        System.out.println();
        System.out.println("\t[5] Rp. 1.000.0000       [6] Penarikan Lainnya        ");
        System.out.println("=======================================================");
        System.out.print("Masukan pilihan anda : ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                jumlahNominal(100000);
                break;
            case 2:
                jumlahNominal(200000);
                break;
            case 3:
                jumlahNominal(300000);
                break;
            case 4:
                jumlahNominal(500000);
                break;
            case 5:
                jumlahNominal(1000000);
                break;
            case 6:
                System.out.println("\t         Masukan Nominal : ");
                System.out.println("=======================================================");
                System.out.print("Jumlah Penarikan : Rp. ");
                Penarikan = in.nextDouble();
                this.jumlahNominal(Penarikan);
                break;
            default:
                System.out.println("\tPilihan Yang Anda masukan salah");
                this.Penarikan();
        }
    }

    public void jumlahNominal(double Nominal) {
        if (getSaldo() < 50000) {
            System.out.println("Maaf saldo anda tidak mencukupi");
        } else {
            saldo -= Nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah penarikan terlalu besar");
                System.out.println(",saldo anda tidak mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan penarikan sebesar Rp. " + Nominal);
                System.out.println("Sisa saldo anda adalah Rp. " + saldo);
            }
            this.transaksiLagi();
        }
    }

    public void Transfer() {
        String noRek;
        double Nominal;
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("\tTRANSFER");
        System.out.println(" ");
        System.out.print("Masukan no rekening : \t");
        noRek = in.next();
        System.out.print("Masukan nominal yang akan ditransfer : Rp. ");
        Nominal = in.nextDouble();
        this.nominalTransfer(Nominal, noRek);
    }

    public void nominalTransfer(double Nominal, String noRek) {
        if (getSaldo() < 50000) {
            System.out.println("Maaf saldo anda tidak mencukupi");
        } else {
            saldo -= Nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah transfer terlalu besar");
                System.out.println(",saldo anda tidak mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan transfer sebesar Rp. " + Nominal);
                System.out.println("Kepada no. rekening " + noRek);
                System.out.println("Sisa saldo anda adalah Rp. " + saldo);
                System.out.println("=======================================================");
            }
        }
        this.transaksiLagi();
    }

    public void transaksiLagi() {
        String transaksi;
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin melakukan transaksi lainnya ? (y/n)");
        transaksi = in.next();
        if (transaksi.equalsIgnoreCase("y")) {
            this.Tampilkan();
        } else if (transaksi.equalsIgnoreCase("n")) {
            System.out.println("=======================================================");
            System.out.println("\tTerimakasih telah menggunakan layanan kami.");
            System.out.println("\t      Silahkan Ambil kartu Anda.");
            System.out.println("=======================================================");
        }

    }
}
