
package tugas1.pkg2;


public class Atm {
    int saldo;
    
    void Atm(){
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
    
    void transferUang(){
        
    }
}
