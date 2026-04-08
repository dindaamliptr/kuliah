import java.util.Scanner;

public class Latihan2 {
    public static void main(String args[]) {

        float makan = 20000f;
        float transport = 10000f;
        float belanja = 50000f;
        float total = makan + transport + belanja;

        float persentaseMakan = (makan / total) * 100;
        float persentaseTransport = (transport / total) * 100;
        float persentaseBelanja = (belanja / total) * 100;

        system.out.println("Total Pengeluaran : " + total);
        System.out.println("Makan : " + makan);
        System.out.println("Transport : " + transport);
        System.out.println("Belanja : " + belanja);
        System.out.println("Total : " + total);
        System.out.println("Presentase:");

        System.out.printf("Makan     : %.2f%%\n", persentaseMakan);
        System.out.printf("Transport : %.2f%%\n", persentaseTransport);
        System.out.printf("Belanja   : %.2f%%\n", persentaseBelanja);


    }
}