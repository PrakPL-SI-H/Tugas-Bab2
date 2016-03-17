import java.util.Scanner;
public class mainATM {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        atm a = new atm("Selamat Datang Pelanggan Rokhimakumullah",
                123456);       
        a.inputPass(1);   
    }    
}
