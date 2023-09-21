import java.util.Scanner;

public class hargaBayar14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga, jumlah;
        String merkBuku;
        int jumlahHalaman;
        double besarandis;
        double total, dis, bayar;

        
        System.out.print("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.print("Masukkan Merk Buku ");
        merkBuku = input.next();
        System.out.print("Masukkan jumlah halaman buku  ");
        jumlahHalaman = input.nextInt();
        System.out.print("Masukkan besaran diskon (dalam persen)  ");
        besarandis = input.nextDouble();
        
        total = harga * jumlah;
        dis = (total * (besarandis / 100));

        bayar = total - dis;

        System.out.println("Diskon yang Anda dapatkan adalah: " + dis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);


        // Menutup objek Scanner
        input.close();
    }
}