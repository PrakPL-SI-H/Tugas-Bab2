package pl_praktikum_lap2;

import java.util.Scanner;

public class AtmProgram {

    int pil;

    public static void main(String[] args) {

        AtmProgram program = new AtmProgram();
        program.initSaldo(5000000);
        program.login();
    }

    public void initSaldo(double saldo) {
        atm.setSaldo(saldo);
    }
    Scanner s = new Scanner(System.in);

    AtmClass atm = new AtmClass();
    double minSaldo = 50000;

    public void menu() {
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\tSelamat Datang di ATM Bank Ambang          |");
        System.out.println();
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\t       > Pilih Transaksi <                    |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[1] Cek Saldo          [2] Transfer           |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[3] Penarikan          [4] Keluar             |");
        System.out.println();
        System.out.print("|");

        System.out.println("=======================================================");
        System.out.print("\t         Masukan pilihan Anda : ");
        pil = s.nextInt();
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
                login();
                break;
        }
    }

    public void login() {
        int pin;
        atm.setPin(12345678);
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\tSelamat Datang di ATM Bank Ambang          |");
        System.out.println();
        System.out.println("=======================================================");
        System.out.print("\t     Masukan PIN : ");
        pin = s.nextInt();
        if (atm.getPin() == pin) {
            menu();
        } else {
            System.out.println("Gagal");
            login();
        }
    }


    public void lihatSaldo() {
        System.out.println("=======================================================");
        System.out.println("\t         Lihat Saldo ");
        System.out.println("=======================================================");
        System.out.println("Sisa Saldo yang Anda miliki adalah sebesar Rp." + atm.getSaldo());
        transaksiLagi();

    }
    public void transfer() {
        int norek;
        double nom;
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\tTransfer                    |");
        System.out.println();
        System.out.println("=======================================================");
        System.out.print("\tMasukan Nomor Rekening : ");
        norek = s.nextInt();
        System.out.println();
        System.out.print("\tMasukan Nominal Transfer : ");
        nom = scan.nextDouble();
        transferNominal(nom, norek);
    }

    public void transferNominal(double nominal, int norek) {
        double saldo = atm.getSaldo();
        if (atm.getSaldo() < 50000) {
            System.out.println("\tMaaf Saldo Anda tidak mencukupi.");
        } else {
            saldo -= nominal;
            if (saldo < minSaldo) {
                System.out.println("\tMaaf, jumlah transfer terlalu besar");
                System.out.println("\t    Sisa saldo tidak mencukupi");
            } else {
                atm.setSaldo(saldo);
                System.out.println("Anda telah berhasil melakukan transfer sebesar : " + nominal);
                System.out.println("Ke nomor rekening : " + norek);
                System.out.println("\t       Sisa Saldo adalah :" + saldo);
            }
            transaksiLagi();
        }
    }

    public void tarik() {
        double penarikan;
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\t            Penarikan Tunai                   |"
                + "                |");
        System.out.println();
        System.out.println("=======================================================");
        System.out.print("|");
        System.out.print("\t           > Pilih Nominal <                  |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[1] Rp. 100.000          [2] Rp. 200.000      |");
        System.out.println();
        System.out.print("|");
        System.out.print("\t[3] Rp. 500.000          [4] Rp. 1000.0000    |");
        System.out.println();
        System.out.print("|");
        System.out.println("\t[5] Rp. 2000.0000        [6] Penarikan        |");
        System.out.println("=======================================================");
        System.out.print("\t         Masukan pilihan Anda : ");
        pil = s.nextInt();
        System.out.println("=======================================================");
        switch (pil) {
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
                System.out.print("Jumlah Penarikan : ");
                penarikan = scan.nextDouble();
                tarikNominal(penarikan);
                break;
            default:
                System.out.println("\tPilihan Yang Anda masukan salah");
                tarik();
        }
    }

    public void tarikNominal(double nominal) {
        double saldo = atm.getSaldo();
        if (atm.getSaldo() < 50000) {
            System.out.println("\tMaaf Saldo Anda tidak mencukupi.");
        } else {
            saldo -= nominal;
            if (saldo < minSaldo) {
                System.out.println("\tMaaf, jumlah penarikan terlalu besar");
                System.out.println("\t    Sisa saldo tidak mencukupi");
            } else {
                atm.setSaldo(saldo);
                System.out.println("Anda telah berhasil melakukan penarikan sebesar : " + nominal);
                System.out.println("\t       Sisa Saldo adalah :" + saldo);
            }
            transaksiLagi();
        }
    }

    public void transaksiLagi() {
        String warn;
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("Apakah Anda ingin melakukan transaksi lagi ? [y/n] ");
        warn = scan.nextLine();
        System.out.println();
        if (warn.equalsIgnoreCase("y")) {
            login();
        } else if (warn.equalsIgnoreCase("n")) {
            System.out.println("=======================================================");
            System.out.println("\tTerimakasih telah menggunakan layanan kami.");
            System.out.println("\t      Silahkan Ambil kartu Anda.");
        }
    }
}