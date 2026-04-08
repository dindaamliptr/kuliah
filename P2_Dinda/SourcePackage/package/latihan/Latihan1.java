import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukkan jumlah data: ");
        jumlah = input.nextInt();

        String[] nama = new String[jumlah];
        int[] usia = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Input nama: ");
            nama[i] = input.nextLine();

            System.out.print("Input usia: ");
            usia[i] = input.nextInt();
            input.nextLine(); // buang enter
        }

        int totalUsia = 0;
        for (int i = 0; i < jumlah; i++) {
            totalUsia += usia[i];
        }

        double rataRata = (double) totalUsia / jumlah;

        System.out.println("\n=== HASIL DATA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama: " + nama[i] + ", Usia: " + usia[i]);
        }

        System.out.println("\nTotal Usia: " + totalUsia);
        System.out.println("Rata-rata Usia: " + rataRata);
    }
}