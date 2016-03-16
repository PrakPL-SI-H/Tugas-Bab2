package atm;
public class ATM {
    
    private int password;
    private int saldo = 10000000;
    
    // kontruktor 
    ATM(int pass){
        password = pass;
    }
    
    // mengembalikan nilai PIN
    public int PIN(){
        return password;
    }
    
    //untuk mengenali PIN benar atau salah
    public void Pass(int pass){
        
        if(password == pass){
        display();
        }else{
            System.out.println("PIN anda salah");   
        }
    }
    
    //untuk menstransfer uang
    public void transfer(int jum){
        saldo = saldo - jum;
        System.out.println("Sisa saldo anda "+saldo);
    }
    
    //untuk mengganti PIN
    public int setPass(int pass){
        return password = pass;
    }
    
    //untuk menampilkan saldo
    public int saldo(){
        return saldo;
    }
    
    //untuk menarik uang
    public void menarikUang(int jum){
        System.out.println("Silahkan Ambil uang anda");
        System.out.println("Saldo anda ");
        saldo = saldo - jum;
        System.out.println(saldo);
    }
    
    public void display(){
        System.out.println("MENU");
        System.out.println("1. Melihat Saldo");
        System.out.println("2. Menarik uang");
        System.out.println("3. Transfer Uang");
        System.out.println("4. Mengganti password");
        System.out.println("5. Menampilkan PIN");
    }
}