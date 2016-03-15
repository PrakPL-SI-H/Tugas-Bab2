package praktikum;
public class ATM {
    String nama;
    int pin, nominal, saldo, tarikTunai, kode, norek;
    public ATM() {
        saldo = 1000000;
        nominal = 0;
        tarikTunai = 0;
    }
    public void tampilanAwal() {
        System.out.println("");
        System.out.println("====================MENU====================");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Uang ");
        System.out.println("3. Transfer Uang ");
        System.out.println("4. Keluar Menu");   
        System.out.println("=============================================");
    
    }
}