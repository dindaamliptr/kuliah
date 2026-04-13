public class Latihan1 {

    private double tinggi;
    private double alas;

    // Setter
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    // Getter
    public double getTinggi() {
        return tinggi;
    }

    public double getAlas() {
        return alas;
    }

    // Method menghitung luas
    public double getLuas() {
        return 0.5 * tinggi * alas;
    }

    public static void main(String[] args) {

        Latihan1[] S = new Latihan1[2];

        S[0] = new Latihan1();
        S[1] = new Latihan1();

        S[0].setTinggi(12.0);
        S[0].setAlas(8.0);

        S[1].setTinggi(11.23);
        S[1].setAlas(7.7);

        for (int i = 0; i < S.length; i++) {
            System.out.println("Segitiga ke-" + (i + 1));
            System.out.println("Tinggi = " + S[i].getTinggi());
            System.out.println("Alas = " + S[i].getAlas());
            System.out.println("Luas Segitiga = " + S[i].getLuas());
            System.out.println();
        }
    }
}