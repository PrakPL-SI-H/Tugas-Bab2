public class ATM {

    public int pass;
    public double saldo;
    public double tunai;
    public double sisa;
    public double transfer;

    public ATM() {
        pass = 0;
        saldo = 0;
    }

    public void setPassword(int p) {
        pass = p;
    }

    public void setSaldo(String a, double s) {
        saldo = s;
        System.out.println("\nSaldo: " + saldo);
    }

    public double sisaSaldo() {
        return(saldo - tunai);
    }

    public void tarikTunai(int tunai) {
        if (tunai <= saldo) {
            System.out.println("\nPenarikan Berhasil" + "\nSilahkan Ambil Uang Anda");
            saldo = saldo-tunai;
        } else {
            System.out.println("Maaf Saldo Anda Tidak Mencukupi");
        }
        System.out.println("Saldo anda saat ini: " + sisaSaldo());
    }
    
    public double transfer(double t){
        transfer = t;
        return(saldo-transfer);
    }
}
