package tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukkan jumlah data: ");
        jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        double[] rataRata = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Input nama: ");
            nama[i] = input.nextLine();

            int total = 0;

            System.out.print("Input nilai 1: ");
            total += input.nextInt();

            System.out.print("Input nilai 2: ");
            total += input.nextInt();

            System.out.print("Input nilai 3: ");
            total += input.nextInt();
            input.nextLine(); 

            rataRata[i] = total / 3.0;
        }

        System.out.println("\n=== HASIL DATA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama: " + nama[i] + ", Rata-rata: " + rataRata[i]);
        }
    }
}