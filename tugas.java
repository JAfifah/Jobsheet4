import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlKamar, jmlTamu, jmlHari, tipeKamar;
        double saldo = 0, twinBedDoubleBed= 300000, total;

        System.out.println("Jumlah saldo anda: " +saldo);
        System.out.println();
        System.out.println("Tambahkan saldo: ");
        saldo += input.nextDouble();
        System.out.println("Saldo anda sekarang: " +saldo);
        System.out.println();
        
        int pilkam;
        System.out.println("Pilih salah satu ");
        System.out.println("1. Twin bed");
        System.out.println("2. Double bed ");
        pilkam = input.nextInt();

        if (pilkam == 1) {
            System.out.println();
            System.out.println("Harga kamar: " +twinBedDoubleBed);
        } else {
            System.out.println("Harga kamar: " +twinBedDoubleBed);

        }
            System.out.println("Masukkan jumlah kamar: ");
            jmlKamar = input.nextInt();
            System.out.println("Jumlah tamu: ");
            jmlTamu = input.nextInt();
            System.out.println("Berapa hari anda akan menginap: ");
            jmlHari = input.nextInt();

            total = twinBedDoubleBed*jmlHari*jmlKamar;
            int pilTra;
            System.out.println("Jumlah yang harus anda bayarkan: " +total);
            System.out.println("Saldo anda sekarang : " + saldo);
            System.out.println("Lanjutkan pembayaran ");
            System.out.println("1. lanjutkan");
            System.out.println("2. batalkan");
            pilTra = input.nextInt();

            if (pilTra == 1) {
                double kembalian = saldo - total;

                if (saldo >= total) {
                    System.out.println("Pembayaran berhasil !");
                    System.out.println("Sisa saldo anda : " +kembalian);
                } else {
                    System.out.println("Transaksi dibatalkan!");
                }
            }



    }
}