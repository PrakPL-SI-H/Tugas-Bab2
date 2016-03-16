package mainatm;

import java.util.Scanner;

public class mesinATM {

    Scanner in = new Scanner(System.in);
    private int noAkun;
    private int pin;
    private int input;
    private double saldo;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void akun() {
        Scanner in = new Scanner(System.in);
        this.setPin(123456);
        System.out.println("================ SELAMAT DATANG DI ATM X ================");
        System.out.print("Masukkan PIN Anda : ");
        pin = in.nextInt();
        if (this.getPin() == pin) {
            this.tampilkan();
        } else {
            System.out.println("PIN yang Anda masukkan salah");
            this.akun();
        }
    }

    public void tampilkan() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Pilih Transaksi : ");
        System.out.println("1. Cek Saldo ");
        System.out.println("2. Penarikan");
        System.out.println("3. Transfer");
        System.out.println("4. Keluar");
        System.out.println("=========================================================");
        System.out.print("Masukkan pilihan Anda : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                cekSaldo();
                break;
            case 2:
                penarikan();
                break;
            case 3:
                transfer();
                break;
            case 4:
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan salah");
                akun();
                break;
        }

    }

    public void cekSaldo() {
        System.out.println("=========================================================");
        System.out.println("1. Cek Saldo");
        System.out.println("=========================================================");
        System.out.println("Sisa Saldo Anda Adalah : " + getSaldo());
        this.transaksiUlang();
    }

    public void penarikan() {
        Scanner in = new Scanner(System.in);
        double tarik;
        System.out.println("=========================================================");
        System.out.println("2. Penarikan");
        System.out.println("=========================================================");
        System.out.print("Pilih Nominal : ");
        System.out.println("1. Rp 50.000");
        System.out.println("2. Rp 100.000");
        System.out.println("3. Rp 200.000");
        System.out.println("4. Rp 500.000");
        System.out.println("5. Rp 1.000.000");
        System.out.println("6. Penarikan");
        System.out.println("=========================================================");
        System.out.print("Masukan pilihan anda : ");
        int pilihan = in.nextInt();
        System.out.println();
        switch (pilihan) {
            case 1:
                Nominal(50000);
                break;
            case 2:
                Nominal(100000);
                break;
            case 3:
                Nominal(200000);
                break;
            case 4:
                Nominal(500000);
                break;
            case 5:
                Nominal(1000000);
                break;
            case 6:
                System.out.println("Masukan Nominal : ");
                System.out.println("=========================================================");
                System.out.print("Jumlah Penarikan : Rp. ");
                tarik = in.nextDouble();
                this.Nominal(tarik);
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan salah");
        }
    }

    public void Nominal(double nominal) {
        if (getSaldo() < 50000) {
            System.out.println("Saldo Anda Tidak Mencukupi");
        } else {
            saldo -= nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah Nominal Terlalu Tesar");
                System.out.println("Saldo Anda Tidak Mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan penarikan sebesar Rp. " + nominal);
                System.out.println("Sisa Saldo Anda Adalah Rp " + saldo);
            }
            this.transaksiUlang();
        }
    }

    public void transfer() {
        Scanner in = new Scanner(System.in);
        String noRekening;
        double nominal;
        System.out.println("=========================================================");
        System.out.println("3. Transfer");
        System.out.println("=========================================================");
        System.out.println(" ");
        System.out.print("Masukan No Rekening Tujuan Anda : ");
        noRekening = in.next();
        System.out.print("Masukan Nominal yang akan ditransfer : Rp. ");
        nominal = in.nextInt();
        this.nominalTransfer(nominal, noRekening);
    }

    public void nominalTransfer(double nominal, String nomer) {
        if (getSaldo() < 50000) {
            System.out.println("Maaf saldo anda tidak mencukupi");
        } else {
            saldo -= nominal;
            if (saldo < 50000) {
                System.out.print("Jumlah transfer terlalu besar");
                System.out.println("Saldo Anda Tidak Mencukupi");
            } else {
                setSaldo(saldo);
                System.out.println("Anda berhasil melakukan transfer sebesar Rp. " + nominal);
                System.out.println("=========================================================");
            }
        }
        this.transaksiUlang();
    }

    public void transaksiUlang() {
        Scanner in = new Scanner(System.in);
        String plh;
        System.out.println("Apakah anda ingin melakukan transaksi lainnya ? (y/n)");
        plh = in.next();
        if (plh.equalsIgnoreCase("y")) {
            this.tampilkan();
        } else if (plh.equalsIgnoreCase("n")) {
            System.out.println("=========================================================");
            System.out.println("      Terima Kasih Telah Menggunakan Layanan Kami        ");
            System.out.println("=========================================================");
        }

    }
}

package mainatm;

public class MainATM {

    public static void main(String[] args) {
        mesinATM atm = new mesinATM();
        atm.setSaldo(8500000);
        atm.akun();

    }

}

