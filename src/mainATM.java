package atm;
import java.util.Scanner;
public class mainATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;
        int pass;
        ATM user1 = new ATM(12345);
        
        System.out.println("=======================");
        System.out.println("Selamat datang di ATM");
        System.out.println("=======================");
       
        System.out.println("Silahkan masukkan PIN anda ");
        user1.Pass(pass = input.nextInt());
        
        do{
        System.out.println("Masukkan pilihan anda : ");
        int pil = input.nextInt();
        
        switch(pil){
            case 1: System.out.println("Saldo anda\nRp "+user1.saldo()); 
                    break;
            case 2: System.out.print("Masukkan nominal : ");
                    int jum = input.nextInt();
                    user1.menarikUang(jum);
                    break;
            case 3: System.out.println("Masukkan Nomer Rekening tujuan : ");
                    String rek = input.next();
                    System.out.println("Masukkan nominal : ");
                    int jml = input.nextInt();
                    user1.transfer(jml);
                    break;
            case 4: System.out.println("Masukkan PIN baru anda : ");
                    int pin = input.nextInt();
                    user1.setPass(pin);
                    break;
            case 5: System.out.println("PIN anda adalah");
                    System.out.println(user1.PIN());
                    break;
            default:System.out.println("Maaf, PIN yang Anda masukkan salah");
                    break;
        
        }
                System.out.println("Apakah anda ingin melanjutkan?(Y/N) ");
                lanjut = input.next();
        }
                while(lanjut.equalsIgnoreCase("Y"));   
    }
}