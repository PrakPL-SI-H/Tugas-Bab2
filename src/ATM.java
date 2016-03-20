
public class ATM {

    String nama;
    int rek, pin, saldo, saldoOUT;

    public ATM(String nama, int rek, int pin, int saldo) {
        this.nama = nama;
        this.rek = rek;
        this.pin = pin;
        this.saldo = saldo;
    }

    public static void showMenu() {
        System.out.println("[1] Tarik Tunai\t\tTransfer [3]");
        System.out.println("[2] Informasi Saldo\t  Keluar [4]");
    }

    public void cekSaldo() {
        System.out.println("Saldo Anda saat ini: Rp " + saldo);
    }

    public boolean cekKelipatan() {
        return (saldoOUT % 50000 == 0);
    }

    public void konfirmasi(String confirm) {
        switch (confirm) {
            case "y":
                if (saldo - saldoOUT < 0) {
                    saldoOUT = 0;
                    System.out.println("Maaf, saldo Anda tidak mencukupi. Transaksi dibatalkan..");
                    break;
                } else {
                    saldo -= saldoOUT;
                    System.out.println("Transaksi sukses..");
                    break;
                }
            case "n":
                System.out.println("Transaksi dibatalkan..");
                break;
            default:
                System.out.println("Wrong Input! Transaksi dibatalkan..");
                break;
        }
    }
}
