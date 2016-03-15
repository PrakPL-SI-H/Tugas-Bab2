package prakproglan;
import java.util.Scanner;
public class MainATM {
    public static void main(String[]args){
        
        
        ATM uang = new ATM();
        System.out.println("Masukkan Password Anda : ");
        uang.setPassword();
        
            
    public void MenuATM(){
        System.out.println("      SELAMAT DATANG     ");
        System.out.println("=========================");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Melihat Saldo");
        System.out.println("2. Penarikan Uang");
        System.out.println("3. Transfer");
        pilihan = in.nextInt();
    }
}
