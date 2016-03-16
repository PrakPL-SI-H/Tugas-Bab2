package ATM;

import java.util.Scanner;

public class mainMesinATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte pil;
        System.out.println("***************************************");
        System.out.println("********        A  T  M        ********");
        System.out.println("***************************************\n");
        System.out.print("Masukkkan NAMA anda: ");
        String inNama = sc.nextLine();
        System.out.println("Masukkan ID anda *(tidak boleh menggunakan spasi)");
        System.out.print("=> ");
        String inID = sc.next();
        System.out.println("Masukkan PIN anda *(Panjang max 6 digit dan harus menggunakan angka)");
        System.out.print("=> ");
        int inPin = sc.nextInt();
        System.out.print("Masukkan saldo anda: ");
        long inSaldo = sc.nextLong();
        System.out.println(" ");
        mesinATM atm = new mesinATM(inNama, inID, inPin, inSaldo);
        atm.setMenu();
    }

}
