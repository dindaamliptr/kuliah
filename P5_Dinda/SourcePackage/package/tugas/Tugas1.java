import java.util.Scanner;

public class LatihanGabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float realisasi, kehadiran, tugas, uts, uas;
        float b_kehadiran, b_tugas, b_uts, b_uas, total;
        float rasioKehadiran;
        char grade;

        // ===== INPUT =====
        System.out.print("Input Realisasi Pertemuan : ");
        realisasi = input.nextFloat();

        if (realisasi == 0) {
            System.out.println("Realisasi tidak boleh 0!");
            return;
        }

        System.out.print("Input Kehadiran Mahasiswa : ");
        kehadiran = input.nextFloat();

        System.out.print("Input Nilai Tugas         : ");
        tugas = input.nextFloat();

        System.out.print("Input Nilai UTS           : ");
        uts = input.nextFloat();

        System.out.print("Input Nilai UAS           : ");
        uas = input.nextFloat();

        rasioKehadiran = kehadiran / realisasi;

        b_kehadiran = rasioKehadiran * 10;
        b_tugas = tugas * 0.20f;
        b_uts = uts * 0.30f;
        b_uas = uas * 0.40f;

        total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("\n HASIL");
        System.out.printf("Total Nilai : %.2f\n", total);

        if (rasioKehadiran < 0.75) {
            grade = 'E';
            System.out.println("Grade       : " + grade);
            System.out.println("Keterangan  : TIDAK LULUS (Kehadiran kurang dari 75%)");
        } else {
            if (total >= 80) {
                grade = 'A';
            } else if (total >= 70) {
                grade = 'B';
            } else if (total >= 60) {
                grade = 'C';
            } else if (total >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            System.out.println("Grade       : " + grade);
            System.out.println("Keterangan  : LULUS");
        }

        input.close();
    }
}