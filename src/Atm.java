//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugas1.pkg2;


public class Atm {
    int saldo;
    int rek;
    int kirim;
    
    public Atm(){
        saldo = 500000;
    }
    
    void lihatSaldo(){
        System.out.println("Saldo anda = " + saldo);
    }
    
    void tarikUang(int a){
        if(saldo > a){
            saldo = saldo - a;
            System.out.println("Silahkan ambil uang anda");
        }
        else{
            System.out.println("Maaf, saldo anda tidak cukup");
        }
    }
    
    void transferUang(Atm a){
        saldo = saldo - kirim;
        a.saldo = a.saldo + kirim;
        System.out.println("Uang sudah terkirim");
    }
}
