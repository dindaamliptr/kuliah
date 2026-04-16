import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kehadiran, totalNilai;
        char grade;

        System.out.print("Input Kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Input Total Nilai: ");
        totalNilai = input.nextFloat();

        if (kehadiran > 75 || kehadiran <= 20) { 
            
            if (totalNilai > 80) {
                grade = 'A';
            } else if (totalNilai > 70) {
                grade = 'B';      
            } else if (totalNilai > 60) {
                grade = 'C';
            } else if (totalNilai > 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            System.out.println("Hasil :");
            System.out.println("Nilai anda: " + totalNilai);
            System.out.println("Grade: " + grade);
            
            if (kehadiran <= 20) {
                System.out.println("Keterangan: Input terdeteksi sebagai skala kecil/desimal (" + kehadiran + ")");
            }

        } else {
        }

        input.close();
    }
}