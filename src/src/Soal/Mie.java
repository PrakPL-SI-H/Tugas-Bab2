package Soal;

public class Mie {

    private String merk;
    private double kandunganPengawet;
    private int beratMie;

    public Mie() {
        merk = "";
        kandunganPengawet = 0;
        beratMie = 0;
    }

    public Mie(String m, double kp, int bm) {
        merk = m;
        kandunganPengawet = kp;
        beratMie = bm;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setberatMie(int bm) {
        beratMie = bm;
    }

    public void setKandunganPengawet(double kp) {
        kandunganPengawet = kp;
    }
    public double rumus (){
         double hariku = 0;
         hariku = (kandunganPengawet/(1000 * beratMie));
         return hariku;
    }
    
    public void Tampilkan() {
        
        System.out.println("merk mie anda adalah "+ merk);
        System.out.println("berat mie anda adalah "+beratMie);
        System.out.println("kandungan pengawet mie anda adalah "+kandunganPengawet);
        System.out.println("interval harinya adalah = " + rumus());
    }
}
