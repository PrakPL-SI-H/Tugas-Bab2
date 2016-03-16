
package ATM;

public class Atm {

    private String nama;
    private String rek;
    private String pass;
    private double saldo;

    public Atm(String nama, String rek, String pass, double saldo) {
        this.nama = nama;
        this.rek = rek;
        this.pass = pass;
        this.saldo = saldo;
    }
    

    public void cekSaldo() {
        System.out.println("=> Cek Saldo");
        System.out.println("Saldo anda : RP." + saldo);
        System.out.println("");
    }
    
    
public void transfer(String norekTuju, double transf) {
        double tran = saldo - transf;
        if (tran > 50000) {
            if (saldo > transf) {
                saldo -= transf;
                System.out.println("Anda melakukan transfer dengan no tujuan : " + norekTuju + " Sebesar : Rp." + transf);
            } else {
                System.out.println("Saldo anda tidak mencukupi!\n");
            }
        } else {
            System.out.println("Saldo minimum anda harus : Rp.50.000");
        }

    }


    public void tarikUang(double ambil) {
        double tarik = saldo - ambil;
        if (tarik > 50000) {
            if (saldo > ambil) {
                saldo -= ambil;
                System.out.println("Anda melakukan penarikan sebesar : Rp." + ambil);
            } else {
                System.out.println("Saldo anda tidak mencukupi!\n");
            }
        } else {
            System.out.println("Saldo minimum anda harus : Rp.50.000");
        }
    }

    public boolean cekpassword(String pass2, boolean cek){
        if (pass2.equalsIgnoreCase(pass)) {
            return true;
        } else{
            return false;
        }
        
        
    }

}
