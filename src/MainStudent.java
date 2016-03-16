import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = in.nextInt();
        Student baru = new Student(jumlah);
        do {
            System.out.println("\n=================Menu Siswa=================");
            System.out.println("1. Input Data Siswa");
            System.out.println("2. Input Nilai Siswa");
            System.out.println("3. Print Data");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan: ");
            int pil = in.nextInt();

            switch (pil) {
                case 1:
                    for (int i = 0; i < jumlah; i++) {
                        in.nextLine();
                        System.out.print("\nMasukkan nama ke " + (i + 1) + ": ");
                        String nama = in.nextLine();
                        baru.setName(i, nama);
                        System.out.print("Masukkan alamat ke " + (i + 1) + ": ");
                        String alamat = in.nextLine();
                        baru.setAddress(i, alamat);
                        System.out.print("Masukkan umur ke " + (i + 1) + ": ");
                        baru.setAge(i, in.nextInt());
                    }
                    break;
                case 2:
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("\nMasukkan nilai matematika siswa ke " + (i + 1) + ": ");
                        baru.setMath(i, in.nextInt());
                        in.nextLine();
                        System.out.print("Masukkan nilai bahasa inggris siswa ke " + (i + 1) + ": ");
                        baru.setEnglish(i, in.nextInt());
                        System.out.print("Masukkan nilai ipa siswa ke " + (i + 1) + ": ");
                        baru.setScience(i, in.nextInt());
                    }
                    break;
                case 3:
                    for (int i = 0; i < jumlah; i++) {
                        baru.displayMessage(i);
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);
    }
}
