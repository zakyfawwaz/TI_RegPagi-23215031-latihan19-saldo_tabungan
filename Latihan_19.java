public class Latihan_19 {
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lamaBulan = 6;

        System.out.println("Saldo Awal: Rp " + saldoAwal);
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}
